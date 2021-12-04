import java.util. *;
import java.lang. *;
import java.util.function. *;
import java.util.stream.Stream;

public class StreamClass {

    public static void main(String[] args) {

        Client Client1 = new Client("William", true, "um23quatorze", 9);
        Client Client2 = new Client("Guilherme", true, "cornodefreefire", 5);
        Client Client3 = new Client("Alexandre", true, "inevitavel", 9);
        Client Client4 = new Client("EuMesmo", true, "imbatman", 10);

        List<Client> clients = Arrays.asList(Client1, Client2, Client3, Client4); //lista de clientes.
        clients.forEach(c -> System.out.println(c.getPts())); //imprimir pontos da lista de clientes.

        Stream<Client> stream = clients.stream().filter(c -> c.getPts()>5); //filtra da lista de cliestes, aqueles com pontuação superior a 5.
    }

}
