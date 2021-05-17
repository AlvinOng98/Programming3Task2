import java.awt.*;

public class MotorBike extends  Car{
    MotorBike(Road road){
        super(road);
        width = 15;
        height = 7;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(xPos, yPos, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(yPos, xPos, height, width);
    }}

