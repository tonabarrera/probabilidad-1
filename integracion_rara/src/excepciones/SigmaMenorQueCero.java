/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author ianMJ
 */
public class SigmaMenorQueCero extends Exception{
    public SigmaMenorQueCero(){
        super("σ, debe ser mayor que cero.");
    }
}
