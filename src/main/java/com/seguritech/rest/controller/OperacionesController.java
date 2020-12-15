package com.seguritech.rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seguritech.exception.NegocioException;
import com.seguritech.rest.error.ApiError;
import com.seguritech.rest.modelo.Operacion;
import com.seguritech.services.OperacionesService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
 * @author 
 * @author aarondelgado
 */
@RestController
public class OperacionesController {

	
	private  OperacionesService operacionesService;


	public OperacionesController() {
		operacionesService  = new OperacionesService();
	}
	
	@ApiOperation(value="Obtener un producto por su ID", notes="Provee un mecanismo para realizar una suma.")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="OK", response=Double.class),
			@ApiResponse(code=404, message="Not Found", response=ApiError.class),
			@ApiResponse(code=500, message="Internal Server Error", response=ApiError.class)
	})
	@GetMapping("v1/suma/")
	public double suma(@ApiParam(value="valor1", required=true, type = "int") @RequestParam(name = "valor1") int valor1,
			@ApiParam(value="valor2", required=true, type = "int") @RequestParam(name = "valor2") int valor2) throws NegocioException {
	   return operacionesService.realizarOperacion(Operacion.SUMA, valor1, valor2);
				
	}
	
	@ApiOperation(value="Obtener un producto por su ID", notes="Provee un mecanismo para realizar una resta.")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="OK", response=Double.class),
			@ApiResponse(code=404, message="Not Found", response=ApiError.class),
			@ApiResponse(code=500, message="Internal Server Error", response=ApiError.class)
	})
	@GetMapping("v1/resta/")
	public double resta(@ApiParam(value="valor1", required=true, type = "int") @RequestParam(name = "valor1") Integer valor1,
			@ApiParam(value="valor2", required=true, type = "int") @RequestParam(name = "valor2") Integer valor2) throws NegocioException {
	   return operacionesService.realizarOperacion(Operacion.RESTA, valor1, valor2);
				
	}
	
	
	@ApiOperation(value="Obtener un producto por su ID", notes="Provee un mecanismo para realizar una multiplicacion.")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="OK", response=Double.class),
			@ApiResponse(code=404, message="Not Found", response=ApiError.class),
			@ApiResponse(code=500, message="Internal Server Error", response=ApiError.class)
	})
	@GetMapping("v1/multiplicacion/")
	public double multiplicacion(@ApiParam(value="valor1", required=true, type = "int") @RequestParam(name = "valor1") Integer valor1,
			@ApiParam(value="valor2", required=true, type = "int") @RequestParam(name = "valor2") Integer valor2) throws NegocioException {
	   return operacionesService.realizarOperacion(Operacion.MULTIPLICACION, valor1, valor2);
				
	}
	
	
	@ApiOperation(value="Obtener un producto por su ID", notes="Provee un mecanismo para realizar una division.")
	@ApiResponses(value= {
			@ApiResponse(code=200, message="OK", response=Double.class),
			@ApiResponse(code=404, message="Not Found", response=ApiError.class),
			@ApiResponse(code=500, message="Internal Server Error", response=ApiError.class)
	})
	@GetMapping("v1/division/")
	public double division(@ApiParam(value="valor1", required=true, type = "int") @RequestParam(name = "valor1") int valor1,
			@ApiParam(value="valor2", required=true, type = "int") @RequestParam(name = "valor2") int valor2) throws NegocioException {
	   return operacionesService.realizarOperacion(Operacion.DIVISION, valor1, valor2);
				
	}

	
	
	

	

	

}
