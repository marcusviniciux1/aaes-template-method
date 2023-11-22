package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SniperTest {
    @Test
    void deveRetonarAirsoftRegistrada() {
        Sniper airsoft = new Sniper();
        airsoft.setNome("M40");
        airsoft.setCod(4);
        assertEquals("Airsoft registrada", airsoft.verificaCod());
    }

    @Test
    void deveRetonarAirsoftNaoRegistrada() {
        Sniper airsoft = new Sniper();
        airsoft.setNome("M24");
        airsoft.setCod(50);
        assertEquals("Airsoft nao registrada", airsoft.verificaCod());
    }

    @Test
    void deveRetornarInfoAirsoft() {
        Sniper airsoft = new Sniper();
        airsoft.setCod(0);
        airsoft.setMunicao("Esfera 6mm");
        airsoft.setNome("M40");
        airsoft.setCarregador(20);
        assertEquals("{Nome=M40, Municao='Esfera 6mm', Carregador=20, cod=0}", airsoft.getInfoAirsoft());
    }
}