import contribuintes.Pessoa;
import contribuintes.PessoaFisica;
import contribuintes.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<Pessoa>();
        System.out.print("Número de contribuintes as serem cadastrados: ");
        int numcontribuintes = SC.nextInt();

        for (int i = 1; i <= numcontribuintes; i++) {
            System.out.println("F para Pessoa Fisíca ou P para Pessoa Jurídica");
            char tipo = SC.next().charAt(0); // para ler o primeiro caractere.
            System.out.println("Nome do Contribuinte: ");
            String nome = SC.next();
            System.out.println("Renda Anual: ");
            double rendaAnual = SC.nextDouble();
            if (tipo == 'f') {
                System.out.println("Gastos Médicos: ");
                double gastosSaude = SC.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.println("Número de Funcionários: ");
                double numFuncionarios = SC.nextDouble();
                list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            }

        }
    }
}
