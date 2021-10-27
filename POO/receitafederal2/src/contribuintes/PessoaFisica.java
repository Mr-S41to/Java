package contribuintes;

public class PessoaFisica extends Pessoa {

    private double gastosSaude;

    public PessoaFisica (String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public double imposto() {

        double impostoBase;
        if (getRendaAnual()< 20000.0) {
            impostoBase = getRendaAnual() * 0.15;
        } else {
            impostoBase = getRendaAnual() * 0.25;
        }

        impostoBase = impostoBase - getGastosSaude() * 0.5;
        if (impostoBase < 0.0) {
            impostoBase = 0.0;
        }
        return impostoBase;

    }
}
