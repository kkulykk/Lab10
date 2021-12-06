package builder;

import chain.ATM;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ATM atm;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(out));
        atm = new ATM();
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void builderTest() {
        atm.process(125);
        assertTrue(out.toString().contains("Please, receive 1 of 5 UAH bills."));
        assertTrue(out.toString().contains("Please, receive 0 of 10 UAH bills."));
        assertTrue(out.toString().contains("Please, receive 6 of 20 UAH bills."));
    }

}