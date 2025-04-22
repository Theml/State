class StoppedState implements PlayerState {
    private StoppedState() {};
    private static StoppedState instance = new StoppedState();
    public static StoppedState getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Stopped";
    }

    public boolean paused(MediaPlayer mediaPlayer){
        mediaPlayer.setState(PausedState.getInstance());
        return true;
    }

    public boolean playing(MediaPlayer mediaPlayer){
        mediaPlayer.setState(PlayingState.getInstance());
        return true;
    }

    public boolean skip(MediaPlayer mediaPlayer){
        mediaPlayer.setState(SkipState.getInstance());
        return true;
    }
}