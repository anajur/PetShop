package entities;

import java.util.List;

public class PetShop{

    private List<Atendimento> atendimentoList;

    public PetShop(List<Atendimento> atendimentoList) {
        this.atendimentoList = atendimentoList;
    }

    public PetShop() {
    }

    public List<Atendimento> getAtendimentoList() {
        return atendimentoList;
    }

    public void setAtendimentoList(List<Atendimento> atendimentoList) {
        this.atendimentoList = atendimentoList;
    }
    
}