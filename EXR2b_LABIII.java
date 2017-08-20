/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr2b_labiii;

import javax.swing.JFrame;

/**
 *
 * @author Gabriel_Nascimento
 */
public class EXR2b_LABIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controller janela = new controller();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
    
}
