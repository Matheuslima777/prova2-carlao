
package prova_carlao;


public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");
    
    protected String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public static EstadoCivil getSOLTEIRO() {
        return SOLTEIRO;
    }

    public static EstadoCivil getCASADO() {
        return CASADO;
    }

    public static EstadoCivil getSEPARADO() {
        return SEPARADO;
    }

    public static EstadoCivil getDIVORCIADO() {
        return DIVORCIADO;
    }

    public static EstadoCivil getVIUVO() {
        return VIUVO;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
