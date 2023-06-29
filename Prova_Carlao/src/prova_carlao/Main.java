
package prova_carlao;

import java.time.LocalDate;
import java.time.Month;


public class Main {

   
    public static void main(String[] args) {
        Gerente gerente = new Gerente(Bonificacao.DIRETOR, "Matheus", "12312312", "32131411", Genero.getMASCULINO(),
                new Endereco("Caminho de areia", "123", "321241", "23121241", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, 20.000, EstadoCivil.CASADO, LocalDate.of(2001, Month.MARCH, 7));
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Carlos", "1231241", "213123414", Genero.MASCULINO,
                new Endereco("Alphaville", "12314", "Condominio", "21312-312214", "Sao Paulo", UnidadeFederativa.SAO_PAULO), Setor.JURIDICO, 30.000, EstadoCivil.CASADO, LocalDate.of(1980, Month.MARCH, 9));
        
        
        Motoboy motoboy = new Motoboy("231314", "Malhado", "2123141", "312314141", Genero.MASCULINO, 
                new Endereco("avenida sete", "23121", "Casa", "2131241-3123", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, 3.000, EstadoCivil.CASADO, LocalDate.of(2003, Month.MARCH, 19));
        
        
        System.out.println(gerente);
        System.out.println(diretor);
        
        diretor.demitir(motoboy);
    }
    
}
