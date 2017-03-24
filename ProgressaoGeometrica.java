/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

import java.util.Scanner;

/**
 *
 * @author caio.faraujo
 */
public class ProgressaoGeometrica {
    int valorInicial;
    int quantidade;
    int razao;
    
    public ProgressaoGeometrica (int valorInicial, int razao, int quantidade) {
        this.valorInicial = valorInicial;
        this.razao = razao;
        this.quantidade = quantidade;
    }
    
    public int proximoValor (int valorInicial, int razao, int quantidade) {
        int proximoValor = valorInicial * razao;
        return proximoValor;
    }
    public int valorAtual (int valorIniciaç) {
        int valorAtual = valorInicial;
        return valorAtual;
    }  
    
    public static void main(String[] args) {
//        int quantidade = Integer.parseInt(args[4]);
//        int valorInicial = Integer.parseInt(args[2]);
//        int razao = Integer.parseInt(args[3]);

        
        ProgressaoGeometrica pg = new ProgressaoGeometrica(2, 3, 4);
        
        for (int i=0; i < 4 ; i++) {
            System.out.print (pg.valorAtual(2) + "");            
            System.out.println(pg.proximoValor(2, 3) + "");
        }       
    }
}
