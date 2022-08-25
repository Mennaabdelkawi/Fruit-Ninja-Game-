package Controller;

public class DefaultGameState implements State {


    Game FruitNinja ;

    Special1 Special1 ;
    Special2 Special2 ;
    int Score ;

    public DefaultGameState(Game game) {

        FruitNinja = game ;
    }

    @Override
    public int scoreCount() {
        if(ObjectType.FRUIT.equals(Special1))
        {
            return Score+=5 ;
        }

        else if(ObjectType.FRUIT.equals(Special2)){

            return Score +=10 ;
        }
        else
            return Score++ ;
    }
}
