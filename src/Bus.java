import java.awt.*;

public class Bus extends Car {
    Bus(Road road){
        super(road);
        width = 90;
        height = 15;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(xPos, yPos, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(yPos, xPos, height, width);
    }}
