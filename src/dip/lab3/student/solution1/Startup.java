/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author linhdo
 */
public class Startup {
    public static void main(String[] args) {
        MessageInput msgreader = new RandomMessageInput();
        MessageOutput msgwriter = new GuiOutputMessage();
        MessageSystemManager msgma = new MessageSystemManager(msgreader,msgwriter);
        msgma.doMeassage();
        //msgma.doMeassage("This is a test for my homework about DIP principle");
    }
}