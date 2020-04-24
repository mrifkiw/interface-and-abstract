package app;

public class Eagle extends Birds implements Canfly, Carnivorous {
    public void fly(){
        System.out.println("Elang terbang...");
    }
    public void eatMeat(){
        System.out.println("Elang makan daging uler...");
    }
}

