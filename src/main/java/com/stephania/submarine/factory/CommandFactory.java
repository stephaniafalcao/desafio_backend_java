/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine.factory;

import com.stephania.submarine.command.Command;
import com.stephania.submarine.command.Down;
import com.stephania.submarine.command.Left;
import com.stephania.submarine.command.Move;
import com.stephania.submarine.command.Right;
import com.stephania.submarine.command.Up;
import com.stephania.submarine.exception.CommandNotFoundException;
import com.stephania.submarine.exception.NotNullOrEmptyException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephania
 */
public class CommandFactory {
    /**
     * Recebe uma String de comando e gera uma lista de classes de comando
     * @param comando a ser utilizado
     * @return lista de classes de comando
    */
    public static List<Command> buildCommand(String command) throws Exception {
        
        if ((command == null) || (command.isEmpty())) {
            throw new NotNullOrEmptyException();
        }
        
        List<Command> commandList = new ArrayList<>();
     
        for (int i = 0; i < command.length(); i++) {
            char charCommand = command.charAt(i);
            
            if (validateCommand(charCommand)) {
                commandList.add(buildCommand(charCommand));
            } else {
                throw new CommandNotFoundException(charCommand);
            }
            
        }
        return commandList;
    }
    
    /**
     * Recebe um char e valida o comando
     * @param comando a ser testado
     * @return true se válido e false pros demais casos não cobertos
    */
    private static boolean validateCommand(char charCommand) {
        
        switch (charCommand) {
            case 'R' :
                return true;
            case 'L':
                return true;
            case 'U':
                return true;
            case 'D':
                return true;
            case 'M':
                return true;
            default:
                return false;
        }
    }
    
    /**
     * Recebe um char e retorna a classe de comando correspondente
     * @param comando a ser transformado
     * @return classe do comando correspondente, se existente, ou exceção em caso contrário.
    */
    private static Command buildCommand(char charCommand) throws Exception {
        switch (charCommand) {
            case 'R' :
                return new Right();
            case 'L':
                return new Left();
            case 'U':
                return new Up();
            case 'D':
                return new Down();
            case 'M':
                return new Move();
            default:
                throw new CommandNotFoundException(charCommand);
        }
    } 
}
