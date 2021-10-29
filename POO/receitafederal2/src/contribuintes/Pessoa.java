package contribuintes;

// Matheus N. Saito - 2020262
// Pedro Wilson Rodrigues de Lima - 2020267

public abstract class Pessoa {

    protected String nome;
    protected double rendaAnual;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return this.nome;
    }

    public double getRendaAnual() {
        return this.rendaAnual;
    }

    public abstract double imposto();

}
