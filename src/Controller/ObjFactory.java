package Controller;

public class ObjFactory {


    public static  GameObject getShape (ObjectType type , int xPosition , int yPosition , int velocity ,int MaxYPosition) {


        switch (type) {
            case FRUIT:

                return new Fruit( xPosition, yPosition  ,velocity , MaxYPosition);


            case Bomb:

                return new Bomb(xPosition , yPosition , velocity );

            default:
                throw new IllegalArgumentException(type.name());

        }
    }

}


