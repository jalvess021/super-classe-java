import java.util.Scanner;
import java.util.InputMismatchException;

public class MeioTransporte {
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    public MeioTransporte() {}

    public MeioTransporte(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public int getCapacidadeTanque() { return capacidadeTanque; }
    public void setCapacidadeTanque(int capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }

    public int getNumeroPassageiros() { return numeroPassageiros; }
    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void imprimir() {
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: R$" + preco);
    }

    public void entrada(Scanner sc) throws InputMismatchException {
        System.out.print("Capacidade do tanque: ");
        this.capacidadeTanque = sc.nextInt();
        System.out.print("Número de passageiros: ");
        this.numeroPassageiros = sc.nextInt();
        System.out.print("Preço: ");
        this.preco = sc.nextDouble();
    }
}
