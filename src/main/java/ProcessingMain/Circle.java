package ProcessingMain;

import processing.core.PApplet;

public class Circle extends PApplet {
    private int posX, posY, diameter, index;

    public static int deg=0;

    public int getThePosX(){
        this.posX = deg * index;
        return this.posX;
    }

    public int getThePosY(){
        return this.posY;
    }

    public int getTheDiameter(){
        return this.diameter;
    }

    Circle(int posX, int posY, int diameter, int index){
        this.posX = posX;
        this.posY = posY;
        this.diameter = diameter;
        this.index = index;
    }

    public static void displace(){
        deg++;
    }

    public void setCircle(){
        this.posX = deg*this.index;
    }
}
