public class Hangar {

    public static void main(String[] args) {
        Car dacia = new Car("Dacia");
        Boat nautitech = new Boat("Nautitech");

        System.out.println(dacia.doStuff());
        System.out.println(nautitech.doStuff());
    }

}