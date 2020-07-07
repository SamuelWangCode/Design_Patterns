package tongji.jxh.Interpreter;

public class CommaOperation implements Expression {
    private Expression e1,e2;

    public CommaOperation(Expression e1, Expression e2){
        this.e1=e1;
        this.e2=e2;
    };

    @Override
    public int interpret(Menu menu)throws InterruptedException {
        return e1.interpret(menu)+e2.interpret(menu);
    }
}
