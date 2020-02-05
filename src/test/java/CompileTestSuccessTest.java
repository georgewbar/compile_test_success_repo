import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompileTestSuccessTest {

    @Test
    void testGetTrue() {
        CompileTestSuccess cts = new CompileTestSuccess();
        assertTrue(cts.getTrue());
    }

}