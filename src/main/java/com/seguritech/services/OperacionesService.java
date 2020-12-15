package com.seguritech.services;

import org.springframework.stereotype.Service;

import com.seguritech.exception.NegocioException;
import com.seguritech.rest.modelo.Operacion;

@Service
public class OperacionesService {
	
	public double realizarOperacion(Operacion operacion, int val1, int val2) throws NegocioException {
		switch(operacion) {
		case  SUMA: 
			return val1 + val2;
		case RESTA:
			return val1 - val2;
		case MULTIPLICACION:
			return val1 * val2;
		case DIVISION: {
			if(val2 == 0) {
				throw new NegocioException("La operación no se puede realizar.");
			}
			return val1 / val2;
		}
		default:
			throw new NegocioException("Operación no válida.");
		}
	}
}
