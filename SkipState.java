class SkipState implements PlayerState {
    private SkipState() {};
    private static SkipState instance = new SkipState();
    public static SkipState getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Skip";
    }

    public boolean paused(MediaPlayer mediaPlayer){
        mediaPlayer.setState(PausedState.getInstance());
        return true;
    }

    public boolean stopped(MediaPlayer mediaPlayer){
        mediaPlayer.setState(StoppedState.getInstance());
        return true;
    }

    public boolean playing(MediaPlayer mediaPlayer){
        mediaPlayer.setState(PlayingState.getInstance())
        return true;
    }
}