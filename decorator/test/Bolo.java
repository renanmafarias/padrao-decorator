package decorator.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoloTest {

    @Test
    void deveRetornarPrecoBolo() {
        Bolo bolo = new BoloComum(20.0f);

        assertEquals(20.0f, bolo.getPreco());
    }

    @Test
    void deveRetornarPrecoBoloComConfeito() {
        Bolo bolo = new Confeito(new BoloComum(20.0f));

        assertEquals(32.0f, bolo.getPreco());
    }

    @Test
    void deveRetornarPrecoBoloComTema() {
        Bolo bolo = new Tema(new BoloComum(20.0f));

        assertEquals(35.0f, bolo.getPreco());
    }

    @Test
    void deveRetornarPrecoBoloComConfeitoETema() {
        Bolo bolo = new Tema(new Confeito(new BoloComum(20.0f)));

        assertEquals(47.0f, curso.getPreco());
    }
}