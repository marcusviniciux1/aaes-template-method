package org.example;

public class Rifle extends Airsoft {
    @Override
    public String colocarMira() {
        return "Red Dot";
    }

    @Override
    public String verificaCod() {
        if (this.getCod() >= 5 && this.getCod() <= 9) {
            return "Airsoft registrada";
        } else {
            return "Airsoft nao registrada";
        }
    }
}