package calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }


    public int Add(){
        return a + b;
    }

    public int Subtract(){
        return a - b;
    }
}
