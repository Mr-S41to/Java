package contribuintes;

public class PessoaJuridica extends Pessoa{

    private int numFuncionarios;

    public PessoaJuridica (String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }
}
