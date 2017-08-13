/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway.factory;

import com.stephania.subway.command.Command;
import com.stephania.subway.command.Down;
import com.stephania.subway.command.Left;
import com.stephania.subway.command.Move;
import com.stephania.subway.command.Right;
import com.stephania.subway.command.Up;
import com.stephania.subway.exception.CommandNotFoundException;
import com.stephania.subway.exception.NotNullOrEmptyException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephania
 */
public class CommandFactory {
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
