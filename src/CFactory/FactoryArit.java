/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CFactory;

import AbsProducts.Op;
import AbsFact.AbstractFactory;
import CProducts.Division;
import CProducts.Multi;
import CProducts.Resta;
import CProducts.Suma;

/**
 *
 * @author Brenda
 */
public class FactoryArit implements AbstractFactory {
    
    @Override
    public Op getConvertidor(String type) {
        return null;
    }
    @Override
    public Op getArit(String type) {
                switch(type){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multi":
                return new Multi();
            case "Division":
                return new Division();
        }
        return null;
    }
}
