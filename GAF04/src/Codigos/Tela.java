/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import static Codigos.Arquivo.palavras_separadas_linha_1;
import static Codigos.Arquivo.palavras_separadas_linha_2;
import static Codigos.Arquivo.palavras_separadas_linha_3;
import static Codigos.Arquivo.palavras_separadas_linha_4;
import static Codigos.Arquivo.palavras_separadas_linha_5;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ibyte
 */
public class Tela extends javax.swing.JFrame {
    
    public int v;//Vez
    public int TDA;//Total de Atendimentos
    public int AT1;//Atendimentos Técnico 1
    public int AT2;//Atendimentos Técnico 2
    public int AT3;//Atendimentos Técnico 3
    public int AT4;//Atendimentos Técnico 4
    public int AT5;//Atendimentos Técnico 5
    public int contador;
    
    public int HCT1 = 13;//Hora Chegada Técnico 1
    public int MCT1 = 40;//Minuto Chegada Técnico 1
    public int HST1 = 22;//Hora Saida Técnico 1
    public int MST1 = 0;//Minuto Saida Técnico 1
    public String ET1 = "13:40:00";//Entrada Técnico 1
    public String ST1 = "22:00:00";//Saida Técnico 1
    
    public int HCT2 = 13;//Hora Chegada Técnico 2
    public int MCT2 = 40;//Minuto Chegada Técnico 2
    public int HST2 = 22;//Hora Saida Técnico 2
    public int MST2 = 0;//Minuto Saida Técnico 2
    public String ET2 = "13:40:00";//Entrada Técnico 2
    public String ST2 = "22:00:00";//Saida Técnico 2
    
    public int HCT3 = 13;//Hora Chegada Técnico 3
    public int MCT3 = 40;//Minuto Chegada Técnico 3
    public int HST3 = 22;//Hora Saida Técnico 3
    public int MST3 = 0;//Minuto Saida Técnico 3
    public String ET3 = "13:40:00";//Entrada Técnico 3
    public String ST3 = "22:00:00";//Saida Técnico 3
    
    public int HCT4 = 13;//Hora Chegada Técnico 4
    public int MCT4 = 40;//Minuto Chegada Técnico 4
    public int HST4 = 22;//Hora Saida Técnico 4
    public int MST4 = 0;//Minuto Saida Técnico 4
    public String ET4 = "13:40:00";//Entrada Técnico 4
    public String ST4 = "22:00:00";//Saida Técnico 4
    
    public int HCT5 = 10;//Hora Chegada Técnico 5
    public int MCT5 = 0;//Minuto Chegada Técnico 5
    public int HST5 = 18;//Hora Saida Técnico 5
    public int MST5 = 20;//Minuto Saida Técnico 5
    public String ET5 = "10:00:00";//Entrada Técnico 5
    public String ST5 = "18:20:00";//Saida Técnico 5
    
    public int hora, minuto, segundo;
    public String horas;
    public Calendar now;
    public Color red = Color.red;
    public Color black = Color.BLACK;
    public Timer timer;
    public Boolean ativar = false;//FALSE == ATIVADO
    public Boolean desativar = true;//TRUE == DESATIVADO
    
    public Password password;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    public void obterHoras(){
        now = Calendar.getInstance();
        horas = String.format("%1$tH:%1$tM:%1$tS", now);//HORAS NO FORMATO 13:00:00
        hora = Integer.parseInt(String.format("%1$tH", now));//HORAS 13
        minuto = Integer.parseInt(String.format("%1$tM", now));//MINUTO 00
        segundo = Integer.parseInt(String.format("%1$tS", now));//SEGUNDO
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TEXTO_TOTAL = new javax.swing.JLabel();
        TEXTO_HORA = new javax.swing.JLabel();
        TEC_1_BTN = new javax.swing.JToggleButton();
        TEC_2_BTN = new javax.swing.JToggleButton();
        TEC_3_BTN = new javax.swing.JToggleButton();
        TEC_4_BTN = new javax.swing.JToggleButton();
        TEC_5_BTN = new javax.swing.JToggleButton();
        BOTAO_ZERAR = new javax.swing.JButton();
        TEXTO_NOME_DA_VEZ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PAPEL_DE_PAREDE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXTO_TOTAL.setText("Atendimentos : ");
        jDesktopPane1.add(TEXTO_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        TEXTO_HORA.setText("00:00:00");
        jDesktopPane1.add(TEXTO_HORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        TEC_1_BTN.setText("Técnico 1");
        TEC_1_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_1_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_1_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        TEC_2_BTN.setText("Técnico 2");
        TEC_2_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_2_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_2_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        TEC_3_BTN.setText("Técnico 3");
        TEC_3_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_3_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_3_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        TEC_4_BTN.setText("Técnico 4");
        TEC_4_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_4_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_4_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        TEC_5_BTN.setText("Técnico 5");
        TEC_5_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TEC_5_BTNMouseClicked(evt);
            }
        });
        jDesktopPane1.add(TEC_5_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        BOTAO_ZERAR.setText("Zerar");
        BOTAO_ZERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_ZERARActionPerformed(evt);
            }
        });
        jDesktopPane1.add(BOTAO_ZERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        TEXTO_NOME_DA_VEZ.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        TEXTO_NOME_DA_VEZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDesktopPane1.add(TEXTO_NOME_DA_VEZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 646, 106));

        jLabel1.setText("Desenvolvedor : Ismael Ribeiro");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        PAPEL_DE_PAREDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Codigos/Imagens/vistamizer-windows-vista-wallpaper-pack-14.jpg"))); // NOI18N
        jDesktopPane1.add(PAPEL_DE_PAREDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        password = new Password();
        obterHoras();//OBTEM A HORA EM QUE O PROGRAMA É ABERTO
        Codigos.Pasta.criar("GAF04");//Cria a pasta principal do programa C:\\GaF02
        Codigos.Arquivo.criar("Tecnicos");//Cria o arquivo principal do programa C:\\GaF02\\Tecnicos.txt
        Codigos.Arquivo.criar("Registros");//Cria o arquivo C:\\GaF02\\Registros.txt
        Codigos.Arquivo.ler("Tecnicos");//Faz a leitura do arquivo principal C:\\GaF02\\Tecnicos.txt
        
        BOTAO_ZERAR.setEnabled(false);//INICIA COM O BOTAO ZERAR DESATIVADO
        TEXTO_NOME_DA_VEZ.setForeground(black);//DEFINE A COR PADRAO
        
        ////////////////////////////////////////////////////////////////////////
        /*TÉCNICOS QUE INICIAM DESABILITADOS*/
        TEC_1_BTN.setText(""+palavras_separadas_linha_1[0]);
        TEC_1_BTN.setEnabled(false);
        TEC_1_BTN.setSelected(true);
        
        TEC_2_BTN.setText(""+palavras_separadas_linha_2[0]);
        TEC_2_BTN.setEnabled(false);
        TEC_2_BTN.setSelected(true);
        
        TEC_3_BTN.setText(""+palavras_separadas_linha_3[0]);
        TEC_3_BTN.setEnabled(false);
        TEC_3_BTN.setSelected(true);
        
        TEC_4_BTN.setText(""+palavras_separadas_linha_4[0]);
        TEC_4_BTN.setEnabled(false);
        TEC_4_BTN.setSelected(true);
        
        TEC_5_BTN.setText(""+palavras_separadas_linha_5[0]);
        TEC_5_BTN.setEnabled(false);
        TEC_5_BTN.setSelected(true);
        ////////////////////////////////////////////////////////////////////////
        
        timer = new Timer(1000, (ActionEvent e) -> {
            
            contador++;
            
            obterHoras();

            TEXTO_HORA.setText(horas);
            ////////////////////////////////////////////////////////////////////
            /*TÉCNICOS HABILITADOS NA HORA E MINUTO DEFINIDOS*/
            if(horas.equals(ET1)){
                TEC_1_BTN.setEnabled(true);
                TEC_1_BTN.setSelected(ativar);
                TEC_1_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET2)){
                TEC_2_BTN.setEnabled(true);
                TEC_2_BTN.setSelected(ativar);
                TEC_2_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET3)){
                TEC_3_BTN.setEnabled(true);
                TEC_3_BTN.setSelected(ativar);
                TEC_3_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET4)){
                TEC_4_BTN.setEnabled(true);
                TEC_4_BTN.setSelected(ativar);
                TEC_4_BTN.setBackground(Color.green);
            }
            if(horas.equals(ET5)){
                TEC_5_BTN.setEnabled(true);
                TEC_5_BTN.setSelected(ativar);
                TEC_5_BTN.setBackground(Color.green);
            }
            ////////////////////////////////////////////////////////////////////
            /*TÉCNICOS DESABILITADOS NA HORA E MINUTO DEFINIDOS*/
            if(horas.equals(ST1)){
                TEC_1_BTN.setEnabled(false);
            }
            if(horas.equals(ST2)){
                TEC_2_BTN.setEnabled(false);
            }
            if(horas.equals(ST3)){
                TEC_3_BTN.setEnabled(false);
            }
            if(horas.equals(ST4)){
                TEC_4_BTN.setEnabled(false);
            }
            if(horas.equals(ST5)){
                TEC_5_BTN.setEnabled(false);
            }
            ////////////////////////////////////////////////////////////////////
        });
        
        timer.start();
        
        ////////////////////////////////////////////////////////////////////////
        /*DEPOIS DO HORARIO DE CHEGADA O BOTAO INICIA HABILITADO*/
        if((hora >= HCT1 && minuto >= MCT1) ||
           (hora > HCT1)){
            TEC_1_BTN.setEnabled(true);
            TEC_1_BTN.setSelected(false);
            TEC_1_BTN.setBackground(Color.green);
            TEC_1_BTN.setText(""+palavras_separadas_linha_1[0]);
        }
        if((hora >= HCT2 && minuto >= MCT2) ||
           (hora > HCT2)){
            TEC_2_BTN.setEnabled(true);
            TEC_2_BTN.setSelected(false);
            TEC_2_BTN.setBackground(Color.green);
            TEC_2_BTN.setText(""+palavras_separadas_linha_2[0]);
        }
        if((hora >= HCT3 && minuto >= MCT3) ||
           (hora > HCT3)){
            TEC_3_BTN.setEnabled(true);
            TEC_3_BTN.setSelected(false);
            TEC_3_BTN.setBackground(Color.green);
            TEC_3_BTN.setText(""+palavras_separadas_linha_3[0]);
        }
        if((hora >= HCT4 && minuto >= MCT4) ||
           (hora > HCT4)){
            TEC_4_BTN.setEnabled(true);
            TEC_4_BTN.setSelected(false);
            TEC_4_BTN.setBackground(Color.green);
            TEC_4_BTN.setText(""+palavras_separadas_linha_4[0]);
        }
        if((hora >= HCT5 && minuto >= MCT5) ||
           (hora > HCT5)){
            TEC_5_BTN.setEnabled(true);
            TEC_5_BTN.setSelected(false);
            TEC_5_BTN.setBackground(Color.green);
            TEC_5_BTN.setText(""+palavras_separadas_linha_5[0]);
        }
        ////////////////////////////////////////////////////////////////////////
        /*ANTES DO HORARIO O BOTAO INICIA DESABILITADO*/
        if((hora <= HCT1 && minuto < MCT1)){
            TEC_1_BTN.setEnabled(false);
            TEC_1_BTN.setSelected(true);
            TEC_1_BTN.setBackground(Color.red);
            TEC_1_BTN.setText(""+palavras_separadas_linha_1[0]);
        }
        if((hora <= HCT2 && minuto < MCT2)){
            TEC_2_BTN.setEnabled(false);
            TEC_2_BTN.setSelected(true);
            TEC_2_BTN.setBackground(Color.red);
            TEC_2_BTN.setText(""+palavras_separadas_linha_2[0]);
        }
        if((hora <= HCT3 && minuto < MCT3)){
            TEC_3_BTN.setEnabled(false);
            TEC_3_BTN.setSelected(true);
            TEC_3_BTN.setBackground(Color.red);
            TEC_3_BTN.setText(""+palavras_separadas_linha_3[0]);
        }
        if((hora <= HCT4 && minuto < MCT4)){
            TEC_4_BTN.setEnabled(false);
            TEC_4_BTN.setSelected(true);
            TEC_4_BTN.setBackground(Color.red);
            TEC_4_BTN.setText(""+palavras_separadas_linha_4[0]);
        }
        if((hora <= HCT5 && minuto < MCT5)){
            TEC_5_BTN.setEnabled(false);
            TEC_5_BTN.setSelected(true);
            TEC_5_BTN.setBackground(Color.red);
            TEC_5_BTN.setText(""+palavras_separadas_linha_5[0]);
        }
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        /*ESTES TÉCNICOS INICIAM HABILITADOS*/
        /*TEC_5_BTN.setEnabled(true);
        TEC_5_BTN.setSelected(false);
        TEC_5_BTN.setBackground(Color.green);
        TEC_5_BTN.setText(""+palavras_separadas_linha_5[0]);*/
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        /*DEPOIS DO HORARIO O BOTAO INICIA DESABILITADO*/
        if((hora >= HST1 && minuto >= MST1)){
            TEC_1_BTN.setEnabled(false);
        }
        if((hora >= HST2 && minuto >= MST2)){
            TEC_2_BTN.setEnabled(false);
        }
        if((hora >= HST3 && minuto >= MST3)){
            TEC_3_BTN.setEnabled(false);
        }
        if((hora >= HST4 && minuto >= MST4)){
            TEC_4_BTN.setEnabled(false);
        }
        if((hora >= HST5 && minuto >= MST5)){
            TEC_5_BTN.setEnabled(false);
        }
        ////////////////////////////////////////////////////////////////////////
        
    }//GEN-LAST:event_formWindowOpened

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        BOTAO_ZERAR.setEnabled(desativar);//Ao primeiro clique habilita o botão zerar
        
        v++;//A cada clique incrementa +1

        ////////////////////////////////////////////////////////////////////////
        /*SE NENHUM BOTAO ESTIVER HABILITADO*/
        if((TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()) || 
          (!TEC_1_BTN.isEnabled() && !TEC_2_BTN.isEnabled() && !TEC_3_BTN.isEnabled() && !TEC_4_BTN.isEnabled() && !TEC_5_BTN.isEnabled())){
            JOptionPane.showMessageDialog(null,"Habilite pelo menos um Técnico.","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        if(v == 1 && (TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && !TEC_5_BTN.isSelected()) || 
          (!TEC_1_BTN.isEnabled() && !TEC_2_BTN.isEnabled() && !TEC_3_BTN.isEnabled() && !TEC_4_BTN.isEnabled() && TEC_5_BTN.isEnabled())){
            
            TEXTO_NOME_DA_VEZ.setText(palavras_separadas_linha_5[0]+" - "+palavras_separadas_linha_5[1]);
            AT5++;
            TEC_5_BTN.setText(palavras_separadas_linha_5[0]+" - "+AT5);
            TDA++;
            
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 2º O 3º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
        if(v == 5 && !TEC_2_BTN.isSelected() && !TEC_3_BTN.isSelected() && TEC_1_BTN.isSelected() && !TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v = v - 4;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 3º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
        if(v == 5 && TEC_2_BTN.isSelected() && !TEC_3_BTN.isSelected() && TEC_1_BTN.isSelected() && !TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v = v - 3;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 2º E O 3º TÉCNICO ESTIVEREM HABILITADOS*/
        if(v == 4 && !TEC_2_BTN.isSelected() && !TEC_3_BTN.isSelected() && TEC_1_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v = v - 2;
        }
        ////////////////////////////////////////////////////////////////////////
        /*NA VEZ DO TÉCNICO E O MESMO ESTIVER DESABILITADO*/
        if(v == 1 && TEC_1_BTN.isSelected() || v == 1 && !TEC_1_BTN.isEnabled()){
            v++;
        }
        if(v == 2 && TEC_2_BTN.isSelected() || v == 2 && !TEC_2_BTN.isEnabled()){
            v++;
        }
        if(v == 3 && TEC_3_BTN.isSelected() || v == 3 && !TEC_3_BTN.isEnabled()){
            v++;
        }
        if(v == 4 && TEC_4_BTN.isSelected() || v == 4 && !TEC_4_BTN.isEnabled()){
            v++;
        }
        if(v == 5 && TEC_5_BTN.isSelected() || v == 5 && !TEC_3_BTN.isEnabled()){
            v=1;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 2º TÉCNICO ESTIVER HABILITADO*/
        if(TEC_1_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v=2;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 3º TÉCNICO ESTIVER HABILITADO*/
        if(TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_4_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v=3;
        }
        ////////////////////////////////////////////////////////////////////////
        /*SE APENAS O 4º TÉCNICO ESTIVER HABILITADO*/
        if(TEC_1_BTN.isSelected() && TEC_2_BTN.isSelected() && TEC_3_BTN.isSelected() && TEC_5_BTN.isSelected()){
            v=4;
        }
        ////////////////////////////////////////////////////////////////////////
        /*NA VEZ DO TÉCNICO E O MESMO ESTIVER HABILITADO*/
        if(v == 1 && !TEC_1_BTN.isSelected()){
            
            TEXTO_NOME_DA_VEZ.setText(palavras_separadas_linha_1[0]+" - "+palavras_separadas_linha_1[1]);
            AT1++;
            TEC_1_BTN.setText(palavras_separadas_linha_1[0]+" - "+AT1);
            TDA++;
            
        }
        if(v == 2 && !TEC_2_BTN.isSelected()){
            
            TEXTO_NOME_DA_VEZ.setText(palavras_separadas_linha_2[0]+" - "+palavras_separadas_linha_2[1]);
            AT2++;
            TEC_2_BTN.setText(palavras_separadas_linha_2[0]+" - "+AT2);
            TDA++;
            
        }
        if(v == 3 && !TEC_3_BTN.isSelected()){ 
            
            TEXTO_NOME_DA_VEZ.setText(palavras_separadas_linha_3[0]+" - "+palavras_separadas_linha_3[1]);
            AT3++;
            TEC_3_BTN.setText(palavras_separadas_linha_3[0]+" - "+AT3);
            TDA++;
            
        }
        if(v == 4 && !TEC_4_BTN.isSelected()){ 
            
            TEXTO_NOME_DA_VEZ.setText(palavras_separadas_linha_4[0]+" - "+palavras_separadas_linha_4[1]);
            AT4++;
            TEC_4_BTN.setText(palavras_separadas_linha_4[0]+" - "+AT4);
            TDA++;
            
        }
        if(v == 5 && !TEC_5_BTN.isSelected()){ 
            
            TEXTO_NOME_DA_VEZ.setText(palavras_separadas_linha_5[0]+" - "+palavras_separadas_linha_5[1]);
            AT5++;
            TEC_5_BTN.setText(palavras_separadas_linha_5[0]+" - "+AT5);
            TDA++;
            
            v = 0;
        }
        ////////////////////////////////////////////////////////////////////////
        /*NA VEZ DO ÚLTIMO TÉCNICO E O MESMO ESTIVER DESABILITADO*/
        if(v == 5 && TEC_5_BTN.isSelected() || v == 5 && !TEC_5_BTN.isEnabled()){
            v = 0;
        }
        ////////////////////////////////////////////////////////////////////////
        TEXTO_TOTAL.setText("Atendimentos : "+TDA);
        
        Codigos.Arquivo.gravar("Total de atendimentos: "+TDA,
                               palavras_separadas_linha_1[0]+" = "+AT1,
                               palavras_separadas_linha_2[0]+" = "+AT2,
                               palavras_separadas_linha_3[0]+" = "+AT3);
        
    }//GEN-LAST:event_formMouseClicked

    private void BOTAO_ZERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_ZERARActionPerformed
        // TODO add your handling code here:
        
        Object[] options = { "Sim", "Não" };   
        int opcao = JOptionPane.showOptionDialog(null,"Deseja zerar a contagem ?","Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);   
  
        if (opcao != 0){
        //JOptionPane.showMessageDialog(null,"");
        }else{
              
            String senha = "";
            int tentativas = 3;//Define o número de tentativas que o usuário terá para acertar a senha.
            
            for(int i=0;i<tentativas;i++)
            {
                if(!senha.equals(password.senha))      
                {
                    
                    senha = JOptionPane.showInputDialog(null,"Password: ","Warning "+(i+1)+"ª tentativa.",JOptionPane.OK_CANCEL_OPTION);
                    
                }    
            }
            if (!senha.equals(password.senha) || senha.equals(null))    
            {
                JOptionPane.showMessageDialog(null,"Senha incorreta ou operação cancelada","Aviso",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                v = 0;
                TDA = 0;
                AT1 = 0;
                AT2 = 0;
                AT3 = 0;
                AT4 = 0;
                AT5 = 0;
                TEXTO_TOTAL.setText("ATENDIMENTOS : ");
                TEXTO_NOME_DA_VEZ.setText("");
                TEC_1_BTN.setText(""+palavras_separadas_linha_1[0]);
                TEC_2_BTN.setText(""+palavras_separadas_linha_2[0]);
                TEC_3_BTN.setText(""+palavras_separadas_linha_3[0]);
                TEC_4_BTN.setText(""+palavras_separadas_linha_4[0]);
                TEC_5_BTN.setText(""+palavras_separadas_linha_5[0]);
                BOTAO_ZERAR.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_BOTAO_ZERARActionPerformed

    private void TEC_1_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_1_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_1_BTN.isSelected()){
            TEC_1_BTN.setSelected(true);
            TEC_1_BTN.setBackground(Color.red);
        }else{
            TEC_1_BTN.setSelected(false);
            TEC_1_BTN.setBackground(Color.green);
        }  
    }//GEN-LAST:event_TEC_1_BTNMouseClicked

    private void TEC_2_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_2_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_2_BTN.isSelected()){
            TEC_2_BTN.setSelected(true);
            TEC_2_BTN.setBackground(Color.red);
        }else{
            TEC_2_BTN.setSelected(false);
            TEC_2_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_2_BTNMouseClicked

    private void TEC_3_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_3_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_3_BTN.isSelected()){
            TEC_3_BTN.setSelected(true);
            TEC_3_BTN.setBackground(Color.red);
        }else{
            TEC_3_BTN.setSelected(false);
            TEC_3_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_3_BTNMouseClicked

    private void TEC_4_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_4_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_4_BTN.isSelected()){
            TEC_4_BTN.setSelected(true);
            TEC_4_BTN.setBackground(Color.red);
        }else{
            TEC_4_BTN.setSelected(false);
            TEC_4_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_4_BTNMouseClicked

    private void TEC_5_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TEC_5_BTNMouseClicked
        // TODO add your handling code here:
        if(TEC_5_BTN.isSelected()){
            TEC_5_BTN.setSelected(true);
            TEC_5_BTN.setBackground(Color.red);
        }else{
            TEC_5_BTN.setSelected(false);
            TEC_5_BTN.setBackground(Color.green);
        }
    }//GEN-LAST:event_TEC_5_BTNMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_ZERAR;
    private javax.swing.JLabel PAPEL_DE_PAREDE;
    private javax.swing.JToggleButton TEC_1_BTN;
    private javax.swing.JToggleButton TEC_2_BTN;
    private javax.swing.JToggleButton TEC_3_BTN;
    private javax.swing.JToggleButton TEC_4_BTN;
    private javax.swing.JToggleButton TEC_5_BTN;
    private javax.swing.JLabel TEXTO_HORA;
    private javax.swing.JLabel TEXTO_NOME_DA_VEZ;
    private javax.swing.JLabel TEXTO_TOTAL;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}