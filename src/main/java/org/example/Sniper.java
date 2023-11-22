package org.example;

public class Sniper extends Airsoft {
    @Override
    public String colocarMira() {
        return "4x";
    }

    @Override
    public String verificaCod() {
        if (this.getCod() >= 0 && this.getCod() <= 4) {
            return "Airsoft registrada";
        } else {
            return "Airsoft nao registrada";
        }
    }
}