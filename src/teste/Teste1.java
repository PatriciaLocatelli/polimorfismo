package teste;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.println("Entre com o número de funcionários");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Funcionario " + i + " dados:");
            System.out.println("Funcionário Tercerizado? (s/n)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if (ch == 's') {
                System.out.println("Adicional Salario");
                double adicionalSalario = sc.nextDouble();
                Funcionario funcionario = new FuncionarioTercerizado(nome, horas, valorPorHora, adicionalSalario);
                lista.add(funcionario);
            } else if (ch == 'n') {
                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                lista.add(funcionario);
            } else {
                System.out.println("Código errado");
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionario fun: lista){
            System.out.println(fun.getNome() + " - R$ " + String.format("%.2f", fun.pagamento()));
        }
        sc.close();
    }
}
