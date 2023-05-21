/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isptec.pii.pp2;

import java.util.*;

/**
 *
 * @author ligor
 */
public class Jogador {
    ArrayList <String> nome;
    ArrayList <Integer> dia;
    ArrayList <Integer> mes;
    ArrayList <Integer> ano;
    String nomes;
    int day;
    int month;
    int year;
    
    
    
    static void PreencherNome (ArrayList <String> nome, String nomes){
        nome.add(nomes);
    }
    static void ImprimirNome (ArrayList <String> nome){
        for (String names: nome) {
            System.out.println("Nome: " + names);
        }
    }
    static void PreencherDia (ArrayList <Integer> dia, int day, int num){
        dia.add(day);
    }
    static void ImprimirDia (ArrayList <Integer> dia){
        for (int dias: dia) {
            System.out.print("Data de Nascimento: " + dias + "/");
        }
    }
    
    static void PreencherMes (ArrayList <Integer> mes, int month, int num){
        mes.add(month);
    }
    
    static void ImprimirMes (ArrayList <Integer> mes){
        for (int meses: mes) {
            System.out.print(meses + "/");
        }
    }
    
    static void PreencherAno (ArrayList <Integer> ano, int year, int num){
        ano.add(year);
            
    }
    
    static void ImprimirAno (ArrayList <Integer> ano){
        for (int anos: ano) {
            System.out.println(anos);
        }
    }
 
    static void GuardarJogador (String jog []){
        
    }
}   
