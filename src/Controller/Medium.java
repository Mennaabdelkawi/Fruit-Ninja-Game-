package Controller;

public class Medium implements  GameActions {


    int Count ;

    @Override
    public int setCount(int count) {
        this.Count = count ;
        return count+=15 ;
    }
}
