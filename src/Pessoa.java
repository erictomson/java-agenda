public class Pessoa {
    // Atributos da classe (característica da pessoa)
    private String nome;
    private String email;

    // Getters e setters dos atributos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Construtor da classe (inicialização)
    public Pessoa() {
        this.setNome("");
        this.setEmail("");
    }
}
