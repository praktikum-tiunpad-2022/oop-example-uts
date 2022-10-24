/*
berikut adalah contoh super class dari Ship yaitu Vehicle
*/
public abstract class Vehicle {
    protected String type;

    protected Vehicle(String type) {
        this.type = type;
    }

    protected abstract void move();
}
