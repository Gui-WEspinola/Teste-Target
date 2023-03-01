package application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static application.QuintaQuestao.inverterString;
import static org.junit.jupiter.api.Assertions.*;

class QuintaQuestaoTest {

    @Test
    @DisplayName("Deve inverter e retornar uma string")
    void inverterStringTest() {
        assertEquals("87654321", inverterString("12345678"));
        assertEquals("tegrat ad etset odnezaF", inverterString("Fazendo teste da target"));
    }
}