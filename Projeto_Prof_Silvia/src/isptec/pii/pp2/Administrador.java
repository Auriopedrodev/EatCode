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
public class Administrador {
    ArrayList <String> nivel;
    
    
    static void PreencherNivel (int niveis, String difnivel){
        ArrayList <String> nivel = new ArrayList <String>();
        if (niveis == 4) {
            for (int i = 1; i <= niveis; i++) {
                System.out.print("Nivel [" + i + "]: ");
                String aux = difnivel;
                nivel.add(aux);
            }
        }
    }
    
    static void ImprimirNivel (){
        ArrayList <String> nivel = new ArrayList <String>();
        int cont = 0;
        for (String dificuldade : nivel) {
            cont++;
            System.out.println("["+cont+"]:" + dificuldade);
        }
    }
    
    static void PreencherTema (ArrayList <String> temas, String tema){
        //if ((nTemas == temas.size())){
            temas.add(tema);
        //}
    }
    
    static void ImprimirTema (ArrayList <String> temas){
        int cont = 0;
        for (String themes : temas) {
            cont++;
            System.out.println("["+cont+"]: "  + themes);
        }
    }
    
    static void PerguntaResposta (ArrayList <String> perguntas, ArrayList <String> respostas ,String pergunta, String resposta){
        perguntas.add(pergunta);
        respostas.add(resposta);
    }
    
    static void ImprimirPergunta (ArrayList <String> perguntas){
        int cont = 0;
        for (String question : perguntas) {
            cont++;
            System.out.println("["+ cont+"]: " + question);
        }
    }
    
    /*static void PreencherResposta (ArrayList <String> respostas, String resposta){
        respostas.add(resposta);
    }*/
    
    static void PreencherOpcoesDasRespotas (ArrayList <String> opcoes, String opResposta){
        opcoes.add(opResposta);
    }
    
    static void ImprimirOpcoes (ArrayList <String> opcoes){
        int cont = 0;
        for (String options : opcoes) {
            cont++;
            System.out.println("["+ cont+"]: " + options);
        }
    }
    
    static void OpcaoCerta (ArrayList <String> respostas, ArrayList <String> opcoes){
        for (String opciones : opcoes){                                                                
            if (respostas.contains(opciones)) {
                System.out.println("Opcao correta, parabens!");
            }
            else{
                System.out.println("Opcao incorreta, infelizmente.");
            }
        }
    }
}