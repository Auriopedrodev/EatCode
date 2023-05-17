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
public class Eat_Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        
        int opcao, cont = 0;
        
            //char letra = (char) opcao;
            //opcao = letra;
            
        do{
            System.out.println("--------MENU--------");
            System.out.println("[1] - JOGADOR: ");
            System.out.println("[2] - ADMINISTRADOR: ");
            System.out.println("[3] - INICIAR JOGO:");

            System.out.println(" ");

            System.out.println("Digite a opcao desejada: ");
            opcao = ler.nextInt();
            
            
            int tentativas = 1;
            
            ler.nextLine();

            while (!(opcao > 0 && opcao < 4)){
                System.out.println("Opcao inexistente! ");
                System.out.println("----------");
                System.out.println("Digite novamente!");
                //String letra = ler.next();
                //opcao = Integer.valueOf(letra);
                opcao = ler.nextInt();
                tentativas++;
                if (tentativas == 5) {
                    System.out.println("");
                    System.out.println("Infelizmente tivemos que encerrar o programa, reinicei por favor. Excedeu no numero de tentativas!");
                    ler.close();
                    break;
                }
            }
            
            
                /*System.out.println("--------MENU--------");
                System.out.println("[1] - JOGADOR: ");
                System.out.println("[2] - ADMINISTRADOR: ");
                System.out.println("[3] - INICIAR JOGO:");

                System.out.println(" ");

                System.out.println("Digite a opcao desejada: ");
                opcao = ler.nextInt();*/

                //while(opcao > 0 && opcao < 4){
                if (opcao > 0 && opcao < 4){
                    switch (opcao) {
                        case 1: 
                            //nome.add(name);
                                //name = ler.nextLine();
                            /*System.out.println("Digite o nome do Jogador: ");
                            String nomes = ler.nextLine();
                            nome.add(nomes);
                            nomes = ler.nextLine();*/


                            /*String nomes = ler.nextLine();
                                nome.add(nomes);
                                nomes = ler.nextLine();
                                nome.add(nomes);
                                nomes = ler.nextLine();*/

                            System.out.println("");
                            System.out.println("Quantos jogadores deseja inserir: ");
                            int num = ler.nextInt();


                            ArrayList <String> nome = new ArrayList <String>();

                            System.out.println("");
                            System.out.println("-----PREENCHA OS DADOS DO JOGADOR----- ");

                            ler.nextLine();

                            for (int i = 1; i <= num; i++) {
                                System.out.println("Digite o nome do Jogador ["+ i +"]: ");
                                String nomes = ler.nextLine();
                                //char letra = nomes.charAt(i);
                                nome.add(nomes);
                            }

                            ArrayList <Integer> dia = new ArrayList <Integer>();
                            ArrayList <Integer> mes = new ArrayList <Integer>();
                            ArrayList <Integer> ano = new ArrayList <Integer>();


                            //ler.nextLine();

                            int day, month, year;

                            System.out.println("");
                            for (int i = 1; i <= num; i++) {
                                System.out.println("Digite o dia do jogador ["+ i +"]:");
                                day = ler.nextInt();
                                while (!(day > 0 && day <= 31)) {
                                    System.out.println("Dia do jogador ["+ i +"] e inexistente");
                                    System.out.println("Digite novamente o dia: ");
                                    day = ler.nextInt();
                                } 
                                
                                if (day > 0 && day <= 31) {
                                    dia.add(day);
                                }
                            }

                            System.out.println("");
                            for (int i = 1; i <= num; i++) {
                                System.out.println("Digite o mes do jogador ["+ i +"]::");
                                month = ler.nextInt();
                                while (!(month > 0 && month <= 12)) {
                                    System.out.println("Mes do jogador ["+ i +"] e inexistente");
                                    System.out.println("Digite novamente o mes: ");
                                    month = ler.nextInt();
                                    }
                                if (month > 0 && month <= 12) {
                                    mes.add(month);
                                }
                            }

                            System.out.println("");
                            for (int i = 1; i <= num; i++) {
                                System.out.println("Digite o ano do jogador ["+ i +"]::");
                                year = ler.nextInt();
                                while (!(year > 0)) {
                                    System.out.println("Ano do jogador ["+ i +"] e inexistente");
                                    System.out.println("Digite novamente o ano: ");
                                    year = ler.nextInt();
                                }
                                if (year > 0){
                                    ano.add(year);
                                }
                            }

                            ler.nextLine();

                            System.out.println("");
                            System.out.println("---- APRESENTACAO DOS DADOS----");
                            for (String names: nome) {
                                System.out.println("Nome: " + names);
                            }

                            for (int dias: dia) {
                                System.out.print("Data de Nascimento: " + dias + "/");
                            }
                            for (int meses: mes) {
                                System.out.print(meses + "/");
                            }
                            for (int anos: ano) {
                                System.out.println(anos);
                            }
                            System.out.println("Preenchimento dos dados feito com sucesso! ");
                            break;


                        case 2:
                            int niveis, nTemas, nPerguntas, temaP;
                            ArrayList <String> temas = new ArrayList <String>();
                            ArrayList <String> nivel = new ArrayList <String>();
                            ArrayList <String> perguntas = new ArrayList <String>();
                            
                            System.out.println("Quantos niveis o jogo deve possuir? ");
                            niveis = ler.nextInt();

                            while (!(niveis == 4)){
                                System.out.println("O jogo so pode possuir 4 niveis! ");
                                System.out.println("Digite novamente o nivel:");
                                niveis = ler.nextInt();
                            }
                            
                            ler.nextLine();
                            if (niveis == 4) {
                                System.out.println("");
                                System.out.println("----PREENCHIMENTO DOS NIVEIS DE DIFICULDADE----");
                                for (int i = 1; i <= niveis; i++) {
                                    System.out.print("Nivel [" + i + "]: ");
                                    String difnivel = ler.nextLine();
                                    nivel.add(difnivel);
                                }
                                
                                System.out.println("");
                                System.out.println("-----NIVEIS-----");
                                cont = 0;
                                for (String dificuldade : nivel) {
                                    cont++;
                                    System.out.println("["+cont+"]:" + dificuldade);
                                }
                                
                                ler.nextLine();
                                
                                System.out.println("");
                                System.out.println("Deseja jogar em qual nivel de dificuldade? ");
                                int dif = ler.nextInt();
                                
                                while (dif < 1 || dif > nivel.size() ) {                                    
                                    System.out.println("Nivel inexistente!");
                                    System.out.println("Digite novamente o nivel de dificuldade:");
                                    dif = ler.nextInt();
                                }
                                
                                if(dif > 0 && dif <= nivel.size()){
                                    switch (nivel.size()){
                                        case 1:
                                            System.out.println("Quantos temas deseja inserir? ");
                                            nTemas = ler.nextInt();

                                            ler.nextLine();

                                            while (!(nTemas == 4)) {                                        
                                                System.out.println("Deve ter 4 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            ler.nextLine();

                                            System.out.println("-----PREENCHIMENTO DOS TEMAS PARA ESTE NIVEL-----");
                                            if ((nTemas == 4)){
                                                for (int i = 1; i <= 4; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();
                                                    temas.add(tema);
                                                }
                                            }

                                            ler.nextLine();

                                            cont = 0;
                                            System.out.println("-----TEMAS-----");
                                            for (String themes : temas) {
                                                cont++;
                                                System.out.println("["+cont+"]: "  + themes);
                                            }

                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }

                                            ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                            System.out.println("");
                                            while ((temaP < 1 || temaP > temas.size())) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }
                                           if (temaP > 0 && temaP <= temas.size()) {
                                            ler.nextLine();
                                                switch (temas.size()){
                                                    case 1:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                }
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Quantas temas deseja inserir? ");
                                            nTemas = ler.nextInt();
                                            System.out.println("Quais os temas que deseja para este nivel? ");

                                            ler.nextLine();

                                            while (!(nTemas == 4)) {                                        
                                                System.out.println("So pode ter ate 4 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            ler.nextLine();

                                            if ((nTemas == 4)){
                                                for (int i = 1; i <= 4; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();
                                                    temas.add(tema);
                                                }
                                            }

                                            ler.nextLine();

                                            cont = 0;
                                            System.out.println("-----TEMAS-----");
                                            for (String themes : temas) {
                                                cont++;
                                                System.out.println("["+cont+"]: "  + themes);
                                            }
                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas e no maximo 4!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }

                                            ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                            System.out.println("");
                                            /*while (!(temaP == 4)) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                            //if (temaP == 4) {
                                            ler.nextLine();
                                                switch (temaP){
                                                    case 1:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                }
                                        case 3:
                                            System.out.println("Quantas temas deseja inserir? ");
                                            nTemas = ler.nextInt();
                                            System.out.println("Quais os temas que deseja para este nivel? ");

                                            ler.nextLine();

                                            while (!(nTemas == 4)) {                                        
                                                System.out.println("So pode ter ate 4 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            ler.nextLine();

                                            if ((nTemas == 4)){
                                                for (int i = 1; i <= 4; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();
                                                    temas.add(tema);
                                                }
                                            }

                                            ler.nextLine();

                                            cont = 0;
                                            System.out.println("-----TEMAS-----");
                                            for (String themes : temas) {
                                                cont++;
                                                System.out.println("["+cont+"]: "  + themes);
                                            }
                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas! e no maximo 4!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }

                                            ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                            System.out.println("");
                                            /*while (!(temaP == 4)) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                            //if (temaP == 4) {
                                            ler.nextLine();
                                                switch (temaP){
                                                    case 1:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                }
                                            break;
                                        case 4:
                                            System.out.println("Quantas temas deseja inserir? ");
                                            nTemas = ler.nextInt();
                                            System.out.println("Quais os temas que deseja para este nivel? ");

                                            ler.nextLine();

                                            while (!(nTemas == 4)) {                                        
                                                System.out.println("So pode ter ate 4 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            ler.nextLine();

                                            if ((nTemas == 4)){
                                                for (int i = 1; i <= 4; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();
                                                    temas.add(tema);
                                                }
                                            }

                                            ler.nextLine();

                                            cont = 0;
                                            System.out.println("-----TEMAS-----");
                                            for (String themes : temas) {
                                                cont++;
                                                System.out.println("["+cont+"]: "  + themes);
                                            }
                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas e no maximo 4!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }

                                            ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                            System.out.println("");
                                            /*while (!(temaP == 4)) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                            if (temaP == 4) {
                                                ler.nextLine();
                                                switch (temaP){
                                                    case 1:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        if (nPerguntas == 3 || nPerguntas == 4) {
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            cont = 0;
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                cont++;
                                                                System.out.print("Pergunta [" +cont+ "]: ");
                                                                String  pergunta = ler.nextLine();
                                                                perguntas.add(pergunta);
                                                            }

                                                            ler.nextLine();

                                                            System.out.println("-----APRESENTACAO DAS PERGUNTAS-----");
                                                            cont = 0;
                                                            for (String question : perguntas) {
                                                                cont++;
                                                                System.out.println("["+ cont+"]: " + question);
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            break;
                                        }
                                    }
                                }
                                break;
                        case 3:
                            break;
                    }
                }
                cont++;
                System.out.println("");
            }while(cont != 3);
    }
}
