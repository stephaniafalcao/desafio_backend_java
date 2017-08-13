/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway;

import com.stephania.subway.data.Subway;
import com.stephania.subway.command.Move;
import com.stephania.subway.command.Right;
import com.stephania.subway.command.Up;
import com.stephania.subway.command.Left;
import com.stephania.subway.command.Down;
import com.stephania.subway.command.Command;
import com.stephania.subway.exception.CommandNotFoundException;
import com.stephania.subway.exception.NotNullOrEmptyException;
import com.stephania.subway.factory.CommandFactory;
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
            Subway subway = new Subway();
            subway.executeCommand(commandList);
            System.out.println(subway);
        } catch (NotNullOrEmptyException e) {
            System.err.println(e.getMessage());
        } catch (CommandNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro não mapeado");
        }
        
        
        
    }
}
