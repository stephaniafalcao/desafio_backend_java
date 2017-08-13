/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephania
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        List<Command> commandList = new ArrayList<>();
        commandList.add(new Left());
        commandList.add(new Left());
        
        Subway subway = new Subway();
        subway.executeCommand(commandList);
        System.out.println(subway.getDirection());
    }
}
