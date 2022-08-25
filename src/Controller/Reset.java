package Controller;

public class Reset implements State {

    Game FruitNinja ;


    int Score ;

    public Reset(Game game) {
        FruitNinja =  game ;
    }

    @Override
    public int scoreCount() {
        return Score =  0 ;
    }
}
