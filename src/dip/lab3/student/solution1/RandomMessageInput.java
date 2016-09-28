/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Random;

/**
 *
 * @author linhdo
 */
public class RandomMessageInput implements MessageInput{
    String [] randommessage  =  {"This is a test for my Message System.","Hello Advanced Java!",
    "This is Linh Do.","Have a great day!","Welcome to Java World!"};
    Random random = new Random();
    int index = random.nextInt(randommessage.length);

    @Override
    public String readMessage() {
    String printmessage = randommessage[index];
    return printmessage;
    }
    
    
    
}
