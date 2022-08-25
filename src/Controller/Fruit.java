package Controller;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Fruit implements GameObject {

    private int xPosition ;
    private int  yPosition ;
    private double  velocity ;
    private  int MaxYPosition ;


    Fruit(int xPosition, int yPosition,int velocity, int MaxPosition) {
        this.yPosition = yPosition;
        this.xPosition = xPosition;
        this.velocity  = velocity ;
        this.MaxYPosition = MaxPosition ;
    }




    @Override
    public ObjectType getObjectType() {
        return ObjectType.FRUIT;
    }

    @Override
    public int getXPosition() {

        return xPosition;
    }

    @Override

    public int getYPosition() {

        return yPosition;
    }

    @Override
    public int getMaxYPosition() {
        return MaxYPosition ;
    }

    @Override
    public double getFallingVelocity() {
        return  velocity ;
    }

    @Override
    public Boolean isSliced() {
        /*if(slice())
        {

        }*/
        return  false;
    }

    @Override
    public Boolean hasMovedOffScreen() {
        return null;
    }

    @Override
    public void slice() {
        throw new NotImplementedException();
    }

    /*
    *it is used to move the object on the screen
    @param deltaTime: time elapsed since the object is thrown
    it is used calculate the new position of
    fruit object.
    */
    @Override
    public void move(double time) {

        yPosition =(int)velocity * (int)time ;

    }

}
