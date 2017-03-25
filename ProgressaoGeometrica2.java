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
    
    public ProgressaoGeometrica (int valorInicial, int razao, int qtde) {
        this.valorInicial = valorInicial;
        this.razao = razao;
        this.quantidade = qtde;
    }
    
    public void proximoValor () {
        int proximoValor = 0;        
        proximoValor = this.valorInicial * this.razao;      
        System.out.println("Proximo valor: " + proximoValor);      
        
    }
    public int valorAtual () {
        return this.valorInicial;
    }  
    
    public static void main(String[] args) {        
        ProgressaoGeometrica pg = new ProgressaoGeometrica(5, 6, 8);       
        pg.proximoValor();
        pg.valorAtual();
        pg.proximoValor();
        pg.valorAtual();


    }
}
