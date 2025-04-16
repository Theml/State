class PausedState implements PlayerState {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping playback.");
        player.setState(new StoppedState());
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Cannot skip while paused. Resume playback first.");
    }

    @Override
    public void previous(MediaPlayer player) {
        System.out.println("Cannot go back while paused. Resume playback first.");
    }

    @Override
    public String getStateName() {
        return "Paused";
    }
}

