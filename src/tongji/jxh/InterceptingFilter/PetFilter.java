package tongji.jxh.InterceptingFilter;

public class PetFilter implements Filter {
    private String prefix = "PetFilter (" + this.hashCode()+") : ";

    @Override
    public void execute(Visitor visitor) throws InterruptedException{
        System.out.println(prefix+"execute: No pets, please!");
        Thread.sleep(1000);
        visitor.removeBelonging("pet");
    }
}
