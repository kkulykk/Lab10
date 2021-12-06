package builder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    User user;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(out));
        user = User.builder()
                .firstName("Roman")
                .lastName("Kulyk")
                .age(19)
                .weight(60)
                .gender("Male")
                .job("Student")
                .job("Developer")
                .build();
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void builder() {
    }

    @Test
    public void toStringTest() {
        System.out.println(user);
        assertTrue(out.toString().contains("User(firstName=Roman, lastName=Kulyk, occupation=[Student, Developer], gender=Male, age=19, weight=60"));
    }

}