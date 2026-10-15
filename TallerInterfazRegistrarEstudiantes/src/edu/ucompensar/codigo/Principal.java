/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucompensar.codigo;

/**
 *
 * @author ASUS
 */
public class Principal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            IU ventana = new IU();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);           
        });
    }
}
