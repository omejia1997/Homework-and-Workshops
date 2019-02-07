/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.GUI;

import ec.espe.edu.ec.model.Person;
import ec.espe.edu.ecFrmClass.utils.FileManager;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Omar Mejia
 */
public class FrmViewData extends javax.swing.JFrame {
    private final ArrayList<Person> persons1 = new ArrayList<>();
    private final ArrayList<Person> persons2 = new ArrayList<>();
    private final ArrayList<Person> persons3 = new ArrayList<>();
    File file = new File("Person.txt");
        File file2 = new File("Salario.txt");
    /**
     * Creates new form FrmViewData
     */
    public FrmViewData() {
        initComponents();
        seeInventory();
    }
    
    public ArrayList<Person> llenarArray(ArrayList<Person> persons3) {
        FileManager.createArrayPersonOfFile(persons1, file);
        FileManager.createArrayCalculoOfFile(persons2, file2);
        for(int i=0;i<persons1.size();i++){
            persons3.add(new Person(persons1.get(i).getLastName(),
                    persons1.get(i).getSueldoHora(), 
                    5,persons2.get(i).getSueldoTotal(),
                    persons2.get(i).getIessContribution()));
        }
        return persons3;
    }
    
     private void seeInventory(){
        llenarArray(persons3);
        
        String matriz[][] = new String[persons3.size()][5];
                for (int i = 0; i < persons3.size(); i++) {
                    matriz[i][0] = persons3.get(i).getLastName();
                    matriz[i][1] = String.valueOf(persons3.get(i).getHorasTrabajadas());
                    matriz[i][2] = String.valueOf(persons3.get(i).getSueldoHora());
                    matriz[i][3] = String.valueOf(persons3.get(i).getSueldoTotal());
                    matriz[i][0] = String.valueOf(persons3.get(i).getIessContribution());
                    
                }
                
                tblPerson.setModel(new javax.swing.table.DefaultTableModel( matriz,new String []{"Apellido","Horas Trabajads","Salario por hora","Salario total","Iees"}));
                persons3.clear();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPerson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmViewData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    // End of variables declaration//GEN-END:variables
}