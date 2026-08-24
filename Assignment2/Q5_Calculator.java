
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Q5_Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("int + int      : " + calc.add(5, 10));
        System.out.println("float + float  : " + calc.add(5.5f, 2.5f));
        System.out.println("double + double: " + calc.add(3.25, 4.75));
    }
}
