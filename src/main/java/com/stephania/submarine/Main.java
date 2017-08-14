/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine;

import com.stephania.submarine.data.Submarine;
import com.stephania.submarine.command.Move;
import com.stephania.submarine.command.Right;
import com.stephania.submarine.command.Up;
import com.stephania.submarine.command.Left;
import com.stephania.submarine.command.Down;
import com.stephania.submarine.command.Command;
import com.stephania.submarine.exception.CommandNotFoundException;
import com.stephania.submarine.exception.NotNullOrEmptyException;
import com.stephania.submarine.factory.CommandFactory;
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
        try {
            String command = "LMRDDMMUU";
            List<Command> commandList = CommandFactory.buildCommand(command);
            Submarine submarine = new Submarine();
            submarine.executeCommand(commandList);
            System.out.println(submarine);
        } catch (NotNullOrEmptyException e) {
            System.err.println(e.getMessage());
        } catch (CommandNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro não mapeado");
        }
        
        
        
    }
}
