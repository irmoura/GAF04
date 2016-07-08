/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

/**
 *
 * @author Ibyte
 */
public class Pasta {
    
    public static java.io.File DIRETORIO_PRINCIPAL;
    
    public static void criar(String nomedapasta){
        DIRETORIO_PRINCIPAL = new java.io.File("C:\\"+nomedapasta);
        if(DIRETORIO_PRINCIPAL.exists()){
            //System.out.println("Pasta principal já existe");
        }else{
            DIRETORIO_PRINCIPAL.mkdir();
            //System.out.println("Criada a pasta principal.");
        }
    }
}