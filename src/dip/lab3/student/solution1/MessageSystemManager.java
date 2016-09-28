/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author ldo
 */
public class MessageSystemManager {
    private MessageInput msgreader;
    private MessageOutput msgwriter;

    public MessageSystemManager(MessageInput msgreader, MessageOutput msgwriter) {
        this.msgreader = msgreader;
        this.msgwriter = msgwriter;
    }
    
    
    public final void doMeassage(){
        String msg = msgreader.readMessage();
        msgwriter.performMessage(msg);
    }

    public final MessageInput getMessreader() {
        return msgreader;
    }

    public final void setMessreader(MessageInput msgreader) {
        this.msgreader = msgreader;
    }

    public final MessageOutput getMesswriter() {
        return msgwriter;
    }

    public final void setMesswriter(MessageOutput msgwriter) {
        this.msgwriter = msgwriter;
    }
    
    
}
