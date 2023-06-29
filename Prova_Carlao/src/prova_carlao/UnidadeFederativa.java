
package prova_carlao;


public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de janeiro", "RJ");
    
    protected String texto;
    protected String sigla;

    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederativa getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
