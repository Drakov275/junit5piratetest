import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PirateTest {

    @Test
    void testPirateName() {
        Pirate pirate = new Pirate("Blackbeard");
        assertEquals("Blackbeard", pirate.getName());
    }

    @Test
    void testPirateTreasure() {
        Pirate pirate = new Pirate("Captain Kidd");
        pirate.addTreasure(1000);
        assertEquals(1000, pirate.getTreasure());
    }

    @Test
    void testPiratePlunder() {
        Pirate pirate = new Pirate("Calico Jack");
        pirate.addTreasure(500);
        pirate.plunder(200);
        assertEquals(300, pirate.getTreasure());
    }

    @Test
    void testPirateParrot() {
        Pirate pirate = new Pirate("Long John Silver");
        pirate.setParrot("Polly");
        assertEquals("Polly", pirate.getParrot());
    }
}
