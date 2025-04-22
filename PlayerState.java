abstract class PlayerState {
    public abstract String getStateName();

    public boolean playing(MediaPlayer mediaPlayer){
        return false;
    }

    public boolean stopped(MediaPlayer mediaPlayer){
        return false;
    }

    public boolean paused(MediaPlayer mediaPlayer) {
        return false;
    }
    String getStateName();
}