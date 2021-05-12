package entities;

public class Endereco{
    private String cidade;
    private String bairro;
    private int numero;
    private int cep;

    public Endereco(String cidade, String bairro, int numero, int cep) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}