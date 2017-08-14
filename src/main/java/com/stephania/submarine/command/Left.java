/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine.command;

import com.stephania.submarine.data.Submarine;
import com.stephania.submarine.command.Direction;
import com.stephania.submarine.command.Command;

/**
 *
 * @author stephania
 */
public class Left implements Command{

    @Override
    public void action(Submarine submarine) {
        switch (submarine.getDirection()) {
            case NORTH:
                submarine.setDirection(Direction.WEST);
                break;
            case EAST:
                submarine.setDirection(Direction.NORTH);
                break;
            case WEST:
                submarine.setDirection(Direction.SOUTH);
                break;
            case SOUTH:
                submarine.setDirection(Direction.EAST);
                break;
        }           
    }
}
