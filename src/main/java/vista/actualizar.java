/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.controlador;
import javax.swing.JTextField;

/**
 *
 * @author Salomon RN
 */
public class actualizar extends javax.swing.JFrame {

    /**
     * Creates new form actualizar
     */
    //Lamada a la clase controlador.
    controlador cp;
    
    
    public actualizar() {
        initComponents();
    }
    
    //Instancia de controlador
public void setcontrolador(controlador cp){
        this.cp = cp;
    }
    
    /*
    * Set de cada texto para retornar que Producto actualizar con los
    * nuevos valores
    */
    public String getTxt_inventario_actualizar() {
        return txt_inventario_actualizar.getText();
    }

    public String getTxt_nombre_actualizar() {
        return txt_nombre_actualizar.getText();
    }

    public String getTxt_precio_actualizar() {
        return txt_precio_actualizar.getText();
    }
    
    

    
    
    
    
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre_actualizar = new javax.swing.JTextField();
        txt_precio_actualizar = new javax.swing.JTextField();
        txt_inventario_actualizar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_actualizar_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Producto");
        setAlwaysOnTop(true);

        txt_inventario_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inventario_actualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese los nuevos datos");
        jLabel1.setToolTipText("");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Inventario");

        btn_actualizar_2.setAction(btn_actualizar_2.getAction());
        btn_actualizar_2.setText("Actualizar Producto");
        btn_actualizar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                act_actualizar_producto2(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_actualizar_2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nombre_actualizar)
                                .addComponent(txt_precio_actualizar)
                                .addComponent(txt_inventario_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_inventario_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btn_actualizar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_inventario_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inventario_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inventario_actualizarActionPerformed

    private void act_actualizar_producto2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_act_actualizar_producto2
        // TODO add your handling code here:
        //Se llama al metodo si el botón fue presionado 
        cp.act_btn_actualizar(this);    
        
        
        
    }//GEN-LAST:event_act_actualizar_producto2


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_inventario_actualizar;
    private javax.swing.JTextField txt_nombre_actualizar;
    private javax.swing.JTextField txt_precio_actualizar;
    // End of variables declaration//GEN-END:variables
}
