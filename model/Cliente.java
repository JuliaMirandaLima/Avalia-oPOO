package model;
public class Cliente extends Pessoa {
    private String CPF;
    public Cliente(String nome, String telefone, String CPF) {
        super(nome,telefone);
        this.CPF = CPF;
    }
    public String getCPF() {
        return CPF;
    }

    





}
