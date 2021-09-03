public class PessoaFisica extends Pessoa {
    // Atributo específico da classe PessoaFísica
    private String CPF;

    // Getters e setter dos atributos específicos da classe
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    // Construtor da classe PessoaFisica (subclasse)
    // utilizando o construtor da classe pai (super classe)
    public PessoaFisica() {
        super();
        this.setCPF("");
    }
}
