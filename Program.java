import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome, regime;
        Double salario, valorHora, contrato;
        int horasTrabalhadas;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite seu salário regime de pagamento (clt/horista/pj): ");
        regime = sc.nextLine();

        if (regime.equals("clt")) {
            System.out.print("Digite seu salário: ");
            salario = sc.nextDouble();
            System.out.println("Nome do professor: " + nome);
            System.out.printf("Valor a receber: R$%.2f%n", salario);
        }
        else if (regime.equals("horista")) {
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horasTrabalhadas = sc.nextInt();
            System.out.print("Digite o valor por hora: ");
            valorHora = sc.nextDouble();
            System.out.println("Nome do professor: " + nome);
            System.out.printf("Valor a receber: R$%.2f%n", (horasTrabalhadas*valorHora));
        } else if (regime.equals("pj")) {
            System.out.print("Digite o valor do contrato: ");
            contrato = sc.nextDouble();
            System.out.println("Nome do professor: " + nome);
            System.out.printf("Valor a receber: R$%.2f%n", contrato);
        }
        else {
            System.out.println("Entrada inválida, tente novamente!");
        }

        sc.close();
    }
}