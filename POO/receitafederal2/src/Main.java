import contribuintes.Pessoa;
import contribuintes.PessoaFisica;
import contribuintes.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Matheus N. Saito - 2020262
// Pedro Wilson Rodrigues de Lima - 2020267
public class Main {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<Pessoa>();
        System.out.print("Número de contribuintes as serem cadastrados: ");
        int numcontribuintes = SC.nextInt();

        for (int i = 1; i <= numcontribuintes; i++) {
            System.out.println("'f' para Pessoa Fisíca ou 'j' para Pessoa Jurídica");
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
                double numFuncionarios = SC.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, (int) numFuncionarios));
            }

            System.out.println("Impostos Tributados: ");
            for (Pessoa impPg: list) {
                System.out.println(impPg.getNome() + ": R$" + (impPg.imposto()));
            }

            double somarImp = 0.0;
            for (Pessoa impPG : list) {
                somarImp += impPG.imposto();
            }
            System.out.println("Impostos Totais: R$ " + somarImp);

        }
    }
}
