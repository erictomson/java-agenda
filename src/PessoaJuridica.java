public class PessoaJuridica extends Pessoa {
    // Atributo específico da classe PessoaFísica
    private String CNPJ;

    // Getters e setter dos atributos específicos da classe
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    // Construtor da classe PessoaFisica (subclasse)
    // utilizando o construtor da classe pai (super classe)
    public PessoaJuridica() {
        super();
        this.setCNPJ("");
    }
}
