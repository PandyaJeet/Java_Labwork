class ConstantValues {
    final int VALUE = 10;

    final void show() {
        System.out.println("Value = " + VALUE);
        VALUE = 100;
    }
}
//The final Keyword in Java restricts users from reassigning variables, overriding methods, or extending classes
class Test extends ConstantValues {
    void show() {
        System.out.println("Hello");
    }
}

