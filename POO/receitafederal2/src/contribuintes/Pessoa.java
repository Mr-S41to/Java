package contribuintes;

public abstract class Pessoa {

    protected String nome;
    protected double rendaAnual;

    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

}
