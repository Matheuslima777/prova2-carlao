
package prova_carlao;

import java.time.LocalDate;
import java.time.Period;


public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected Endereco endereco;
    protected Setor setor;
    protected double salario;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Genero genero, Endereco endereco, Setor setor, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.endereco = endereco;
        this.setor = setor;
        this.salario = salario;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    
    
    public int getIdade(){
    return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return  "\n NOME: " + nome +
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n CPF: " + genero.caractere + 
                "\n ENDERECO: " + endereco +
                "\n SETOR" + setor.texto + 
                "\n SALARIO: " + salario + 
                "\n SALARIO FINAL: : " + getSalarioFinal() + 
                "\n ESTADO  CIVIL: " + estadoCivil.texto + 
                "\n DATA DE NASCIMENTO: " + Util.formatarData(dataNascimento) +
                "\n IDADE: " + getIdade();
    }
    
    
   
    
    
}
