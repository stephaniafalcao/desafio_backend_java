/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.subway.command;

import com.stephania.subway.data.Subway;

/**
 *
 * @author stephania
 */
public interface Command {
    public void action(Subway subway);   
}
