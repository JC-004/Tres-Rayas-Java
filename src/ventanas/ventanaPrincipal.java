/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.Random;
import java.awt.Toolkit;
/**
 *
 * @author MAFOWS21
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "user1";
    private int matriz[][] = new int[3][3];
    private String user1,user2;    
    private int v1=0,v2=0,emp=0;

    
    
    
    /**
     * Creates new form ventanaPrincipal
     */
    
    
    
    
    
    public ventanaPrincipal(String user1, String user2) {
        
        
        this.user1 = user1;
        this.user2 = user2;
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/ICONOS.png")));
    }
    
    
    private void llenarCasillas(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                casilla[i][j] = true;
            }
        }
    }
    
    private void llenarMatriz(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] =0;
            }
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void dibujaX(JButton boton){ 
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));
        
    }
    private void dibujaO(JButton boton){ 
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/circulo.png")));
        
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        uno_uno = new javax.swing.JButton();
        uno_dos = new javax.swing.JButton();
        uno_tres = new javax.swing.JButton();
        dos_uno = new javax.swing.JButton();
        dos_dos = new javax.swing.JButton();
        dos_tres = new javax.swing.JButton();
        tres_uno = new javax.swing.JButton();
        tres_dos = new javax.swing.JButton();
        tres_tres = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        Formatear = new javax.swing.JMenuItem();
        Historial = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MICHI PERUANO -EN JUEGO");
        setBackground(new java.awt.Color(0, 204, 255));

        panel.setBackground(new java.awt.Color(0, 204, 255));
        panel.setLayout(new java.awt.GridLayout(3, 3));

        uno_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_unoActionPerformed(evt);
            }
        });
        panel.add(uno_uno);

        uno_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_dosActionPerformed(evt);
            }
        });
        panel.add(uno_dos);

        uno_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_tresActionPerformed(evt);
            }
        });
        panel.add(uno_tres);

        dos_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos_unoActionPerformed(evt);
            }
        });
        panel.add(dos_uno);

        dos_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos_dosActionPerformed(evt);
            }
        });
        panel.add(dos_dos);

        dos_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos_tresActionPerformed(evt);
            }
        });
        panel.add(dos_tres);

        tres_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_unoActionPerformed(evt);
            }
        });
        panel.add(tres_uno);

        tres_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_dosActionPerformed(evt);
            }
        });
        panel.add(tres_dos);

        tres_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_tresActionPerformed(evt);
            }
        });
        panel.add(tres_tres);

        menuJuego.setText("Opciones");
        menuJuego.setFont(new java.awt.Font("Elephant", 0, 16)); // NOI18N

        Formatear.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Formatear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png-transparent-arrow-cycle-arrow-fashion-logo-3d-arrows-thumbnail.png"))); // NOI18N
        Formatear.setText("Formatear todo");
        Formatear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatearActionPerformed(evt);
            }
        });
        menuJuego.add(Formatear);

        Historial.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/png-transparent-cutting-boards-graphy-table-bamboo-board-kitchen-rectangle-photography-thumbnail.png"))); // NOI18N
        Historial.setText("Historial de partidas");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        menuJuego.add(Historial);
        menuJuego.add(jSeparator1);

        Salir.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        Salir.setText("Salir ;c");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menuJuego.add(Salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayudin");
        menuAyuda.setFont(new java.awt.Font("Elephant", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void uno_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_dosActionPerformed
        // TODO add your handling code here:
        if(casilla[0][1]==true){
            if(turno.equals("user1")){
                dibujaX(uno_dos);
                matriz[0][1] = 1 ; 
                turno="user2";
            }
            else{
                dibujaO(uno_dos);
                matriz[0][1] = 2 ; 
                turno = "user1";
            }
            casilla[0][1] = false;
            comprobarGanador();
            
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_uno_dosActionPerformed
    
      
    
    
    private void uno_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_unoActionPerformed
        // TODO add your handling code here:
        //verificamos si aun no se a dado click
        if(casilla[0][0]==true){
            if(turno.equals("user1")){
                dibujaX(uno_uno);
                matriz[0][0] = 1;
                turno="user2";
            }
            else{
                dibujaO(uno_uno);
                matriz[0][0]=2;
                turno = "user1";
            }
            casilla[0][0] = false;
            comprobarGanador();
        }
        
            
            
    }//GEN-LAST:event_uno_unoActionPerformed

    private void uno_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno_tresActionPerformed
        // TODO add your handling code here:
        if(casilla[0][2]==true){
            if(turno.equals("user1")){
                dibujaX(uno_tres);
                matriz[0][2] =1  ; 
                turno="user2";
            }
            else{
                dibujaO(uno_tres);
                matriz[0][2] =2  ; 
                turno = "user1";
            }
            casilla[0][2] = false;
            comprobarGanador();
            
        }
        
        
    }//GEN-LAST:event_uno_tresActionPerformed

    private void dos_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos_unoActionPerformed
        // TODO add your handling code here:
        if(casilla[1][0]==true){
            if(turno.equals("user1")){
                dibujaX(dos_uno);
                matriz[1][0] =1  ; 
                turno="user2";
            }
            else{
                dibujaO(dos_uno);
                matriz[1][0] =2  ; 
                turno = "user1";
            }
            casilla[1][0] = false;
            comprobarGanador();
        }
        
        
    }//GEN-LAST:event_dos_unoActionPerformed

    private void dos_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos_dosActionPerformed
        // TODO add your handling code here:
        if(casilla[1][1]==true){
            if(turno.equals("user1")){
                dibujaX(dos_dos);
                matriz[1][1] = 1 ; 
                turno="user2";
            }
            else{
                dibujaO(dos_dos);
                matriz[1][1] =2  ; 
                turno = "user1";
            }
            casilla[1][1] = false;
            comprobarGanador();
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_dos_dosActionPerformed

    private void dos_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos_tresActionPerformed
        // TODO add your handling code here:
        if(casilla[1][2]==true){
            if(turno.equals("user1")){
                dibujaX(dos_tres);
                matriz[1][2] =1  ; 
                turno="user2";
            }
            else{
                dibujaO(dos_tres);
                matriz[1][2] =2  ; 
                turno = "user1";
            }
            casilla[1][2] = false;
            comprobarGanador();
        }
        
    }//GEN-LAST:event_dos_tresActionPerformed

    private void tres_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_unoActionPerformed
        // TODO add your handling code here:
        if(casilla[2][0]==true){
            if(turno.equals("user1")){
                dibujaX(tres_uno);
                matriz[2][0] =1  ; 
                turno="user2";
            }
            else{
                dibujaO(tres_uno);
                matriz[2][0] =2  ; 
                turno = "user1";
            }
            casilla[2][0] = false;
            comprobarGanador();
        }
        
        
    }//GEN-LAST:event_tres_unoActionPerformed

    private void tres_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_dosActionPerformed
        // TODO add your handling code here:
        
        if(casilla[2][1]==true){
            if(turno.equals("user1")){
                dibujaX(tres_dos);
                matriz[2][1] =1  ; 
                turno="user2";
            }
            else{
                dibujaO(tres_dos);
                matriz[2][1] =2  ; 
                turno = "user1";
            }
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_tres_dosActionPerformed

    private void tres_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres_tresActionPerformed
        // TODO add your handling code here:
        if(casilla[2][2]==true){
            if(turno.equals("user1")){
                dibujaX(tres_tres);
                matriz[2][2] =1  ; 
                turno="user2";
            }
            else{
                dibujaO(tres_tres);
                matriz[2][2] =2  ; 
                turno = "user1";
            }
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_tres_tresActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        // HISTORIAL DE LAS PARTIDAS
        //LLAMAR A LA VENTANA MOSTRAR RESULTADOS
        Resultados vmr = new Resultados(this, true, user1, user2, v1, v2, emp);
        vmr.setVisible(true);
    }//GEN-LAST:event_HistorialActionPerformed

    private void FormatearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatearActionPerformed
        // TODO add your handling code here:
        
        v1=0;v2=0;emp=0;
        reiniciarJuego();
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_FormatearActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        Random dado = new Random();
        int n;
        n = dado.nextInt(6);
        if(n==0){
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=mMh8aY6NquM"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(n==1){
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.pinterest.com/pin/559150109981188195/"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(n==2){
            
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.xvideos.com/"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(n==3){
            
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/@IDALE21"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        if(n==4){
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=O2IhEbD64lg"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        if(n==5){
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=0N1_0SUGlDQ"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
        }
        if(n==6){
            //https://www.youtube.com/watch?v=7Rm--7KS_as
            try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=C0jqRBVbkt0"));
            } catch (IOException ex) {
                //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(ventanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_menuAyudaMouseClicked
    
    private void comprobarGanador(){
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillasEmpate = 0;
        
        //comprobamos si el ganador es 1
        ganador1 = comprobar(1);
        ganador2 = comprobar(2);
        //OPCIONES DE LOS GANADORES
        if(ganador1 == true){
            v1++;
            
            
            
            vGanador ventanaG = new vGanador(this,true,user1);
            ventanaG.setVisible(true);
            
            
            
            
            
            
            reiniciarJuego();
        }
        else if(ganador2 == true){
            v2++;
            vGanador1 ventanaG1 = new vGanador1(this,true,user2);
            ventanaG1.setVisible(true);
            reiniciarJuego();
            
        }
        else{
            //en caso nadie gane
            //talvez el tablero este lleno
            //entonces hay empate
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    
                    
                    if(matriz[i][j]!=0){
                        //que haya un 1 o un 2
                        casillasEmpate++;
                        
                    }
                    
                }
            }
            
            if(casillasEmpate == 9){
                emp++;
                
                EMPATE Empate = new EMPATE(this,true);
                Empate.setVisible(true);
                
                
                reiniciarJuego();
                
            }
            else{
                casillasEmpate = 0;
            }
            
            
            
            
            
            
            
            
        }
        
        
        
        
    }
    
    private boolean comprobar(int num){
        boolean ganador = false;
        if(matriz[0][0]==num && matriz[0][1]==num && matriz[0][2] ==num){
            ganador = true;
        }
        
        else if(matriz[1][0]==num && matriz[1][1]==num && matriz[1][2] ==num){
            ganador = true;
            
        }
        else if(matriz[2][0]==num && matriz[2][1]==num && matriz[2][2] ==num){
            ganador = true;
            
        }
        //columnas
        else if(matriz[0][0]==num && matriz[1][0]==num && matriz[2][0] ==num){
            ganador = true;
        }
        else if(matriz[0][1]==num && matriz[1][1]==num && matriz[2][1] ==num){
            ganador = true;
        }
        else if(matriz[0][2]==num && matriz[1][2]==num && matriz[2][2] ==num){
            
            ganador = true;
        }
        //las diagonales
        else if( matriz[0][0]==num && matriz[1][1]==num && matriz[2][2] ==num){
            ganador = true;
            
        }
        else if(matriz[0][2]==num && matriz[1][1]==num && matriz[2][0] ==num){
            ganador = true;
        }
        return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        uno_uno.setIcon(null);
        uno_dos.setIcon(null);
        uno_tres.setIcon(null);
        dos_uno.setIcon(null);
        dos_dos.setIcon(null);
        dos_tres.setIcon(null);
        tres_uno.setIcon(null);
        tres_dos.setIcon(null);
        tres_tres.setIcon(null);
        //preguntar quien va a jugar primero
        JuegaP();
        
        
        
    }
    private void JuegaP(){
        Turno vturno = new Turno(this, true, user1, user2);
        
        vturno.setVisible(true);
        turno = vturno.getTurno();
        
    
        
        
        
        
        
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Formatear;
    private javax.swing.JMenuItem Historial;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton dos_dos;
    private javax.swing.JButton dos_tres;
    private javax.swing.JButton dos_uno;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JPanel panel;
    private javax.swing.JButton tres_dos;
    private javax.swing.JButton tres_tres;
    private javax.swing.JButton tres_uno;
    private javax.swing.JButton uno_dos;
    private javax.swing.JButton uno_tres;
    private javax.swing.JButton uno_uno;
    // End of variables declaration//GEN-END:variables
}
