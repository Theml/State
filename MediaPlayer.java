class MediaPlayer {
    private String name;
    private PlayerState state;
    
    public MediaPlayer() {
        this.state = PlayingState.getInstance()
    }

    public void setState(PlayerState state){
        this.state = state;
    }

    public boolean playing() {
        return state.playing(this)
    }

    public boolean paused() {
        return state.paused(this)
    }

    public boolean stopped() {
        return state.stopped(this)
    }

    public String getStateName() {
        return state.getState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name
    }
    
    public PlayerState getState(){
        return 
    }
}
