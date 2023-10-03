public class Hangar {

    public static void main(String[] args) {
        Car dacia = new Car("Dacia", 91000);
        Boat nautitech = new Boat("Nautitech", 20000);

        System.out.println(dacia.doStuff());
        System.out.println(nautitech.doStuff());
    }

}