package tongji;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    private static ArrayList<Class<?>> allClasses = new ArrayList<>();
    private static Hashtable<String, ArrayList<DPDemoWithAuthor>> dp2DpDemoWithClasses = new Hashtable<>();
    private static HashMap<String, String> shortName2RealName = new HashMap<String, String>(){
        {
            put("yzc", "杨紫超");
            put("wjj", "魏敬杰");
            put("wxz", "王星洲");
            put("wxt", "王笑天");
            put("yy", "杨宇");
            put("ljn", "李佳诺");
            put("dyj", "邓英杰");
            put("yzt", "严祯颋");
            put("zyd", "周宇东");
            put("jxh", "江宵汉");
        }
    };
    private static HashMap<String, Integer> dpName2Index = new HashMap<>();
    private static HashMap<Integer, String> index2DpName = new HashMap<>();
    private static int introductionLineLength = 100;

    /**
     * 进行测试的外部接口
     */
    public static void test() {
        try{
            init();
            startTest();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印进行测试的设计模式的介绍
     */
    private static void printIntroduction() {
        StringBuilder introductionBuilder = new StringBuilder();
        for(int i=0;i<introductionLineLength;i++){
            introductionBuilder.append("*");
        }
        introductionBuilder.append('\n');
        Iterator<Map.Entry<String, ArrayList<DPDemoWithAuthor>>> iter = dp2DpDemoWithClasses.entrySet().iterator();
        for (int i = 0; i < dp2DpDemoWithClasses.entrySet().size(); i++) {
            String dpName = iter.next().getKey();
            dpName2Index.put(dpName, i + 1);
            index2DpName.put(i + 1, dpName);
            buildIntroductionLine(introductionBuilder, dp2DpDemoWithClasses.get(dpName));
            introductionBuilder.append('\n');
        }
        for(int i=0;i<introductionLineLength;i++){
            introductionBuilder.append("*");
        }
        introductionBuilder.append('\n');
        System.out.println(introductionBuilder.toString());
    }

    /**
     * 内部方法，开始进行测试
     */
    private static void startTest(){
        System.out.println("开始测试迪士尼乐园设计模式。输入q退出。");
        while(true){
            System.out.println();
            printIntroduction();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要测试的模式以及样例号码：(例子：1 1 代表测试模式1，第一个样例)");
            String input = scanner.nextLine();
            if(input.equals("q")){
                break;
            }
            input = input.trim();
            String pattern = "^(\\d*?) (\\d*?)$";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(input);
            if(!m.find()){
                System.out.println("输入格式有误，请重新输入。");
                continue;
            }
            int patternIndex = Integer.parseInt(m.group(1));
            int exampleIndex = Integer.parseInt(m.group(2));
            String dpName = index2DpName.get(patternIndex);
            if(dpName == null){
                System.out.println("设计模式号码不存在，请重新输入。");
                continue;
            }
            ArrayList<DPDemoWithAuthor> dpDemoWithAuthors = dp2DpDemoWithClasses.get(dpName);
            if(exampleIndex < 1 || exampleIndex > dpDemoWithAuthors.size()){
                System.out.println("样例号码不存在，请重新输入。");
                continue;
            }
            DPDemoWithAuthor dpDemoWithAuthor = dpDemoWithAuthors.get(exampleIndex - 1);
            try{
                dpDemoWithAuthor.doTest();
            }catch (Exception e){
                e.printStackTrace();
            }
            boolean ifContinue;
            while(true){
                System.out.println("是否继续？ (y/n)");
                String choice = scanner.nextLine();
                if(choice.toLowerCase().equals("y")){
                    ifContinue = true;
                    break;
                }else if(choice.toLowerCase().equals("n")){
                    ifContinue = false;
                    break;
                }
            }
            if(!ifContinue){
                break;
            }
        }
    }

    /**
     * 建立介绍的一行，包括设计模式名，以及对应的几种实现。
     * @param builder
     * @param dpDemoWithAuthors
     */
    private static void buildIntroductionLine(StringBuilder builder, ArrayList<DPDemoWithAuthor> dpDemoWithAuthors) {
        builder.append("*");
        StringBuilder innerLineBuilder = new StringBuilder("模式"
                + dpName2Index.get(dpDemoWithAuthors.get(0).getDpName()));
        while(innerLineBuilder.length() < 6){
            innerLineBuilder.append(' ');
        }
        innerLineBuilder.append("：" + dpDemoWithAuthors.get(0).getDpName());
        while(innerLineBuilder.length() < 50){
            innerLineBuilder.append(' ');
        }
        for (int i = 0; i < dpDemoWithAuthors.size(); i++) {
            DPDemoWithAuthor dpDemoWithAuthor = dpDemoWithAuthors.get(i);
            String inner = " 样例" + (i+1) + "(作者：" + dpDemoWithAuthor.getAuthorName() + ") ";
            innerLineBuilder.append(inner);
        }
        builder.append(innerLineBuilder);
    }

    /**
     * 内部包扫描器，用于外部包扫描的方法。
     * @param curFile
     * @param packName
     */
    private static void packetScanner(File curFile, String packName){
        if (!curFile.isDirectory()) {
            return;
        }
        File[] files = curFile.listFiles();
        for(File file : files) {
            if (file.isFile() && file.getName().endsWith(".class")) {
                String fileName = file.getName().replace(".class", "");
                String className = packName + "." + fileName;
                try {
                    Class<?> klass = Class.forName(className);
                    allClasses.add(klass);
                    //System.out.println(klass);
                    //
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }else if(file.isDirectory()) {
                packetScanner(file, packName + "." + file.getName());
            }
        }
    }

    /**
     * 进行包扫描的外部方法。
     * @param packetName
     */
    private static void scanPacket(String packetName) {
        String packetPath = packetName.replace(".", "/");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            Enumeration<URL> resources = classLoader.getResources(packetPath);
            while(resources.hasMoreElements()) {
                URL url = resources.nextElement();
                if (url.getProtocol().equals("jar")) {
                    throw new IOException("no jar");
                } else {
                    File file = new File(url.toURI());
                    if (!file.exists()) {
                        continue;
                    }
                    packetScanner(file, packetName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化方法。
     * @throws Exception
     */
    private static void init() throws Exception{
        scanPacket("tongji");
        for (int i = 0; i < allClasses.size(); i++) {
            Class<?> klass = allClasses.get(i);
            String klassWholeName = klass.getName();
            String pattern = "tongji\\.(.*?)\\.(.*?)\\..*";
            Pattern r = Pattern.compile(pattern);
            Matcher matcher = r.matcher(klassWholeName);
            if(!matcher.find()){
                //System.out.println(klassWholeName);
                //System.out.println("matcher 匹配失败");
                continue;
            }
            String authorShortName = matcher.group(1);
            String patternName = matcher.group(2);
            try{
                klass.getMethod("test");
                ArrayList<DPDemoWithAuthor> dpDemoWithAuthors = dp2DpDemoWithClasses.get(patternName);
                if(dpDemoWithAuthors == null){
                    dpDemoWithAuthors = new ArrayList<>();
                    dp2DpDemoWithClasses.put(patternName, dpDemoWithAuthors);
                }
                //classes.add(klass);
                dpDemoWithAuthors.add(new DPDemoWithAuthor(authorShortName, patternName, klass));
            }catch (NoSuchMethodException e){
                //
            }
        }
//        HashMap<String, ArrayList<String>> people2Dps = new HashMap<>();
//        dp2DpDemoWithClasses.entrySet().forEach((dp)->{
//            String dpName = dp.getKey();
//            ArrayList<DPDemoWithAuthor> dpDemoWithAuthors = dp.getValue();
//            for (DPDemoWithAuthor dpDemoWithAuthor : dpDemoWithAuthors) {
//                if(people2Dps.get(dpDemoWithAuthor.getAuthorName()) == null){
//                    people2Dps.put(dpDemoWithAuthor.getAuthorName(), new ArrayList<>());
//                }
//                ArrayList<String> peoplesDps = people2Dps.get(dpDemoWithAuthor.getAuthorName());
//                peoplesDps.add(dpName);
//            }
//        });
//        people2Dps.forEach((people, dps)->{
//            System.out.print(people);
//            dps.forEach((dp) -> {
//                System.out.print(" " + dp + " ");
//            });
//            System.out.println();
//        });
    }

    /**
     * 内部类，封装了作者名，实现的设计模式名，以及真正使用到的Demo类。
     */
    static class DPDemoWithAuthor{
        private String authorShortName;
        private String dpName;
        private Class<?> demoClass;


        DPDemoWithAuthor(String authorName, String dpName, Class<?> demoClass) {
            this.authorShortName = authorName;
            this.dpName = dpName;
            this.demoClass = demoClass;
        }

        void doTest() throws Exception{
            try{
                Method m = demoClass.getMethod("test");

                System.out.println("============正在测试：" + dpName + " 作者：" + shortName2RealName.get(getAuthorShortName()) + "============");
                m.invoke(null);
                System.out.println("============测试：" + dpName + " 结束" + "======================");
            }catch (NoSuchMethodException e){
                throw new Exception("Test Method doesn't exists.");
            }
        }

        String getDpName() {
            return dpName;
        }

        String getAuthorShortName() {
            return authorShortName;
        }

        String getAuthorName(){
            return shortName2RealName.get(authorShortName);
        }
    }


}
