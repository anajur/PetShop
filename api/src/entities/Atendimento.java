package entities;

import enums.Servicos;

import java.util.Date;
import java.util.List;

public class Atendimento {

    private Animal animal;
    private List<Servicos> servicoList;
    private Date diaAtendimento;
    private double preco;
    private boolean encerrado;

    public Atendimento(Animal animal, List<Servicos> servicoList, Date diaAtendimento, double preco) {
        this.animal = animal;
        this.servicoList = servicoList;
        this.diaAtendimento = diaAtendimento;
        this.preco = preco;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }

    public Atendimento() {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Servicos> getServicoList() {
        return servicoList;
    }

    public void setServicoList(List<Servicos> servicoList) {
        this.servicoList = servicoList;
    }

    public Date getDiaAtendimento() {
        return diaAtendimento;
    }

    public void setDiaAtendimento(Date diaAtendimento) {
        this.diaAtendimento = diaAtendimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}