package contribuintes;

public class PessoaFisica extends Pessoa {

    private double gastosSaude;

    public PessoaFisica (String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }
}
