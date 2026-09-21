
public class Calculator {

    public Calculator() {
    }

    public float add(float n1, float n2) {
        return n1 + n2;
    }

    public float subtract(float n1, float n2) {
        return n1 - n2;
    }

    public float divide(float n1, float n2) {
        if (n2 == 0) {
        }
        return n1 / n2;
    }

    public float multiply(float n1, float n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.subtract(1, 3));
    }
}
