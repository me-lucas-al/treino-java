public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    protected Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getDados() {
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nSalário Base: " + salarioBase +
                "\nSalário Final: " + calcularSalario();
    }
}
