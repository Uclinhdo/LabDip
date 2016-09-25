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
public class ConsoleWriterMessage implements MessageWriter {
    private String message;

    public ConsoleWriterMessage(String message) {
        this.message = message;
    }
    

    public final String getMessage() {
        return message;
    }

    public final void setMessage(String message) {
        this.message = message;
    }
    
    
    
    @Override
  public final void performMessage(String message){
      System.out.println(message);
  }
    
    
    
}
