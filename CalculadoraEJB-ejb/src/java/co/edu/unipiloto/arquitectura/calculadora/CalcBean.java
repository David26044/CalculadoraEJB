/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.arquitectura.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author ACER
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer addition(int val1, int val2) {
        return val1+val2;
    }

    @Override
    public Integer substraction(int val1, int val2){
        return val1-val2;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer multiplication(int val1, int val2) {
        return val1*val2;
    }

    @Override
    public Double division(int val1, int val2) {
        return (double)val1/val2;
    }

    @Override
    public Integer square(int val) {
        return val * val;
    }

    @Override
    public Integer modulo(int val1, int val2) {
        return val1%val2;
    }
    
}
