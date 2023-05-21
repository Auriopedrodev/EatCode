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
            
            
                if (opcao > 0 && opcao < 4){
                    switch (opcao) {
                        case 1: 
            
                            System.out.println("");
                            System.out.println("Quantos jogadores deseja inserir: ");
                            int num = ler.nextInt();

                            System.out.println("");
                            System.out.println("-----PREENCHA OS DADOS DO JOGADOR----- ");

                            ler.nextLine();
                            
                            ArrayList <String> nome = new ArrayList <String>();
                            
                            for (int i = 1; i <= num; i++) {
                                System.out.println("Digite o nome do Jogador: ");
                                String nomes = ler.nextLine();
                                
                                //Funcao que permite o preenchimento do nome
                                Jogador.PreencherNome(nome, nomes);
                            }

                            int day, month, year;
                            
                            ArrayList <Integer> dia = new ArrayList <Integer>();
                            
                            ArrayList <Integer> mes = new ArrayList <Integer>();
                            
                            ArrayList <Integer> ano = new ArrayList <Integer>();

                            System.out.println("");
                            
                            System.out.println("Digite o dia do jogador:");
                            day = ler.nextInt();
                            while (!(day > 0 && day <= 31)) {
                                System.out.println("Dia do jogador e inexistente");
                                System.out.println("Digite novamente o dia: ");
                                day = ler.nextInt();
                            } 
                            
                            //Funcao que permite o preenchimento do dia
                            for (int i = 1; i <= num; i++) {            
                                if (day > 0 && day <= 31) {
                                    Jogador.PreencherDia(dia, day, num);
                                }
                            }
                            
                            
                            System.out.println("");
                            System.out.println("Digite o mes do jogador: ");
                            month = ler.nextInt();
                            while (!(month > 0 && month <= 12)) {
                                System.out.println("Mes do jogador e inexistente");
                                System.out.println("Digite novamente o mes: ");
                                month = ler.nextInt();
                            }
                                
                            //Funcao que permite o preenchimento do mes
                            for (int i = 1; i <= num; i++) {   
                                if (month > 0 && month <= 12) {
                                    Jogador.PreencherMes(mes, month, num);
                                }
                            }

                            System.out.println("");
                            System.out.println("Digite o ano do jogador: ");
                            year = ler.nextInt();
                                while (!(year > 0)) {
                                    System.out.println("Ano do jogador e inexistente");
                                    System.out.println("Digite novamente o ano: ");
                                    year = ler.nextInt();
                                }
                                
                                //Funcao que permite o preenchimento do ano
                                for (int i = 1; i <= num; i++) {
                                    if (year > 0) {
                                        Jogador.PreencherAno(ano, year, num);
                                    }
                                }

                            ler.nextLine();

                            System.out.println("");
                            System.out.println("---- APRESENTACAO DOS DADOS----");
                            //Funcao que permite a impressao do nome
                            Jogador.ImprimirNome(nome);
                            
                            //Funcao que permite a impressao do dia
                            Jogador.ImprimirDia(dia);
                            
                            //Funcao que permite a impressao do mes
                            Jogador.ImprimirMes(mes);
                            
                            //Funcao que permite a impressao do ano
                            Jogador.ImprimirAno(ano);
                            
                            System.out.println("Preenchimento dos dados feito com sucesso! ");
                            break;


                        case 2:
                            int niveis, nTemas, nPerguntas, temaP;
                            ArrayList <String> perguntas = new ArrayList <String>();
                            ArrayList <String> respostas = new ArrayList<String>();
                            ArrayList <String> nivel = new ArrayList <String>();
                            ArrayList <String> opcoes = new ArrayList <String>();
                            
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
                            }   
                                System.out.println("");
                                System.out.println("-----NIVEIS-----");
                                cont = 0;
                                for (String dificuldade : nivel) {
                                    cont++;
                                    System.out.println("["+cont+"]:" + dificuldade);
                                }
                                
                                //ler.nextLine();
                                //System.out.println("");
                                
                                System.out.println("");
                                System.out.println("Deseja jogar em qual nivel de dificuldade? ");
                                int dif = ler.nextInt();
                                
                                /*while (dif < 1 || dif > nivel.size() ) {                                    
                                    System.out.println("Nivel inexistente!");
                                    System.out.println("Digite novamente o nivel de dificuldade:");
                                    dif = ler.nextInt();
                                }*/
                                
                                //if(dif > 0 && dif <= nivel.size()){
                                    switch (dif){
                                        case 1:
                                            System.out.println("Quantos temas deseja inserir? ");
                                            nTemas = ler.nextInt();

                                            ler.nextLine();

                                            while (!(nTemas == 3)) {                                        
                                                System.out.println("Deve ter 3 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----PREENCHIMENTO DOS TEMAS PARA ESTE NIVEL-----");
                                            ArrayList <String> temas = new ArrayList <String>();
                                            
                                            if (nTemas == 3){
                                                for (int i = 1; i <= 3; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();

                                                    //
                                                    Administrador.PreencherTema(temas, tema);
                                                }
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----TEMAS-----");
                                            
                                            //
                                            Administrador.ImprimirTema(temas);

                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }
                                            
                                            System.out.println("");
                                            //ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                           // System.out.println("");
                                            /*while ((temaP < 1 || temaP > temas.size())) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                           //if (temaP > 0 && temaP <= temas.size()) {
                                            ler.nextLine();
                                            
                                            //System.out.println("");
                                            if (nPerguntas == 3 || nPerguntas == 4) {
                                                switch (temaP ){ //temas.size()
                                                    case 1:
                                                        System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");

                                                        for (int i = 1; i <= nPerguntas; i++) {
                                                            System.out.print("Pergunta [" +i+ "]: ");
                                                            String  pergunta = ler.nextLine();

                                                            //
                                                            System.out.println("Digite as respostas [" + i + "]:");
                                                            String resposta = ler.nextLine();
                                                            Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                        }

                                                        System.out.println("");
                                                        //ler.nextLine();

                                                        System.out.println("-----PERGUNTAS-----");
                                                        //
                                                        Administrador.ImprimirPergunta(perguntas);

                                                        System.out.println("");
                                                        System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                        for (int i = 1; i <= nPerguntas ; i++) {
                                                            System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                            for (int j = 1; j <= nPerguntas; j++) {
                                                                System.out.print("Opcao [" + j + "]: ");
                                                                String  opResposta = ler.nextLine();
                                                                //
                                                                Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                            }
                                                        }


                                                        System.out.println("");

                                                     System.out.println("-----OPCOES-----");
                                                         for (int j = 1; j <= nPerguntas; j++) {
                                                             System.out.println("PERGUNTA [" + j + "]:");
                                                             Administrador.ImprimirOpcoes(opcoes);
                                                         }

                                                     ler.nextLine();

                                                     for (int i = 1; i <= opcoes.size(); i++){
                                                         System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                         int opCerta = ler.nextInt();
                                                         Administrador.OpcaoCerta(perguntas, opcoes);
                                                     }
                                                     //
                                                     for (int i = 1; i <= opcoes.size(); i++){
                                                         System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                         Administrador.OpcaoCerta(perguntas, opcoes);
                                                     }
                                                     System.out.println("");        
                                                    break;
                                                    case 2:
                                                        System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            
                                                               for (int i = 1; i <= nPerguntas; i++) {
                                                                   System.out.print("Pergunta [" +i+ "]: ");
                                                                   String  pergunta = ler.nextLine();
                                                                   
                                                                   //
                                                                   System.out.println("Digite as respostas [" + i + "]:");
                                                                   String resposta = ler.nextLine();
                                                                   Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                               }
                                                            
                                                               System.out.println("");
                                                            //ler.nextLine();

                                                            System.out.println("-----PERGUNTAS-----");
                                                            //
                                                            Administrador.ImprimirPergunta(perguntas);
                                                            
                                                            System.out.println("");
                                                            System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                            for (int i = 1; i <= nPerguntas ; i++) {
                                                                System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.print("Opcao [" + j + "]: ");
                                                                    String  opResposta = ler.nextLine();
                                                                    //
                                                                    Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                                }
                                                            }
                                                            
                                                            
                                                            System.out.println("");
                                                            
                                                            System.out.println("-----OPCOES-----");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.println("PERGUNTA [" + j + "]:");
                                                                    Administrador.ImprimirOpcoes(opcoes);
                                                                }
                                                            
                                                            ler.nextLine();
                                                            
                                                            for (int i = 1; i <= opcoes.size(); i++){
                                                                System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                                int opCerta = ler.nextInt();
                                                                Administrador.OpcaoCerta(perguntas, opcoes);
                                                            }
                                                            //
                                                            for (int i = 1; i <= opcoes.size(); i++){
                                                                System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                                Administrador.OpcaoCerta(perguntas, opcoes);
                                                            }
                                                            System.out.println("");
                                                        break;
                                                    case 3:
                                                        System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                               for (int i = 1; i <= nPerguntas; i++) {
                                                                   System.out.print("Pergunta [" +i+ "]: ");
                                                                   String  pergunta = ler.nextLine();
                                                                   
                                                                   //
                                                                   System.out.println("Digite as respostas [" + i + "]:");
                                                                   String resposta = ler.nextLine();
                                                                   Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                               }
                                                            
                                                               System.out.println("");
                                                            //ler.nextLine();

                                                            System.out.println("-----PERGUNTAS-----");
                                                            //
                                                            Administrador.ImprimirPergunta(perguntas);
                                                            
                                                            System.out.println("");
                                                            System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                            for (int i = 1; i <= nPerguntas ; i++) {
                                                                System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.print("Opcao [" + j + "]: ");
                                                                    String  opResposta = ler.nextLine();
                                                                    //
                                                                    Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                                }
                                                            }
                                                            
                                                            
                                                            System.out.println("");
                                                            
                                                            System.out.println("-----OPCOES-----");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.println("PERGUNTA [" + j + "]:");
                                                                    Administrador.ImprimirOpcoes(opcoes);
                                                                }
                                                            
                                                            ler.nextLine();
                                                            
                                                            for (int i = 1; i <= opcoes.size(); i++){
                                                                System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                                int opCerta = ler.nextInt();
                                                                Administrador.OpcaoCerta(perguntas, opcoes);
                                                            }
                                                            //
                                                            for (int i = 1; i <= opcoes.size(); i++){
                                                                System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                                Administrador.OpcaoCerta(perguntas, opcoes);
                                                            }
                                                            System.out.println("");
                                                        break;
                                                    case 4:
                                                        System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            
                                                               for (int i = 1; i <= nPerguntas; i++) {
                                                                   System.out.print("Pergunta [" +i+ "]: ");
                                                                   String  pergunta = ler.nextLine();
                                                                   
                                                                   //
                                                                   System.out.println("Digite as respostas [" + i + "]:");
                                                                   String resposta = ler.nextLine();
                                                                   Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                               }
                                                            
                                                               System.out.println("");
                                                            //ler.nextLine();

                                                            System.out.println("-----PERGUNTAS-----");
                                                            //
                                                            Administrador.ImprimirPergunta(perguntas);
                                                            
                                                            System.out.println("");
                                                            System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                            for (int i = 1; i <= nPerguntas ; i++) {
                                                                System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.print("Opcao [" + j + "]: ");
                                                                    String  opResposta = ler.nextLine();
                                                                    //
                                                                    Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                                }
                                                            }
                                                            
                                                            
                                                            System.out.println("");
                                                            
                                                            System.out.println("-----OPCOES-----");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.println("PERGUNTA [" + j + "]:");
                                                                    Administrador.ImprimirOpcoes(opcoes);
                                                                }
                                                            
                                                            ler.nextLine();
                                                            
                                                            for (int i = 1; i <= opcoes.size(); i++){
                                                                System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                                int opCerta = ler.nextInt();
                                                                Administrador.OpcaoCerta(perguntas, opcoes);
                                                            }
                                                            //
                                                            for (int i = 1; i <= opcoes.size(); i++){
                                                                System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                                Administrador.OpcaoCerta(perguntas, opcoes);
                                                            }
                                                            System.out.println("");
                                                        break;
                                                }
                                            }    
                                        case 2:
                                            System.out.println("Quantos temas deseja inserir? ");
                                            nTemas = ler.nextInt();

                                            ler.nextLine();

                                            while (!(nTemas == 3)) {                                        
                                                System.out.println("Deve ter 3 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----PREENCHIMENTO DOS TEMAS PARA ESTE NIVEL-----");
                                            ArrayList <String> temas = new ArrayList <String>();
                                            
                                            if (nTemas == 3){
                                                for (int i = 1; i <= 3; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();

                                                    //
                                                    Administrador.PreencherTema(temas, tema);
                                                }
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----TEMAS-----");
                                            
                                            //
                                            Administrador.ImprimirTema(temas);

                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }
                                            
                                            System.out.println("");
                                            //ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                           // System.out.println("");
                                            /*while ((temaP < 1 || temaP > temas.size())) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                           //if (temaP > 0 && temaP <= temas.size()) {
                                            ler.nextLine();
                                            
                                            //System.out.println("");
                                            if (nPerguntas == 3 || nPerguntas == 4) {
                                                switch (temaP ){ //temas.size()
                                                    case 1:
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                System.out.print("Pergunta [" +i+ "]: ");
                                                                String  pergunta = ler.nextLine();

                                                                //
                                                                System.out.println("Digite as respostas [" + i + "]:");
                                                                String resposta = ler.nextLine();
                                                                Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                            }

                                                            System.out.println("");
                                                            //ler.nextLine();

                                                            System.out.println("-----PERGUNTAS-----");
                                                            //
                                                            Administrador.ImprimirPergunta(perguntas);

                                                            System.out.println("");
                                                            System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                            for (int i = 1; i <= nPerguntas ; i++) {
                                                                System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.print("Opcao [" + j + "]: ");
                                                                    String  opResposta = ler.nextLine();
                                                                    //
                                                                    Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                                }
                                                            }


                                                            System.out.println("");

                                                         System.out.println("-----OPCOES-----");
                                                             for (int j = 1; j <= nPerguntas; j++) {
                                                                 System.out.println("PERGUNTA [" + j + "]:");
                                                                 Administrador.ImprimirOpcoes(opcoes);
                                                             }

                                                         ler.nextLine();

                                                         for (int i = 1; i <= opcoes.size(); i++){
                                                             System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                             int opCerta = ler.nextInt();
                                                             Administrador.OpcaoCerta(perguntas, opcoes);
                                                         }
                                                         //
                                                         for (int i = 1; i <= opcoes.size(); i++){
                                                             System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                             Administrador.OpcaoCerta(perguntas, opcoes);
                                                         }
                                                         System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("Quantos temas deseja inserir? ");
                                            nTemas = ler.nextInt();

                                            ler.nextLine();

                                            while (!(nTemas == 3)) {                                        
                                                System.out.println("Deve ter 3 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----PREENCHIMENTO DOS TEMAS PARA ESTE NIVEL-----");
                                            ArrayList <String> temas = new ArrayList <String>();
                                            
                                            if (nTemas == 3){
                                                for (int i = 1; i <= 3; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();

                                                    //
                                                    Administrador.PreencherTema(temas, tema);
                                                }
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----TEMAS-----");
                                            
                                            //
                                            Administrador.ImprimirTema(temas);

                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }
                                            
                                            System.out.println("");
                                            //ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                           // System.out.println("");
                                            /*while ((temaP < 1 || temaP > temas.size())) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                           //if (temaP > 0 && temaP <= temas.size()) {
                                            ler.nextLine();
                                            
                                            //System.out.println("");
                                            if (nPerguntas == 3 || nPerguntas == 4) {
                                                switch (temaP ){ //temas.size()
                                                    case 1:
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                System.out.print("Pergunta [" +i+ "]: ");
                                                                String  pergunta = ler.nextLine();

                                                                //
                                                                System.out.println("Digite as respostas [" + i + "]:");
                                                                String resposta = ler.nextLine();
                                                                Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                            }

                                                            System.out.println("");
                                                            //ler.nextLine();

                                                            System.out.println("-----PERGUNTAS-----");
                                                            //
                                                            Administrador.ImprimirPergunta(perguntas);

                                                            System.out.println("");
                                                            System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                            for (int i = 1; i <= nPerguntas ; i++) {
                                                                System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.print("Opcao [" + j + "]: ");
                                                                    String  opResposta = ler.nextLine();
                                                                    //
                                                                    Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                                }
                                                            }


                                                            System.out.println("");

                                                         System.out.println("-----OPCOES-----");
                                                             for (int j = 1; j <= nPerguntas; j++) {
                                                                 System.out.println("PERGUNTA [" + j + "]:");
                                                                 Administrador.ImprimirOpcoes(opcoes);
                                                             }

                                                         ler.nextLine();

                                                         for (int i = 1; i <= opcoes.size(); i++){
                                                             System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                             int opCerta = ler.nextInt();
                                                             Administrador.OpcaoCerta(perguntas, opcoes);
                                                         }
                                                         //
                                                         for (int i = 1; i <= opcoes.size(); i++){
                                                             System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                             Administrador.OpcaoCerta(perguntas, opcoes);
                                                         }
                                                         System.out.println("");
                                            break;
                                        case 4:
                                            System.out.println("Quantos temas deseja inserir? ");
                                            nTemas = ler.nextInt();

                                            ler.nextLine();

                                            while (!(nTemas == 3)) {                                        
                                                System.out.println("Deve ter 3 temas!");
                                                System.out.println("Digite novamente! ");
                                                nTemas = ler.nextInt();
                                                break;
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----PREENCHIMENTO DOS TEMAS PARA ESTE NIVEL-----");
                                            ArrayList <String> temas = new ArrayList <String>();
                                            
                                            if (nTemas == 3){
                                                for (int i = 1; i <= 3; i++) {
                                                    System.out.print("Tema [" + i + "]: ");
                                                    String tema = ler.nextLine();

                                                    //
                                                    Administrador.PreencherTema(temas, tema);
                                                }
                                            }

                                            //ler.nextLine();
                                            System.out.println("");
                                            
                                            System.out.println("-----TEMAS-----");
                                            
                                            //
                                            Administrador.ImprimirTema(temas);

                                            System.out.println("");
                                            System.out.println("Digite o numero de perguntas que deseja inserir:");
                                            nPerguntas = ler.nextInt();

                                            while (!(nPerguntas == 3 || nPerguntas == 4) ) {                                            
                                                System.out.println("O jogo deve possuir no minimo 3 perguntas!");
                                                System.out.println("Digite novamente o numero de perguntas que deseja inserir: ");
                                                nPerguntas = ler.nextInt();
                                            }
                                            
                                            System.out.println("");
                                            //ler.nextLine();

                                            System.out.println("Digite qual o tema que deseja que a pergunta seja inserida:");
                                            temaP = ler.nextInt();

                                           // System.out.println("");
                                            /*while ((temaP < 1 || temaP > temas.size())) {
                                                System.out.println("Deve selecionar as opcoes disponiveis!");
                                                System.out.println("Digite navamente o tema que deseja que a pergunta seja inserida!");
                                                temaP = ler.nextInt();
                                            }*/
                                           //if (temaP > 0 && temaP <= temas.size()) {
                                            ler.nextLine();
                                            
                                            //System.out.println("");
                                            if (nPerguntas == 3 || nPerguntas == 4) {
                                                switch (temaP ){ //temas.size()
                                                    case 1:
                                                            System.out.println("-----PREENCHIMENTO DAS PERGUNTAS PARA ESTE NIVEL-----");
                                                            
                                                            for (int i = 1; i <= nPerguntas; i++) {
                                                                System.out.print("Pergunta [" +i+ "]: ");
                                                                String  pergunta = ler.nextLine();

                                                                //
                                                                System.out.println("Digite as respostas [" + i + "]:");
                                                                String resposta = ler.nextLine();
                                                                Administrador.PerguntaResposta(perguntas, respostas, pergunta, resposta);
                                                            }

                                                            System.out.println("");
                                                            //ler.nextLine();

                                                            System.out.println("-----PERGUNTAS-----");
                                                            //
                                                            Administrador.ImprimirPergunta(perguntas);

                                                            System.out.println("");
                                                            System.out.println("-----OPCOES DAS RESPOSTAS-----");
                                                            for (int i = 1; i <= nPerguntas ; i++) {
                                                                System.out.println("OPCOES DE RESPOSTAS DA PERGUNTA [" + i + "]:");
                                                                for (int j = 1; j <= nPerguntas; j++) {
                                                                    System.out.print("Opcao [" + j + "]: ");
                                                                    String  opResposta = ler.nextLine();
                                                                    //
                                                                    Administrador.PreencherOpcoesDasRespotas(opcoes, opResposta);
                                                                }
                                                            }


                                                            System.out.println("");

                                                         System.out.println("-----OPCOES-----");
                                                             for (int j = 1; j <= nPerguntas; j++) {
                                                                 System.out.println("PERGUNTA [" + j + "]:");
                                                                 Administrador.ImprimirOpcoes(opcoes);
                                                             }

                                                         ler.nextLine();

                                                         for (int i = 1; i <= opcoes.size(); i++){
                                                             System.out.println("Selcione a opcao certa da pergunta [" + i + "]:");
                                                             int opCerta = ler.nextInt();
                                                             Administrador.OpcaoCerta(perguntas, opcoes);
                                                         }
                                                         //
                                                         for (int i = 1; i <= opcoes.size(); i++){
                                                             System.out.println("RESPOSTA DA OPCAO [" + i + "]:");
                                                             Administrador.OpcaoCerta(perguntas, opcoes);
                                                         }
                                                         System.out.println("");
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
