/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway;

/**
 *
 * @author stephania
 */
public class Up implements Command{
    @Override
    public void action(Subway subway) {        
        subway.setZ(subway.getZ() + 1);
    }
}
