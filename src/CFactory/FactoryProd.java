/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CFactory;

import AbsFact.AbstractFactory;

/**
 *
 * @author Brenda
 */
public class FactoryProd  {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Aritmetica":
                return (AbstractFactory) new FactoryArit();
            case "Convertidor":
                return new FactoryConvertidor();
        }
        return null;
    }
    
}

