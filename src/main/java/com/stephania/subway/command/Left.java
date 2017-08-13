/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway.command;

import com.stephania.subway.data.Subway;
import com.stephania.subway.command.Direction;
import com.stephania.subway.command.Command;

/**
 *
 * @author stephania
 */
public class Left implements Command{

    @Override
    public void action(Subway subway) {
        switch (subway.getDirection()) {
            case NORTH:
                subway.setDirection(Direction.WEST);
                break;
            case EAST:
                subway.setDirection(Direction.NORTH);
                break;
            case WEST:
                subway.setDirection(Direction.SOUTH);
                break;
            case SOUTH:
                subway.setDirection(Direction.EAST);
                break;
        }           
    }
}
