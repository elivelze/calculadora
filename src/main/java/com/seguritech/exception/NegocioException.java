/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguritech.exception;


public class NegocioException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegocioException() {
    }

    public NegocioException(String message) {
        super(message);
    }
    
    public NegocioException(String message, Exception e) {
        super(message, e);
    }

}
