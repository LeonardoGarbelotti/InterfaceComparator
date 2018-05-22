/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocomparator;

import java.util.Comparator;

public class NomeComparator implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2)//Comparar alunos
    {
        //Ver se o nome1 é igual ao nome 2, se sim, retorna 0 (iguais)
        if(a1.nome.equals(a2.nome)) return 0; 
        //usar o metodo compareTo, que compara uma string a outra (equivalente a strcmp.
        else if(a1.nome.compareTo(a2.nome) > 0) return 1; 
        else return -1; //nome 1 é menor que nome 2
    }

}