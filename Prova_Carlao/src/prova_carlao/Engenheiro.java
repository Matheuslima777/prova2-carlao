
package prova_carlao;

import java.time.LocalDate;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, Genero genero, Endereco endereco, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, genero, endereco, setor, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CREA: " + crea;
    }
    
    
    
}
