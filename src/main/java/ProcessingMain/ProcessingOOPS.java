package ProcessingMain;

import processing.core.PApplet;

public class ProcessingOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBEROFCIRCLES = 4;
    public static final int DIAMETER = 10;

    public Circle ci[] = new Circle[NUMBEROFCIRCLES];


    public static void main(String[] args){
        PApplet.main("ProcessingMain.ProcessingOOPS", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){
        CircleSetup();
    }

    @Override
    public void draw(){
        ci[0].displace();
        drawMethod();
    }

    private void drawMethod() {
        for (int index = 0; index < NUMBEROFCIRCLES; index++) {
           ci[index].setNewCircle();
           ci[index].drawCircle();
        }
    }


    private void CircleSetup() {
        for (int index = 0; index < NUMBEROFCIRCLES; index++)
            ci[index] = new Circle(WIDTH, DIAMETER, index+1, HEIGHT,this);
    }
}
