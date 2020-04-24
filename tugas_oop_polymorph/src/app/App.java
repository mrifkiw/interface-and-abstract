package app;

public class App {
    public static void main(String[] args) throws Exception {
        Eagle elang = new Eagle();
        elang.bernafas();
        elang.eatMeat();
        elang.fly();
        elang.layEgg();
        elang.makan();
        /// --------------------------------------///
        System.out.println("------------------------------");
        Ostrich ostrich = new Ostrich();
        ostrich.bernafas();
        ostrich.layEgg();
        /// --------------------------------------///

        System.out.println("------------------------------");
        Whale whale = new Whale();
        whale.bernafas();
        whale.dive();
        whale.breastFeeding();
        whale.makan();
        whale.swim();
        /// --------------------------------------///
        System.out.println("------------------------------");
        Tiger tiger = new Tiger();
        tiger.bernafas();
        tiger.breastFeeding();
        tiger.eatMeat();
        tiger.makan();
        /// --------------------------------------///
        System.out.println("------------------------------");
        Bat bat = new Bat();
        bat.bernafas();
        bat.breastFeeding();
        bat.fly();
        bat.makan();
        /// --------------------------------------///
        System.out.println("------------------------------");
        Penguin penguin = new Penguin();
        penguin.bernafas();
        penguin.dive();
        penguin.eatMeat();
        penguin.layEgg();
        penguin.makan();
        /// --------------------------------------///
    }
}