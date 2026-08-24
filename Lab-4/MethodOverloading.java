import java.util.Scanner;

class Calculator{
    public int add(int a , int b ){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
}
class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner n = new Scanner(System.in);
        System.out.print("Which data type to use ? \n1.INT\n2.FLOAT\n3.DOUBLE\nChoice : ");
        int c = n.nextInt();
        switch (c) {
            case 1:
                System.out.print("Enter value of A : ");
                int a = n.nextInt();
                System.out.print("Enter value of B : ");
                int b = n.nextInt();
                int result = obj.add(a,b);
                System.out.println("Result : " + result);
                break;
            case 2:
                System.out.print("Enter value of A : ");
                float a1 = n.nextFloat();
                System.out.print("Enter value of B : ");
                float b1 = n.nextFloat();
                float result1 = obj.add(a1,b1);
                System.out.println("Result : " + result1);
                break;
            case 3:
                System.out.print("Enter value of A : ");
                double a2 = n.nextDouble();
                System.out.print("Enter value of B : ");
                double b2 = n.nextDouble();
                double result2 = obj.add(a2,b2);
                System.out.println("Result : " + result2);
                break;
            default:
                System.out.println("Invalid Choice !!!");
                break;
        }
    }
}
