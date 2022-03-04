package Test;

import main.junitassignment2;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Junitassignment2test {
    int a = 10;
    int b = 20;
    @BeforeAll
    static void printd(){
        System.out.println("testing started");
    }
    @AfterEach
    void printc(){
        System.out.println("test case completed");
    }
    @AfterAll
    static void printall(){
        System.out.println("Finished");
    }
    @BeforeEach
    void setUp() {
        System.out.println("Executing test class");
    }
    @Test
    void add() {
        assertEquals(30, junitassignment2.add(a,b));
    }

    @Test
    void sub() {
        assertEquals(-10,junitassignment2.sub(a,b));

    }
}