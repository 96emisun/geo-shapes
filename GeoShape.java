
import java.awt.Graphics;

public abstract class GeoShape {

    protected int posX, posY;
    protected double area;
    
    public GeoShape(){
        this.posX = 0;
        this.posY = 0;
        this.area = calcArea();
    }
    
    public abstract double calcArea();
    
    public abstract void drawShape(Graphics g);
    
    public void setPos(int x, int y){
        this.posX = x;
        this.posY = y;
    }
    
}
