/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway.command;

import com.stephania.subway.data.Subway;
import com.stephania.subway.command.Command;

/**
 *
 * @author stephania
 */
public class Move implements Command{
    @Override
    public void action(Subway subway) {        
        switch (subway.getDirection()) {
            case NORTH:
                subway.setY(subway.getY() + 1);
                break;
            case EAST:
                subway.setX(subway.getX() + 1);
                break;
            case WEST:
                subway.setX(subway.getX() - 1);
                break;
            case SOUTH:
                subway.setY(subway.getY() - 1);
                break;
        }   
    }
}
