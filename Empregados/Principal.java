import java.util.*;

public class Principal {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Empregado> empregados = new ArrayList<>();

    public static void main(String[] args) {

        int posicao;

        int motivo;
        int opcao;
        System.out.println("1- Criar novo empregado:");
        System.out.println("2- Promover empregado:");
        System.out.println("3- Aumentar salário:");
        System.out.println("4- Demitir empregado:");
        System.out.println("5- Aniversário do Empregado");
        System.out.println("6- Mostrar detalhes dos empregados");
        System.out.println("7- Sair");

        System.out.println("Qual opção deseja?");
        opcao = input.nextInt();
        input.nextLine();
        switch (opcao) {

            case 1:
                String nome;
                int idade;
                double salario;
                System.out.println("Nome, idade e salario do empregado:");
                nome = input.nextLine();
                idade = input.nextInt();
                salario = input.nextDouble();
                Empregado empregado = new Empregado(nome, idade, salario);
                empregados.add(empregado);
                break;
            case 2:
                listarEmpregados();
                System.out.println("Posição do empregado a ser promovido:");
                posicao = input.nextInt();
                empregados.get(posicao - 1).promover();
                break;
            case 3:
                listarEmpregados();
                System.out.println("Posição do empregado a receber aumento:");
                posicao = input.nextInt();
                empregados.get(posicao - 1).aumentarsalario(25);
                break;
            case 4:
                listarEmpregados();
                System.out.println("Posição do empregado a ser demitido:");
                posicao = input.nextInt();
                System.out.println("Demitirá por qual motivo?");
                motivo = input.nextInt();
                empregados.get(posicao - 1).demitir(motivo);
                break;
            case 5:
                listarEmpregados();
                System.out.println("Posição do empregado aniversariante:");
                posicao = input.nextInt();
                empregados.get(posicao - 1).fazerAniversario();
                break;
            case 6:
                listarEmpregados();
                break;
            case 7:
                break;
            default:
                System.out.println("inválido");
                break;
        }
        input.close();
    }

    public static void listarEmpregados() {
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println("Empregado: " + (i + 1));
            System.out.println(empregados.get(i).toString());
        }
    }
}