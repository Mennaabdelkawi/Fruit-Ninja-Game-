package View;

public class Control {
    private Command command;

    public void SetCommand(Command command)
    {this.command=command;}
    public void PressOnButton()
    {
        command.execute();
    }
}