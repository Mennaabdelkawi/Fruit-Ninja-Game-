package View;

public class SoundOnCommand implements Command {
    Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound=sound;
    }

    @Override
    public void execute() {
        sound.switchon();
    }
}