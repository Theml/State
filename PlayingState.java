class PlayingState implements PlayerState {
    private PlayingState() {};
    private static PlayingState instance = new PlayingState();
    public static PlayingState getInstance() {
        return instance;
    }   

    public String getStateName() {
        return "Playing";
    }

    public boolean stopped(MediaPlayer mediaPlayer){
        mediaPlayer.setState(StoppedState.getInstance());
        return true;
    }

    public boolean paused(MediaPlayer mediaPlayer){
        mediaPlayer.setState(PausedState.getInstance())
        return true;
    }

    public boolean skip(MediaPlayer mediaPlayer){
        mediaPlayer.setState(SkipState.getInstance());
        return true;
    }
}