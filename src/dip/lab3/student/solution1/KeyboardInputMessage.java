/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;
/**
 *
 * @author ldo
 */
public class KeyboardInputMessage implements MessageInput {
    
    @Override
    public final String readMessage(){
        System.out.print("Enter your message here: ");
        
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
        
    }
    
}
