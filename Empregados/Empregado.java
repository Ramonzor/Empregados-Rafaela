public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;

    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public boolean promover() {
        if (idade > 18) {
            aumentarsalario(25);
            return true;
        } else {
            return false;
        }
    }

    public void aumentarsalario(double porcentagem) {
        salario += salario + (porcentagem / 100);
    }

    public void demitir(int motivo) {
        switch (motivo) {
            case 1:
                System.out.println("Demitido por justa causa, deverá cumprir aviso prévio.");
            case 2:
                double multa = salario * 0.4;
                System.out.println("Demitido por decisão do empregador, receberá multa de 40% do salário = " + multa);
            case 3:
                double salarioaposentado = 0;
                if (salario <= 2000) {
                    salarioaposentado = 1500;
                } else if (salario <= 3000) {
                    salarioaposentado = 2500;
                } else if (salario <= 4000) {
                    salarioaposentado = 3500;
                } else if (salario > 4000) {
                    salarioaposentado = 4000;
                }
                System.out.println("O seu salario de aposentado será:" + salarioaposentado);

                break;

            default:
                System.out.println("invalido");
                break;
        }
    }

    public void fazerAniversario() {
        idade += 1;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "Salario: " + this.salario + "\n";
    }

}