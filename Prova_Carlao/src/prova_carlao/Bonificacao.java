
package prova_carlao;


public enum Bonificacao {
    GERENTE (0.15),
    DIRETOR (0.2);
    
    protected   double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public static Bonificacao getGERENTE() {
        return GERENTE;
    }

    public static Bonificacao getDIRETOR() {
        return DIRETOR;
    }
    
    
}
