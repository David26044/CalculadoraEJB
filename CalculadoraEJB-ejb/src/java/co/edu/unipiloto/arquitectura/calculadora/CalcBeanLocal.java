/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.arquitectura.calculadora;

import javax.ejb.Local;

/**
 *
 * @author ACER
 */
@Local
public interface CalcBeanLocal {

    Integer addition(int val1, int val2);
    Integer substraction(int val1, int val2);
    Integer multiplication(int val1, int val2);
    Double division(int val1, int val2);
    Integer square(int val);
    Integer modulo(int val1, int val2);
}
