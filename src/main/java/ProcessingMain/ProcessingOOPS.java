package ProcessingMain;

import processing.core.PApplet;

public class ProcessingOOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NOFCIRCLES = 4;
    public static final int DIAMETER = 10;

    public Circle ci[] = new Circle[NOFCIRCLES];


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
        for (int i = 0; i < NOFCIRCLES; i++) {
           ci[i].setCircle();
            drawCircle(i);
        }
    }

    private void drawCircle(int i) {
        ellipse(ci[i].getThePosX(), ci[i].getThePosY() , ci[i].getTheDiameter(), ci[i].getTheDiameter());
    }

    private void CircleSetup() {
        for (int i = 0; i < NOFCIRCLES; i++)
            ci[i] = new Circle(WIDTH, getPosY(i), DIAMETER, i+1);
    }

    private int getPosY(int i) {
        return (i + 1) * HEIGHT / 5;
    }
}
