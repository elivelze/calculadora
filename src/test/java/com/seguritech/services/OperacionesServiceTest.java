package com.seguritech.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.seguritech.exception.NegocioException;
import com.seguritech.rest.modelo.Operacion;

@RunWith(MockitoJUnitRunner.class)
public class OperacionesServiceTest {
	
	@InjectMocks 
    private OperacionesService service;
	
	@Before
    public void setMockOutput() {
		
	}

	@Test
	public void sumaTest() throws NegocioException {
		double resultado = service.realizarOperacion(Operacion.SUMA, 1, 3);
		assertNotNull(resultado);
		assertEquals(4, resultado, 0);
	}

	@Test
	public void restaTest() throws NegocioException {
		double resultado = service.realizarOperacion(Operacion.RESTA, 1, 3);
		assertNotNull(resultado);
		assertEquals(-2, resultado, 0);
	}
	@Test
	public void multiplicacionTest() throws NegocioException {
		double resultado = service.realizarOperacion(Operacion.MULTIPLICACION, 1, 3);
		assertNotNull(resultado);
		assertEquals(3, resultado, 0);
	}
	

	@Test
	public void divisionTest() throws NegocioException {
		double resultado = service.realizarOperacion(Operacion.DIVISION, 3, 1);
		assertNotNull(resultado);
		assertEquals(3, resultado, 0);
	}

}
