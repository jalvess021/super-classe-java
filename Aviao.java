import java.util.Scanner;
import java.util.InputMismatchException;

public class Aviao extends Veiculo {
    private String prefixo;
    private String dataRevisao;

    public Aviao() {}

    public Aviao(String prefixo, String dataRevisao) {
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    public String getPrefixo() { return prefixo; }
    public void setPrefixo(String prefixo) { this.prefixo = prefixo; }

    public String getDataRevisao() { return dataRevisao; }
    public void setDataRevisao(String dataRevisao) { this.dataRevisao = dataRevisao; }

    public void reajustarPreco(double percentual) {
        this.preco += this.preco * (percentual / 100);
    }

    @Override
    public void entrada(Scanner sc) {
        try {
            super.entrada(sc);
            sc.nextLine();
            System.out.print("Prefixo: ");
            this.prefixo = sc.nextLine();
            System.out.print("Data da revisão: ");
            this.dataRevisao = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Tente novamente.");
            sc.nextLine();
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Data de Revisão: " + dataRevisao);
    }
}
