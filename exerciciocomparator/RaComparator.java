/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocomparator;

import java.util.Comparator;


public class RaComparator implements Comparator<Aluno>{
    @Override
    public int compare(Aluno a1, Aluno a2){
        //se o ra1 for igual ao ra2 retorna 0
        if(a1.ra==a2.ra) return 0; 
        //se o ra1 > ra2 retorna 1
        else if(a1.ra > a2.ra) return 1; 
        //se o ra2 > ra1 retorna -1
        else return -1;
    }

}