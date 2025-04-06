import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aviao[] avioes = new Aviao[10];
        Navio[] navios = new Navio[10];

        System.out.println("==== Cadastro de Aviões ====");
        for (int i = 0; i < 10; i++) {
            avioes[i] = new Aviao();
            System.out.println("Avião " + (i + 1));
            avioes[i].entrada(sc);
        }

        System.out.println("\n==== Cadastro de Navios ====");
        for (int i = 0; i < 10; i++) {
            navios[i] = new Navio();
            System.out.println("Navio " + (i + 1));
            navios[i].entrada(sc);
        }

        System.out.println("\n==== Dados Cadastrados ====");
        for (Aviao a : avioes) {
            a.imprimir();
            System.out.println();
        }

        for (Navio n : navios) {
            n.imprimir();
            System.out.println();
        }

        sc.close();
    }
}
