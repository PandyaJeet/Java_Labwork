public class Q5_WrapperClasses {
    public static void main(String[] args) {
        int number = 25;
        double price = 99.5;

        Integer boxedNumber = number;
        Double boxedPrice = price;
        int unboxedNumber = boxedNumber;
        double unboxedPrice = boxedPrice;

        System.out.println("Integer object : " + boxedNumber);
        System.out.println("Double object : " + boxedPrice);
        System.out.println("Sum : " + (unboxedNumber + boxedPrice));
        System.out.println("Price after tax : " + (unboxedPrice * 1.18));
    }
}
