import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediaPlayerTest {

    private MediaPlayer player;

    @BeforeEach
    void setUp() {
        player = new MediaPlayer();
    }

    @Test
    void testInitialStateIsStopped() {
        assertEquals("Stopped", player.getCurrentState());
    }

    @Test
    void testPauseWhenStoppedDoesNothing() {
        player.pause();
        assertEquals("Stopped", player.getCurrentState());
    }

    @Test
    void testPlaySetsStateToPlaying() {
        player.setCurrentTrack("Bohemian Rhapsody - Queen");
        player.play();
        assertEquals("Playing", player.getCurrentState());
    }

    @Test
    void testNextTrackWhilePlaying() {
        player.setCurrentTrack("Bohemian Rhapsody - Queen");
        player.play();
        player.next();
        player.setCurrentTrack("Hotel California - Eagles");
        assertEquals("Playing", player.getCurrentState());
    }

    @Test
    void testPausePlayback() {
        player.setCurrentTrack("Bohemian Rhapsody - Queen");
        player.play();
        player.pause();
        assertEquals("Paused", player.getCurrentState());
    }

    @Test
    void testPreviousWhilePaused() {
        player.setCurrentTrack("Bohemian Rhapsody - Queen");
        player.play();
        player.pause();
        player.previous();
        assertEquals("Paused", player.getCurrentState());
    }

    @Test
    void testResumePlaybackFromPaused() {
        player.setCurrentTrack("Bohemian Rhapsody - Queen");
        player.play();
        player.pause();
        player.play();
        assertEquals("Playing", player.getCurrentState());
    }

    @Test
    void testStopPlayback() {
        player.setCurrentTrack("Bohemian Rhapsody - Queen");
        player.play();
        player.stop();
        assertEquals("Stopped", player.getCurrentState());
    }
}