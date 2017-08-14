/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stephania.submarine.exception;

/**
 *
 * @author stephania
 */
public class CommandNotFoundException extends Exception {
    
    public CommandNotFoundException(char charCommand) {
        super("Comando '" + charCommand + "' não encontrado");   
    }
}
