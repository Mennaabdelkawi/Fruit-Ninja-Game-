package Controller;

public class Game {

    private State state;
    private int score ;

    State resume ;
    State reset;
    State newGame  ;
    State defaultGame ;

    public Game() {
        resume = new ResumeState(this);
        reset = new Reset (this);
        newGame = new NewGameState(this);
        defaultGame = new DefaultGameState(this) ;

        state = newGame ;

        if(score == 0)
        {
            state = reset ;
        }

    }

    public void setState(State newState) {
        newState  = state;

    }

    public void  scoreCount() {

        state.scoreCount();

    }



    public State ResumeState () { return resume; }

    public State Reset() { return  reset; }

    public State NewGame () { return  newGame; }

    public State DefaultGameState () { return defaultGame; }

}
