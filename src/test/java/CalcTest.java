import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void comp() {
        assertEquals(45, new Calc().comp("5*9"));
    }
}