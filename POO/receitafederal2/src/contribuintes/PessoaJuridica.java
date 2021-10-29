package contribuintes;

// Matheus N. Saito - 2020262
// Pedro Wilson Rodrigues de Lima - 2020267

public class PessoaJuridica extends Pessoa{

    private int numFuncionarios;

    public PessoaJuridica (String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return this.numFuncionarios;
    }

    @Override
    public double imposto() {
        if (numFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return  getRendaAnual() * 0.16;
        }
    }
}
