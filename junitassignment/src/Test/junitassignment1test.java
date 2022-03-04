package Test;

import main.InsufficientBalanceException;
import main.junitassignment1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class junitassignment1test {
    @Test
    void Withdraw() throws InsufficientBalanceException {
        assertThrows(InsufficientBalanceException.class,() -> junitassignment1.withdraw(800));
        assertEquals(500, junitassignment1.withdraw(100));
        System.out.println(junitassignment1.withdraw(100));
    }

}