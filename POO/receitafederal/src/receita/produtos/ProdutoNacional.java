package receita.produtos;

public class ProdutoNacional extends Produto{

	public ProdutoNacional(String nome, double preco) {
		super(nome, preco); //apontando classe abstrata.
	}

	@Override //sobrescrevendo metodo do pai.
	public double getPreco() {
		return this.preco; //Produto sem taxa alfandegaria.
	}

}
