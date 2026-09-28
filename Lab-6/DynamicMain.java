class Appliance {
    void putData(){
        System.out.println("This is Appliance class");
    }
}
class WashingMachine extends Appliance{
    void putData(){
        System.out.println("This is Washing Machine class");
    }

}
class Dynamic{
    public static void main(String[] args) {
        Appliance a = new WashingMachine();
        a.putData();
        a=new Appliance();
        a.putData();
    }
}