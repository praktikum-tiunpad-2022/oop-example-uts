/*
berikut adalah contoh class Ship dengan parent class dan interface
*/
public class Ship extends Vehicle implements Travel {
    // enkapsulasi
    private String name;

    public Ship(String name) {
        super("ship");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // override super class
    @Override
    public void departure() {
        System.out.println("The " + name + " " + type + " has departed!");
        move();
    }

    @Override
    public void arrival() {
        System.out.println("The " + name + " " + type + " has arrived safely!");
    }

    @Override
    protected void move() {
        System.out.println("The " + name + " " + type + " is moving in the ocean!");
    }
}