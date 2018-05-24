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
public class Bin implements Op {
    private String bin;
     @Override
    public void OperacionA(int numeroA, int numeroB) {
    }

    @Override
    public void OperacionC(int numeroA) {
        
        bin= " ";
        int res;
        
        while(numeroA>0){
            res= numeroA %2;
            bin = res+bin;
            numeroA= numeroA/2;
        }
        this.bin = bin;
    }
    public String resultado(){
        return this.bin;
    }
}
