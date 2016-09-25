/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author ldo
 */
public class GuiWriterMessage implements MessageWriter {
    @Override
    public void performMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
