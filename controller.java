/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr2b_labiii;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel_Nascimento
 */
public class controller extends JFrame{
    private final JLabel textoOriginal = new JLabel("digite o texto original: ");
    private final JLabel textoInvertido = new JLabel("");
    private final JTextField campo1 = new JTextField(50);
    private StringBuffer texto = new StringBuffer();
   
    public controller() throws HeadlessException{
        super("Inversor");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(textoOriginal);
        add(campo1);
        add(textoInvertido); 
        
        campo1.addActionListener(new Inverter());
    }
    
    private class Inverter implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            texto.append(campo1.getText());
            textoInvertido.setText(texto.reverse().toString());
        }
   }   
}
