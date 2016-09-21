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
public interface ServiceTipCalculator {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
    
    public abstract ServiceQuality getServiceQuality();
    public abstract void calculateTip(double tipcalculation);
    
    
}
