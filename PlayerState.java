interface PlayerState {
    void play(MediaPlayer player);
    void pause(MediaPlayer player);
    void stop(MediaPlayer player);
    void next(MediaPlayer player);
    void previous(MediaPlayer player);
    String getStateName();
}