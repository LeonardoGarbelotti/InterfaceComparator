/*
 * Em um determinado sistema acadêmico, existe a classe Aluno com ra e nome. Alguma
   vezes, é necessário ordenar a lista de alunos por ra, outras vezes por nome. Assim, crie
   duas classes que implementem a interface Comparator de Java:
        - a classe NomeComparator
        - a classe RaComparator
   Crie uma lista de alunos e mostre como utilizar os comparadores
 */
package exerciciocomparator;
import java.util.ArrayList;
import java.util.Collections;

public class Academia {

    public static void main(String[] args) {
        //cria a lista de alunos, com o nome "listaAluno"
        ArrayList<Aluno> listaAluno = new ArrayList<>(); 
        
        //adiciona os valores na listaAluno, chamando o método aluno e criando um novo objeto
        listaAluno.add(new Aluno("Marcio", 5));
        listaAluno.add(new Aluno("Amanda", 16));
        listaAluno.add(new Aluno("Amanda", 10));
        listaAluno.add(new Aluno("João", 8));
        listaAluno.add(new Aluno("Carlos", 19));
        
        /*
         * função de organização do pacote "Collections", com o método "sort"(organizar)
         * porem, nós temos que definir o tipo de organização
         * então é passado como parâmetro, a nossa lista de alunos
         * e a classe de comparar pelo nome de aluno
        */
        Collections.sort(listaAluno, new NomeComparator());
        
        System.out.println("Por ordem de Nome!");
        for(Aluno a: listaAluno)
        {
            System.out.println(a.nome+" "+a.ra);
        }
        
        System.out.println("\n");
         
        /*
         * função de organização do pacote "Collections", com o método "sort"(organizar)
         * porem, nós temos que definir o tipo de organização
         * então é passado como parâmetro, a nossa lista de alunos
         * e a classe de comparar pelo RA do aluno
        */
        System.out.println("Por ordem de RA!");
        Collections.sort(listaAluno, new RaComparator());
        for(Aluno a: listaAluno)
        {
            System.out.println(a.nome+" "+a.ra);
        }
                
    }
    
}
