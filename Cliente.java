package clientes;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;
    private boolean validaCpf;
    
    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = "";
    }

    public void setEndereco(String eString) {
        this.endereco = "";
    }

    public void setCpf(String cpf) {
        this.cpf = "";
    }

    public void setIdade(int idade) {
        this.idade = 0;
    }

    public void Status() {
        System.out.println("Nome de cadrastro: " + this.nome);
        System.out.println("Endereço de cadrastro: " + this.endereco);
        System.out.println("CPF cadrastado: " + this.cpf);
        System.out.println("Idade informada: " + this.idade);
    }

    public void validaCpf(boolean validaCpf) {
        if (validaCpf == true) {
            JOptionPane.showMessageDialog(null, "Cadrastro realizado", "Cadrastro", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (validaCpf == false) {
            JOptionPane.showMessageDialog(null, "CPF inválido", "Cadrastro", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}


