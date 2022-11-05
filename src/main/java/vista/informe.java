/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JLabel;

/**
 *
 * @author sadki
 */
public class informe extends javax.swing.JFrame {

    /**
     * Creates new form informe
     */
    public informe() {
        initComponents();
    }
    /*
    * Get y set de cada label, para retornar su contenido y actualziarlo con la 
    * nueva informacion.
    */
    public String get_mayor() {
        return lbl_mayor.getText();
    }

    public void set_mayor(String mayor) {
        lbl_mayor.setText(mayor);
    }

    public String get_menor() {
        return lbl_menor.getText();
    }

    public void set_menor(String menor) {
        lbl_menor.setText(menor);
    }

    public String get_promedio() {
        return lbl_promedio.getText();
    }

    public void set_promedio(String promedio) {
        lbl_promedio.setText(promedio);
    }

    public String get_valor() {
        return lbl_valor.getText();
    }

    public void set_valor(String valor) {
      lbl_valor.setText(valor);
    }

    
        
    
    /**
     * This method is called from within the constructor to initialize the form.    
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_mayor = new javax.swing.JLabel();
        lbl_menor = new javax.swing.JLabel();
        lbl_promedio = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informe");
        setAlwaysOnTop(true);

        lbl_mayor.setText("Producto precio mayor: ");

        lbl_menor.setText("Producto precio menor: ");

        lbl_promedio.setText("Promedio de precios ");

        lbl_valor.setText("Valor de Inventario: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_valor)
                    .addComponent(lbl_promedio)
                    .addComponent(lbl_menor)
                    .addComponent(lbl_mayor))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(lbl_mayor)
                .addGap(27, 27, 27)
                .addComponent(lbl_menor)
                .addGap(37, 37, 37)
                .addComponent(lbl_promedio)
                .addGap(32, 32, 32)
                .addComponent(lbl_valor)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_mayor;
    private javax.swing.JLabel lbl_menor;
    private javax.swing.JLabel lbl_promedio;
    private javax.swing.JLabel lbl_valor;
    // End of variables declaration//GEN-END:variables
}