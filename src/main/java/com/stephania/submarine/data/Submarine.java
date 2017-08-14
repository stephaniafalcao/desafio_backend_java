/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine.data;

import com.stephania.submarine.command.Direction;
import com.stephania.submarine.command.Command;
import java.util.List;

/**
 *
 * @author stephania
 */
public class Submarine {
    private int x, y, z;
    private Direction direction;
    
    // Todo submarino começa com as coordenadas (0,0,0,North)
    public Submarine() {
        x = 0;
        y = 0;
        z = 0;
        
        direction = Direction.NORTH;
    }
    
    public void executeCommand(List<Command> commandList) {
        for(Command command : commandList) {
            command.action(this);
        }
    }

    @Override
    public String toString() {
        return this.x + " " + this.y + " " + this.z + " " + this.direction;   
    }
    
    

    /**
     * @return the xAssert
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        if (z <= 0) {
            this.z = z;
        }
    }

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    
}
