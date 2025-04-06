    import java.util.Scanner;
    import java.util.InputMismatchException;

    public class Navio extends Veiculo {
        private String nome;
        private int numeroTripulantes;
        private String dataLancamento;

        public Navio() {}

        public Navio(String nome, String dataLancamento) {
            this.nome = nome;
            this.dataLancamento = dataLancamento;
        }

        public Navio(String nome, int numeroTripulantes, String dataLancamento) {
            this.nome = nome;
            this.numeroTripulantes = numeroTripulantes;
            this.dataLancamento = dataLancamento;
        }

        public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome) {
            super(capacidadeTanque, numeroPassageiros, preco);
            this.nome = nome;
        }

        public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome, int numeroTripulantes, String dataLancamento) {
            super(capacidadeTanque, numeroPassageiros, preco);
            this.nome = nome;
            this.numeroTripulantes = numeroTripulantes;
            this.dataLancamento = dataLancamento;
        }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public int getNumeroTripulantes() { return numeroTripulantes; }
        public void setNumeroTripulantes(int numeroTripulantes) { this.numeroTripulantes = numeroTripulantes; }

        public String getDataLancamento() { return dataLancamento; }
        public void setDataLancamento(String dataLancamento) { this.dataLancamento = dataLancamento; }

        public double passageirosPorTripulantes() {
            return (double) numeroPassageiros / numeroTripulantes;
        }

        @Override
        public void entrada(Scanner sc) {
            try {
                super.entrada(sc);
                sc.nextLine(); 
                System.out.print("Nome do navio: ");
                this.nome = sc.nextLine();
                System.out.print("Número de tripulantes: ");
                this.numeroTripulantes = sc.nextInt();
                sc.nextLine();
                System.out.print("Data de lançamento: ");
                this.dataLancamento = sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Erro de entrada. Tente novamente.");
                sc.nextLine();
            }
        }

        @Override
        public void imprimir() {
            super.imprimir();
            System.out.println("Nome: " + nome);
            System.out.println("Número de Tripulantes: " + numeroTripulantes);
            System.out.println("Data de Lançamento: " + dataLancamento);
            System.out.printf("Passageiros por Tripulante: %.2f\n", passageirosPorTripulantes());
        }
    }
