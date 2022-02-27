package ProcessingMain;

import processing.core.PApplet;

public class Circle extends PApplet {
    public static final int FACTOR = 5;
    private int posX, posY, diameter;
    private final int index;
    private ProcessingOOPS reference;

    public static int degree=0;

    public void drawCircle() { this.reference.ellipse(this.posX, this.posY, this.diameter, this.diameter);}

    Circle(int posX, int diameter, int index, int height, ProcessingOOPS reference){
        this.posX = posX;
        this.posY = getPosY(index, height);
        this.diameter = diameter;
        this.index = index;
        this.reference = reference;
    }

    private int getPosY(int index, int height) {
        return index * height / FACTOR;
    }

    public static void displace(){
        degree++;
    }

    public void setNewCircle(){
        this.posX = degree*this.index;
    }
}
