
package prova_carlao;

import java.time.LocalDate;


public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Genero genero, Endereco endereco, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, genero, endereco, setor, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CARTEIRA DE HABILITACAO: " + carteiraDeHabilitacao;
    }
    
    
    
}
