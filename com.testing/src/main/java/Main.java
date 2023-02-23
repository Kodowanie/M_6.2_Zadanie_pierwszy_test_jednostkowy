import calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(10, 5);

        int add = calculator.Add();
        int subtract = calculator.Subtract();

        System.out.println("check 1_Method add test: " + add);
        System.out.println("check 1_Method subtract: " + subtract);

        System.out.println("check 2_Method add test: " + calculator.Add());
        System.out.println("check 2_Method subtract: " + calculator.Subtract());

    }
}
