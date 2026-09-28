package pkgA;

public class AccessDemo {
    public void publicMethod() {
        System.out.println("Public method is accessible.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method is accessible to a subclass.");
    }

    void defaultMethod() {
        System.out.println("Default method is accessible only inside pkgA.");
    }
}
