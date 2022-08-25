package Controller;


public interface GameObject {
    public ObjectType getObjectType();

    public int getXPosition();

    public int getYPosition();

    public int getMaxYPosition();

    public double getFallingVelocity();

    public Boolean isSliced();

    public Boolean hasMovedOffScreen();

    public void slice();

    public void move(double time);

}
