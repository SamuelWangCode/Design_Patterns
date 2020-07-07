package tongji.wxt.Chain_of_Reaposibility.AnnualCardService;


/**
 * 无限年卡处理者
 * 仅处理无限年卡（等级3）的客户
 */
public class AllDaysHandler extends Handler {
    /**
     * 提供服务函数
     * 若客户为该类所能处理的级别（等级3），则提供该级别的服务
     * 由于该级别为本条责任链的最后一个级别，该级别不能处理的情况本条责任链均无法处理
     * 所有调用其他处理方式或直接输出
     * @param customer  待处理客户
     */
    @Override
    public void ProvideService(Customer customer) {
        if (this.getLevel(customer) == 3){
            this.AllDaysService();
        }
        else{
            if (this.nextHandler != null)
                this.nextHandler.ProvideService(customer);
            else    this.TryOtherService();

        }
    }

    /**
     * 无限年卡（等级3）提供的服务
     */
    private void AllDaysService(){
        System.out.println(descStr + " AllDaysService : 尊敬的客人您好，欢迎来到迪士尼乐园，您的年卡为全日无限年卡，将享受到下列福利……");
    }

    /**
     * 不是年卡用户，不属于本条责任链的处理范围
     */
    private void TryOtherService(){
        System.out.println(descStr + "TryOtherService : 您不是年卡用户，请从门票入口进入，谢谢！");
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
