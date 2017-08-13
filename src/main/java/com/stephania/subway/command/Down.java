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
public class Down implements Command{
    @Override
    public void action(Subway subway) {
        subway.setZ(subway.getZ() - 1);
    }
}
