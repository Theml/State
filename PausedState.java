class PausedState implements PlayerState {
    private PausedState() {};
    private static PausedState instance = new PausedState();
    public static PausedState getInstance() {
        return instance;
    }

    public String getStateName() {
        return "Paused";
    }

    public boolean stopped(MediaPlayer mediaPlayer){
        mediaPlayer.setState(StoppedState.getInstance());
        return true;
    }

    public boolean playing(MediaPlayer mediaPlayer){
        mediaPlayer.setState(PlayingState.getInstance())
        return true;
    }

    public boolean skip(MediaPlayer mediaPlayer){
        mediaPlayer.setState(SkipState.getInstance());
        return true;
    }
}

