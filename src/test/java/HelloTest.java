import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void sayHello() {
        assertEquals("Hello World", new Hello().sayHello());
    }
}