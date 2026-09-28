interface Printable{
    void print();
}
class Document implements Printable{
    public void print(){
        System.out.println("Printing a Document...");
    }
}
class Image implements Printable{
    public void print(){
        System.out.println("Printing an Image...");
    }
}
class Print{
    public static void main(String[] args) {
        Document o = new Document();
        Image i = new Image();
        o.print();
        i.print();
    }
}