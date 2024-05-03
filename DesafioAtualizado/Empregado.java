package Desafio;

public class Empregado {
    private String nome;
    private String cpf;
    private String senha;
    private String DataNasc;
    private Integer admin;
    

    // Construtor do empregado
    Empregado(String nome, String cpf, String senha, String DataNasc, int admin){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.DataNasc = DataNasc;
        this.admin = admin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataNasc(String dataNasc) {
        DataNasc = dataNasc;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    // getters dos atributos
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getDataNasc() {
        return this.DataNasc;
    }


    public Integer getAdmin() {
        return this.admin;
    }
}
