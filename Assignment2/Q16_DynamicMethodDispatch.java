
class Appliance {
    void operate() {
        System.out.println("Appliance is operating");
    }
}

class WashingMachine extends Appliance {
    void operate() {
        System.out.println("Washing machine is washing clothes");
    }
}

public class Q16_DynamicMethodDispatch {
    public static void main(String[] args) {
        Appliance a;

        a = new Appliance();
        a.operate();

        a = new WashingMachine();
        a.operate();
    }
}
