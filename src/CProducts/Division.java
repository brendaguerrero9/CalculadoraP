/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CProducts;

import AbsProducts.Op;

/**
 *
 * @author Brenda
 */
public class Division implements Op {
    
    @Override
    public void OperacionA(int numeroA, int numeroB) {
        System.out.println("Division= " + (numeroA / numeroB));
    }
    @Override
    public void OperacionC(int numeroA) {
    }
}
