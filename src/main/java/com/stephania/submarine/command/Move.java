/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine.command;

import com.stephania.submarine.data.Submarine;
import com.stephania.submarine.command.Command;

/**
 *
 * @author stephania
 */
public class Move implements Command{
    @Override
    public void action(Submarine submarine) {        
        switch (submarine.getDirection()) {
            case NORTH:
                submarine.setY(submarine.getY() + 1);
                break;
            case EAST:
                submarine.setX(submarine.getX() + 1);
                break;
            case WEST:
                submarine.setX(submarine.getX() - 1);
                break;
            case SOUTH:
                submarine.setY(submarine.getY() - 1);
                break;
        }   
    }
}
