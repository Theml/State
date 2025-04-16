class MediaPlayer {
    private PlayerState state;
    private String currentTrack;
    
    public MediaPlayer() {
        this.state = new StoppedState();
        this.currentTrack = "No track selected";
    }
    
    public void setState(PlayerState state) {
        this.state = state;
    }
    
    public void setCurrentTrack(String track) {
        this.currentTrack = track;
        System.out.println("Current track: " + track);
    }
    
    public void play() {
        state.play(this);
    }
    
    public void pause() {
        state.pause(this);
    }
    
    public void stop() {
        state.stop(this);
    }
    
    public void next() {
        state.next(this);
    }
    
    public void previous() {
        state.previous(this);
    }
    
    public String getCurrentState() {
        return state.getStateName();
    }
    
    public String getCurrentTrack() {
        return currentTrack;
    }
}
