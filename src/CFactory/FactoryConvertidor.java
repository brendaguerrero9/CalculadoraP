/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CFactory;

import AbsProducts.Op;
import AbsFact.AbstractFactory;
import CProducts.Bin;

/**
 *
 * @author Brenda
 */
public class FactoryConvertidor implements AbstractFactory {
    
    @Override
    public Op getConvertidor(String type) {
        switch(type){
            case "bin":
                return new Bin();
        }
        return null;
    }
    @Override
    public Op getArit(String type) {
        return null;
    }
    
}
