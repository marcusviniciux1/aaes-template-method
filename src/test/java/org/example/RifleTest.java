package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RifleTest {
    @Test
    void deveRetonarAirsoftRegistrada() {
        Rifle airsoft = new Rifle();
        airsoft.setNome("M4RIS");
        airsoft.setCod(5);
        assertEquals("Airsoft registrada", airsoft.verificaCod());
    }

    @Test
    void deveRetonarAirsoftNaoRegistrada() {
        Rifle airsoft = new Rifle();
        airsoft.setNome("G36");
        airsoft.setCod(30);
        assertEquals("Airsoft nao registrada", airsoft.verificaCod());
    }

    @Test
    void deveRetornarInfoAirsoft() {
        Rifle airsoft = new Rifle();
        airsoft.setCod(5);
        airsoft.setMunicao("Esfera 6mm");
        airsoft.setNome("M4RIS");
        airsoft.setCarregador(340);
        assertEquals("{Nome=M4RIS, Municao='Esfera 6mm', Carregador=340, cod=5}", airsoft.getInfoAirsoft());
    }
}