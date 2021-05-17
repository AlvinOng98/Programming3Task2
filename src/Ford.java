import java.awt.*;

public class Ford extends Car{
    Ford(Road road){
        super(road);
        width = 30;
        height = 12;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(xPos, yPos, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(yPos, xPos, height, width);
    }
}
