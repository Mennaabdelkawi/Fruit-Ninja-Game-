package Controller;

public class NewGameState implements State {

    int Score ;
    Game FruitNinja ;

    public NewGameState(Game game) {
        FruitNinja= game;
    }

    @Override
    public int scoreCount() {
        return Score ;
    }
}
