class PlayingState implements PlayerState {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Pausing playback.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping playback.");
        player.setState(new StoppedState());
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Playing next track.");
        // Logic to play next track would go here
    }

    @Override
    public void previous(MediaPlayer player) {
        System.out.println("Playing previous track.");
        // Logic to play previous track would go here
    }

    @Override
    public String getStateName() {
        return "Playing";
    }
}