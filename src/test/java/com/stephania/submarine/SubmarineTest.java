/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine;

import com.stephania.submarine.command.Command;
import com.stephania.submarine.command.Direction;
import com.stephania.submarine.data.Submarine;
import com.stephania.submarine.factory.CommandFactory;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author stephania
 */
public class SubmarineTest {
    @Test
    public void createSubwayDefault() throws Exception {
        Submarine submarine = new Submarine();
        Assert.assertEquals(submarine.getX(), 0);
        Assert.assertEquals(submarine.getY(), 0);
        Assert.assertEquals(submarine.getZ(), 0);
        Assert.assertEquals(submarine.getDirection(), Direction.NORTH);
    }
    
    @Test
    public void executeCommandAndCheckStatus() throws Exception {
        List<Command> command = CommandFactory.buildCommand("RMMLMMMDDLL");
        Submarine submarine = new Submarine();
        submarine.executeCommand(command);
        String expectedValue = "2 3 -2 SOUTH";
        Assert.assertEquals(expectedValue, submarine.toString());
    }
    
    @Test
    public void checkZNotPositive() throws Exception {
        Submarine submarine = new Submarine();
        submarine.setZ(10);
        Assert.assertNotEquals(submarine.getZ(), 10);
    }
}
