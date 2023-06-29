
package prova_carlao;

import java.time.LocalDate;


public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Endereco endereco, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, genero, endereco, setor, salario, estadoCivil, dataNascimento);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        return salario + (salario * super.bonificacao.GERENTE.valor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
