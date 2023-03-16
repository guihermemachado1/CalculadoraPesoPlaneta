import java.util.Scanner;

public class Padrao {
    public static void main(String args[]) {
        Universo solar = new Universo();
        Planeta[] planetas = solar.getPlanetas();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        for (int i = 0; i < planetas.length ; i++) {
            System.out.println(i + ". " + planetas[i].getNome());
        }

        System.out.print("Digite o número do planeta que deseja: ");
        int indexPlaneta = scanner.nextInt();

        if (indexPlaneta < 0 || indexPlaneta >= planetas.length) {
            System.out.println("Planeta inválido!");
        } else {
            Planeta planeta = planetas[indexPlaneta];
            System.out.println("Seu peso no planeta " + planeta.getNome() + " é de " + planeta.getPeso(peso) + " N.");
        }

        scanner.close();
    }
}