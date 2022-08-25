package View;

public class SoundOffCommand implements Command {
    Sound sound;

    public SoundOffCommand(Sound sound) {
        this.sound=sound;
    }

    @Override
    public void execute() {
        sound.switchoff();
    }
}