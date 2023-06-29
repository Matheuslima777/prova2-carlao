
package prova_carlao;

import java.time.LocalDate;


public class Diretor  extends CargoDeConfianca implements Contratacao{
    private double PREMIO = (0.3);

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Endereco endereco, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, genero, endereco, setor, salario, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal() {
       return salario + (salario * super.bonificacao.DIRETOR.valor) + (salario * PREMIO);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n PREMIO: " + (PREMIO*100 )+ "%";
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você foi contratado" + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Voce foi demitido: " + funcionario.nome);
    }
    
    
    
    
    
    
}
