package tongji.wxt.Chain_of_Reaposibility.AnnualCardService;

/**
 * 周日年卡处理者
 * 仅处理周日年卡客户（等级1）
 */
public class SundayCardHandler extends Handler {

    /**
     * 提供服务函数
     * 若客户为该类所能处理的级别（等级1），则提供该级别的服务
     * 否则沿责任链向下传递，调用下一个级别（等级2）的提供服务函数
     * @param customer  待处理客户
     */
    @Override
    public void ProvideService(Customer customer) {
        if (this.getLevel(customer) == 1){
            this.SundayCardService();
        }
        else{
            if(this.nextHandler != null)
                this.nextHandler.ProvideService(customer);
        }
    }

    /**
     * 周日年卡（等级1）提供的服务
     */
    private void SundayCardService(){
        System.out.println(descStr + "SundayCardService : 尊敬的客人您好，欢迎来到迪士尼乐园，您的年卡为周日年卡，将享受到下列福利……");
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
