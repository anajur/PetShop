package enums;

public enum Servicos {
	
    TOSA("1", 50.0), 
    BANHO("2", 30.0),
    PROMOCAO("3", 75.0);
    
    public String opcao;
	
    public Double valor;
    
	Servicos(String opcao, Double valor) {
        this.opcao = opcao;
        this.valor = valor;
    }
}