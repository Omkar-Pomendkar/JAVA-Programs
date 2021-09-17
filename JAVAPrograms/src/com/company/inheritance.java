package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print(){
        System.out.println("I am a Constructor");
    }

}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Derived d = new Derived();
        d.setX(10);
        d.getX();
        System.out.println(d.getX());
    }

}
