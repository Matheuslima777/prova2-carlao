/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova_carlao;


public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    protected String texto;
    protected char caractere;

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
}
