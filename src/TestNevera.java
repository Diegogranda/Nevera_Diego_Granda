import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestNevera {
    @Test
    public void testNevera() {
        Nevera nevera = new Nevera();
        nevera.put("NUBES");
        nevera.put("REGALICES");
        assertTrue(nevera.contains("REGALICES"));
        assertFalse(nevera.contains("MORAS"));

        try {
            nevera.take("OSOS HARIBO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
