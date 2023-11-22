package org.example;

public abstract class Airsoft {

    protected String nome;
    private int cod;
    private String municao;
    private int carregador;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicao() {
        return municao;
    }

    public void setMunicao(String municao) {
        this.municao = municao;
    }

    public int getCarregador() {
        return carregador;
    }

    public void setCarregador(int carregador) {
        this.carregador = carregador;
    }

    public abstract String colocarMira();

    public abstract String verificaCod();

    public String getInfoAirsoft() {
        return "{" +
                "Nome=" + this.nome +
                ", Municao='" + this.municao + '\'' +
                ", Carregador=" + this.carregador +
                ", cod=" + this.cod +
                '}';
    }
}