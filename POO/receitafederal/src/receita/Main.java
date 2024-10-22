package receita;

import java.util.Scanner;

import receita.produtos.Produto;
import receita.produtos.ProdutoNacional;
import receita.produtos.ProdutoShingLing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do Produto Nacional: \n");
		String nome = sc.nextLine();
		System.out.println("Pre�o do Produto Nacional: \n");
		double preco = Double.parseDouble(sc.nextLine());
		Produto nacional = new ProdutoNacional(nome, preco);
		
		System.out.println("Nome do Produto Extrangeiro: \n");
		nome = sc.nextLine();
		System.out.println("Pre�o do Produto Extrangeiro: \n");
		preco = Double.parseDouble(sc.nextLine());
		Produto extrangeiro = new ProdutoShingLing(nome, preco);
		
		System.out.println("Nome do Produto Nacional: "+nacional.getNome());
		System.out.println("Pre�o do Produto Nacional: "+nacional.getPreco());
		System.out.println("Nome do Produto Extrangeiro: "+extrangeiro.getNome());
		System.out.println("Valor final do Produto Extrangeiro: "+extrangeiro.getPreco());
		
	}	

}
