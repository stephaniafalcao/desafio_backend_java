/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine.command;

import com.stephania.submarine.data.Submarine;

/**
 *
 * @author stephania
 */
public interface Command {
    public void action(Submarine submarine);   
}
