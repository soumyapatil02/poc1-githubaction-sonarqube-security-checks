package com.soumya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class apptest {

    @Test
    void testGreet() {
        String result = App.greet("Soumya");
        assertEquals("Hello Soumya", result);
    }
}
