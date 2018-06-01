package Calculate;

public class Model {

    public double calculate(double n1, double n2, String Operator) {

        switch (Operator) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if (n2 == 0) return 0;
                return n1 / n2;
            default:
                return 0;

        }

    }

}
