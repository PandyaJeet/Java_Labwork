package pkgB;

import pkgA.AccessDemo;

public class AccessTest extends AccessDemo {
    public void testAccess() {
        publicMethod();
        protectedMethod();
        // defaultMethod(); does not compile because it belongs to package pkgA.
    }

    public static void main(String[] args) {
        new AccessTest().testAccess();
        System.out.println("Default method cannot be accessed from pkgB.");
    }
}
