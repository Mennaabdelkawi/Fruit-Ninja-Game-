package Controller;

public class Bomb implements  GameObject {

    private int xPosition ;
    private int  yPosition ;
    private double  velocity ;


    Bomb(int xPosition, int yPosition,int velocity) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        this.velocity  = velocity ;
    }
    @Override
    public ObjectType getObjectType() {
        return null;
    }

    @Override
    public int getXPosition() {
        return xPosition ;
    }

    @Override
    public int getYPosition() {
        return yPosition ;
    }

    @Override
    public int getMaxYPosition() {
        return 0;
    }

    @Override
    public double getFallingVelocity() {
        return 0;
    }

    @Override
    public Boolean isSliced() {
        return null;
    }

    @Override
    public Boolean hasMovedOffScreen() {
        return null;
    }

    @Override
    public void slice() {

    }

    @Override
    public void move(double time) {
        yPosition = (int) velocity * (int) time ;
    }

}
