/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbsFact;

import AbsProducts.Op;

/**
 *
 * @author Brenda
 */
public interface AbstractFactory {
    Op getConvertidor(String type);
    Op getArit(String type);
}
