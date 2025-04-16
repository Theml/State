class StoppedState implements PlayerState {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Starting playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Cannot pause. Nothing is playing.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped.");
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Cannot skip. Nothing is playing.");
    }

    @Override
    public void previous(MediaPlayer player) {
        System.out.println("Cannot go back. Nothing is playing.");
    }

    @Override
    public String getStateName() {
        return "Stopped";
    }
}