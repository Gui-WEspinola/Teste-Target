package application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static application.SegundaQuestao.verificaFibonacci;
import static org.junit.jupiter.api.Assertions.*;

class SegundaQuestaoTest {

    @Test
    @DisplayName("Deve retornar se um número pertence ao fibonacci")
    void verificaFibonacciTeste() {
        assertTrue(verificaFibonacci(34));
        assertTrue(verificaFibonacci(89));
        assertTrue(verificaFibonacci(55));
        assertTrue(verificaFibonacci(21));
        assertFalse(verificaFibonacci(150));
        assertFalse(verificaFibonacci(1067));
        assertFalse(verificaFibonacci(784));
        assertFalse(verificaFibonacci(6));
    }
}