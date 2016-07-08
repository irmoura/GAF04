/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import static Codigos.Pasta.DIRETORIO_PRINCIPAL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ibyte
 */
public class Arquivo {
    
    public static String nome_primeiro_tecnico;
    public static String nome_segundo_tecnico;
    public static String nome_terceiro_tecnico;
    public static String nome_quarto_tecnico;
    public static String nome_quinto_tecnico;
    public static String linha;
    public static String[] linhas;
    public static String[] palavras_separadas_linha_1;
    public static String[] palavras_separadas_linha_2;
    public static String[] palavras_separadas_linha_3;
    public static String[] palavras_separadas_linha_4;
    public static String[] palavras_separadas_linha_5;
    
    public static FileWriter informacoes;
    
    public static int qtdLinha;
    
    public static void criar(String nomedoarquivo){
        java.io.File tecnicos = new java.io.File(DIRETORIO_PRINCIPAL,nomedoarquivo+".txt");
        try {
            tecnicos.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void gravar(String d1, String d2, String d3, String d4, String d5, String d6){
        try {
            informacoes = new FileWriter("C:\\GAF04\\"+"Registros.txt");
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(informacoes);
        {
              gravarArq.println(""+d1);
              gravarArq.println(""+d2);
              gravarArq.println(""+d3);
              gravarArq.println(""+d4);
              gravarArq.println(""+d5);
              gravarArq.println(""+d6);
        }
        try {
            informacoes.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void quantidadeDeLinha(String nomedoarquivo){
        File arquivoLeitura = new File(DIRETORIO_PRINCIPAL,nomedoarquivo+".txt");
        LineNumberReader linhaLeitura = null;
        try {
            linhaLeitura = new LineNumberReader(new FileReader(arquivoLeitura));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            linhaLeitura.skip(arquivoLeitura.length());
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        qtdLinha = linhaLeitura.getLineNumber();
        linhas = new String[(qtdLinha+1)];
    }
    public static void ler(String nomedoarquivo){
        quantidadeDeLinha(nomedoarquivo);
        File arquivo = new File("C:\\GAF04\\"+nomedoarquivo+".txt");
        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            try {
                for(int i = 0; i < (qtdLinha+1); i++){
                linhas[i] = bufferedReader.readLine();
            }
                
            } catch (IOException ex) {
                Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[0];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                palavras_separadas_linha_1 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    palavras_separadas_linha_1[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[1];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                palavras_separadas_linha_2 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    palavras_separadas_linha_2[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[2];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                palavras_separadas_linha_3 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    palavras_separadas_linha_3[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[3];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                palavras_separadas_linha_4 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    palavras_separadas_linha_4[j] = s[j];
                }
        }
        /////////////////
        for(int i = 0; i < (qtdLinha+1); i++){
                linha = linhas[4];
                linha = linha.replace(" ",";");
                String[] s = linha.split(";");
            
                palavras_separadas_linha_5 = new String[s.length];
        
                for(int j = 0; j < s.length; j++){
                    palavras_separadas_linha_5[j] = s[j];
                }
        }
        /////////////////
    }
}