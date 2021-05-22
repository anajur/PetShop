package entities;


import java.time.LocalDate;
import java.util.Date;

import enums.Especie;
import enums.Sexo;

public class Animal {

    private String raca;
    private String nome;
    private LocalDate dataNascimento;
    private Pessoa dono;
    private String alergias;
    private Sexo sexo;
    private Especie especie;

    public Animal(String raca, String nome, LocalDate dataNascimento, Pessoa dono, String alergias, Sexo sexo, Especie especie) {
        this.raca = raca;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.dono = dono;
        this.alergias = alergias;
        this.sexo = sexo;
        this.especie = especie;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Animal() {
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}