/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway;

import com.stephania.subway.command.Command;
import com.stephania.subway.command.Direction;
import com.stephania.subway.data.Subway;
import com.stephania.subway.factory.CommandFactory;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author stephania
 */
public class SubwayTest {
    @Test
    public void createSubwayDefault() throws Exception {
        Subway subway = new Subway();
        Assert.assertEquals(subway.getX(), 0);
        Assert.assertEquals(subway.getY(), 0);
        Assert.assertEquals(subway.getZ(), 0);
        Assert.assertEquals(subway.getDirection(), Direction.NORTH);
    }
    
    @Test
    public void executeCommandAndCheckStatus() throws Exception {
        List<Command> command = CommandFactory.buildCommand("RMMLMMMDDLL");
        Subway subway = new Subway();
        subway.executeCommand(command);
        String expectedValue = "2 3 -2 SOUTH";
        Assert.assertEquals(expectedValue, subway.toString());
    }
}
