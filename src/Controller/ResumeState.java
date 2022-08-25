package Controller;

public class ResumeState implements State {
    Game FruitNinja ;
    private int Score ;

    public ResumeState(Game game) {
        FruitNinja = game ;
    }


    @Override
    public int scoreCount() {
        this.Score = Score ;
        return Score ;
    }
}
