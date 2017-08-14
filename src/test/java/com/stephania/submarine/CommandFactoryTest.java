/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine;

import com.stephania.submarine.command.Command;
import com.stephania.submarine.command.Down;
import com.stephania.submarine.command.Move;
import com.stephania.submarine.command.Right;
import com.stephania.submarine.command.Up;
import com.stephania.submarine.exception.CommandNotFoundException;
import com.stephania.submarine.exception.NotNullOrEmptyException;
import com.stephania.submarine.factory.CommandFactory;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author stephania
 */
public class CommandFactoryTest {
    @Test
    public void checkComandSizeEqualsListSize() throws Exception {
        String command = "RRMDU";
        List<Command> commandList = CommandFactory.buildCommand(command);
        Assert.assertEquals(command.length(), commandList.size());
    }
    
    @Test
    public void checkBuildListIsCorrect() throws Exception {
        String command = "RRMDU";
        List<Command> commandList = CommandFactory.buildCommand(command);
        Assert.assertTrue(commandList.get(0) instanceof Right);
        Assert.assertTrue(commandList.get(1) instanceof Right);
        Assert.assertTrue(commandList.get(2) instanceof Move);
        Assert.assertTrue(commandList.get(3) instanceof Down);
        Assert.assertTrue(commandList.get(4) instanceof Up);
    }
    
    @Test(expected = NotNullOrEmptyException.class)
    public void checkCommandNullCreateException() throws Exception {
        String command = null;
        CommandFactory.buildCommand(command);
        
    }
    
    @Test(expected = NotNullOrEmptyException.class)
    public void checkCommandEmptyCreateException() throws Exception {
        String command = "";
        CommandFactory.buildCommand(command);
        
    }
    
    @Test(expected = CommandNotFoundException.class)
    public void checkCommandNotFoundCreateException() throws Exception {
        String command = "W";
        CommandFactory.buildCommand(command);
        
    }
}
