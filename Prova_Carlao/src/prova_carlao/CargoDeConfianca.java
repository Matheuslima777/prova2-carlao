
package prova_carlao;

import java.time.LocalDate;


public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Endereco endereco, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, genero, endereco, setor, salario, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n BONIFICACAO: " + bonificacao ;
    }
    
    
}
