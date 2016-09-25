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
    private MessageReader msgreader;
    private MessageWriter msgwriter;

    public MessageSystemManager(MessageReader msgreader, MessageWriter msgwriter) {
        this.msgreader = msgreader;
        this.msgwriter = msgwriter;
    }
    
    
    public final void doMeassage(){
        String msg = msgreader.readMessage();
        msgwriter.performMessage(msg);
    }

    public final MessageReader getMessreader() {
        return msgreader;
    }

    public final void setMessreader(MessageReader msgreader) {
        this.msgreader = msgreader;
    }

    public final MessageWriter getMesswriter() {
        return msgwriter;
    }

    public final void setMesswriter(MessageWriter msgwriter) {
        this.msgwriter = msgwriter;
    }
    
    
}
