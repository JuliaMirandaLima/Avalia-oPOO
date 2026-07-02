package model;
public abstract class Pessoa {
    private String nome;
    private String tel;
    
    public Pessoa(String nome, String tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }

}
