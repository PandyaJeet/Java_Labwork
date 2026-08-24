
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

class Image implements Printable {
    public void print() {
        System.out.println("Printing image...");
    }
}

public class Q20_Interface {
    public static void main(String[] args) {
        Document d = new Document();
        Image i = new Image();

        d.print();
        i.print();
    }
}
