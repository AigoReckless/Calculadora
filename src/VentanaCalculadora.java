/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel Hebrero Núñez
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    double operando1 = 0;
    String operacion = "";
    
    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonlimpia = new javax.swing.JButton();
        botonmultiplica = new javax.swing.JButton();
        botonresta = new javax.swing.JButton();
        botonsuma = new javax.swing.JButton();
        botondivide = new javax.swing.JButton();
        pantalla1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        pantalla.setForeground(new java.awt.Color(51, 255, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);

        boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton1MousePressed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton4MousePressed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton5MousePressed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton7MousePressed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton6MousePressed(evt);
            }
        });

        boton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton8MousePressed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton9MousePressed(evt);
            }
        });

        botonigual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonigual.setText("=");
        botonigual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonigualMousePressed(evt);
            }
        });

        boton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton0.setText("0");
        boton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton0MousePressed(evt);
            }
        });

        botonlimpia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonlimpia.setText("C");
        botonlimpia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonlimpiaMousePressed(evt);
            }
        });

        botonmultiplica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonmultiplica.setText("*");
        botonmultiplica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonmultiplicaMousePressed(evt);
            }
        });

        botonresta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonresta.setText("-");
        botonresta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonrestaMousePressed(evt);
            }
        });

        botonsuma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonsuma.setText("+");
        botonsuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonsumaMousePressed(evt);
            }
        });

        botondivide.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botondivide.setText("/");
        botondivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botondivideMousePressed(evt);
            }
        });

        pantalla1.setBackground(new java.awt.Color(0, 0, 0));
        pantalla1.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        pantalla1.setForeground(new java.awt.Color(51, 255, 0));
        pantalla1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla1.setText("0");
        pantalla1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonlimpia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botondivide, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonresta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonmultiplica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pantalla1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla1)
                .addGap(4, 4, 4)
                .addComponent(pantalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonresta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonmultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonlimpia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botondivide, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPulsado(String numeroPulsado){
        String numeroEnPantalla = pantalla1.getText();
        
        if (numeroEnPantalla == "0"){
            pantalla1.setText(numeroPulsado);
        }
        else{
            pantalla1.setText(numeroEnPantalla + numeroPulsado);
        }
    }
    
    private void boton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MousePressed
        botonPulsado("7");
    }//GEN-LAST:event_boton7MousePressed

    private void boton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MousePressed
        botonPulsado("8");
    }//GEN-LAST:event_boton8MousePressed

    private void boton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MousePressed
        botonPulsado("9");
    }//GEN-LAST:event_boton9MousePressed

    private void boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MousePressed
        botonPulsado("4");
    }//GEN-LAST:event_boton4MousePressed

    private void boton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MousePressed
        botonPulsado("5");
    }//GEN-LAST:event_boton5MousePressed

    private void boton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MousePressed
        botonPulsado("6");
    }//GEN-LAST:event_boton6MousePressed

    private void boton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MousePressed
         botonPulsado("1");
    }//GEN-LAST:event_boton1MousePressed

    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
         botonPulsado("2");
    }//GEN-LAST:event_boton2MousePressed

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
         botonPulsado("3");
    }//GEN-LAST:event_boton3MousePressed

    private void boton0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton0MousePressed
         botonPulsado("0");
    }//GEN-LAST:event_boton0MousePressed

    private void operacionPulsada(String opera) {
        //Convierto lo que hay escrito en la pantalla (que es un número pero que ahora
        //mismo es un string) a su equivalente double, para poder operar con é.
        operando1 = Double.valueOf(pantalla1.getText()); 
        pantalla1.setText("0");
        operacion = opera; 
   
    }
    
    private void botonsumaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsumaMousePressed
        operacionPulsada("+");
        
    }//GEN-LAST:event_botonsumaMousePressed

    private void botonigualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonigualMousePressed
        //Leo el segundo operando que está en la pantalla y lo convierto a double
        double operando2 = Double.valueOf(pantalla1.getText());
        double operando3 = Double.valueOf(pantalla1.getText());
        if (operacion.equals("+")){
            operando3 = operando1 + operando2;
            pantalla.setText(String.valueOf(operando3));
            pantalla1.setText(operando1 + operacion + operando2);
        }
        if (operacion.equals("-")){
            operando3 = operando1 - operando2;
            pantalla.setText(String.valueOf(operando3));
            pantalla1.setText(operando1 + operacion + operando2);
        }
        if (operacion.equals("*")){
            operando3 = operando1 * operando2;
            pantalla.setText(String.valueOf(operando3));
            pantalla1.setText(operando1 + operacion + operando2);
        }
        if (operacion.equals("/")){
            if (operando2 != 0) {
                operando3 = operando1 / operando2; 
                pantalla.setText(String.valueOf(operando3));
                pantalla1.setText(operando1 + operacion + operando2);
            }  
            else{
                pantalla.setText("Error");
                pantalla1.setText(operando1 + operacion + operando2);
            }
        }
        
        //dibujo en la pantalla el resultado convertido a string
        
    }//GEN-LAST:event_botonigualMousePressed

    private void botonrestaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonrestaMousePressed
        operacionPulsada("-");
    }//GEN-LAST:event_botonrestaMousePressed

    private void botonmultiplicaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmultiplicaMousePressed
        operacionPulsada("*");
    }//GEN-LAST:event_botonmultiplicaMousePressed

    private void botondivideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botondivideMousePressed
        operacionPulsada("/");
    }//GEN-LAST:event_botondivideMousePressed

    private void botonlimpiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonlimpiaMousePressed
        pantalla.setText("0");
        pantalla1.setText("0");
    }//GEN-LAST:event_botonlimpiaMousePressed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botondivide;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botonlimpia;
    private javax.swing.JButton botonmultiplica;
    private javax.swing.JButton botonresta;
    private javax.swing.JButton botonsuma;
    private javax.swing.JLabel pantalla;
    private javax.swing.JLabel pantalla1;
    // End of variables declaration//GEN-END:variables
}
