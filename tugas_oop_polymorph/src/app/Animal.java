package app;

public abstract class Animal {
    private String respire = "bernafas" ;
    private String eat = "makan";

    public void makan(){
        System.out.println("mmmhhmm.." + this.eat);
    }

    public void bernafas(){
        System.out.println("ehhmmm ahhh" + this.respire);
    }

}