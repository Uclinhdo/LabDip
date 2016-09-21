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
    private ServiceTipCalculator tipcalculator;

    public TipCalculatorManager(ServiceTipCalculator tipcalculator) {
        this.tipcalculator = tipcalculator;
    }
    
    public void doCalculate(double tipcalculation){
        tipcalculator.calculateTip(tipcalculation);
        
    }
    

    public ServiceTipCalculator getTipcalculator() {
        return tipcalculator;
    }

    public void setTipcalculator(ServiceTipCalculator tipcalculator) {
        this.tipcalculator = tipcalculator;
    }
    
    
    
    
}
