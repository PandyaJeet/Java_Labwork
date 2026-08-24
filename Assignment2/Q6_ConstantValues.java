
class ConstantValues {
    final int MAX_VALUE = 100;
    static final String COMPANY_NAME = "TechCorp";

    final void showDetails() {
        System.out.println("Max Value: " + MAX_VALUE);
        System.out.println("Company  : " + COMPANY_NAME);
    }
}

// Trying to override a final method causes a compile-time error.
// Uncommenting the class below fails with:
// "showDetails() in Sub cannot override showDetails() in ConstantValues; overridden method is final"
/*
class Sub extends ConstantValues {
    void showDetails() {
        System.out.println("Trying to override");
    }
}
*/

public class Q6_ConstantValues {
    public static void main(String[] args) {
        ConstantValues cv = new ConstantValues();
        cv.showDetails();
    }
}
