package app;

public class Penguin extends Birds implements Aquatic, Carnivorous{
    public void swim(){
        System.out.println("penguin berenang...");
    }

    public void dive(){
        System.out.println("penguin nyelemm.. cuyy");
    }

    public void eatMeat(){
        System.out.println("penguin makan daging ikan..");
    }
}