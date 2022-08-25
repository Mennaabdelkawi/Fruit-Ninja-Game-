package Controller;

public class Hard implements GameActions {

    int Count ;
    @Override
    public int  setCount(int count) {
        this.Count=count ;
        return count+=30 ;
    }
}
