package com.seguritech.rest.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author aarondelgado
 */
@Configuration
public class MiConfiguracion {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
        
        
	
	/**
	 * Configuración más básica. Por defecto se permite
	 * - Todos los orígnenes
	 * - Métodos GET, HEAD, POST
	 * 
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
			
		};
	}
	

	
	
}
