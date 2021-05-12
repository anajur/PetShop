package entities;

import java.util.List;
public class Pessoa {

    private String nomeCompleto;
    private String celular;
    private String email;
    private Endereco endereco;
    private String cpf;
    private List<Animal> animalList;

    public Pessoa(String nomeCompleto, String celular, String email, Endereco endereco, String cpf, List<Animal> animalList) {
        this.nomeCompleto = nomeCompleto;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.animalList = animalList;
    }

    public Pessoa() {
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}
