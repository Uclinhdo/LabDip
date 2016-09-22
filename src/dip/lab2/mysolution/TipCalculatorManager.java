/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.mysolution;

/**
 *
 * @author linhdo
 */
public class TipCalculatorManager {
    private TipCalculator tipcalculator;

    public TipCalculatorManager(TipCalculator tipcalculator) {
        this.tipcalculator = tipcalculator;
    }
    
    public double getTip(){
        return tipcalculator.getTip();
        
    }
//     another way to call getTip
//    public double getTip(TipCalculator tipcalculator){
//        return tipcalculator.getTip();
//        
//    }

    public TipCalculator getTipcalculator() {
        return tipcalculator;
    }

    public void setTipcalculator(TipCalculator tipcalculator) {
        this.tipcalculator = tipcalculator;
    }
    
    
    
    
}
