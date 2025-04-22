import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediaPlayerTest {

    MediaPlayer player;

    @BeforeEach
    public void setUp() {
        player = new MediaPlayer();
    }

    @Test
    public void testMustStopPlayer() {
        player.setState(PlayingState.getInstance());
        assertTrue(player.stopped());
        assertEquals(StoppedState.getInstance(), player.getState());
    }

    @Test
    public void testMustPlayPlayer() {
        player.setState(PausedState.getInstance());
        assertTrue(player.playing());
        assertEquals(PlayingState.getInstance(), player.getState());
    }

    @Test
    public void testMustPausePlayer() {
        player.setState(PlayingState.getInstance());
        assertTrue(player.paused());
        assertEquals(PausedState.getInstance(), player.getState());
    }

    @Test
    public void testeMustSkipPlayer() {
        player.setState(PausedState.getInstance());
        assertTrue(player.skip());
        assertEquals(SkipState.getInstance(), player.getState());
    }
}