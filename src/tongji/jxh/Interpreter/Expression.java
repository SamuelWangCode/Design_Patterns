package tongji.jxh.Interpreter;

// Basic element of syntax
public interface Expression {
    int interpret(Menu menu)throws InterruptedException;
}
