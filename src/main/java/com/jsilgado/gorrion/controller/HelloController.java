package com.jsilgado.gorrion.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jsilgado.gorrion.GlobalProperties;
import com.jsilgado.gorrion.bs.interfaces.EmpleadoBS;
import com.jsilgado.gorrion.dto.EmpleadoDTO;
import com.jsilgado.gorrion.exception.BusinessException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	GlobalProperties global;
	
	@Autowired
	EmpleadoBS empleadoBS;
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! " + global.getLinea();
    }
    
    @RequestMapping("/empleados")
    public List<EmpleadoDTO> getEmpleados() {
    	
    	List<EmpleadoDTO> lstEmpleados = null;
    	
        try {
        	lstEmpleados = empleadoBS.obtenerEmpleadosActivos();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return lstEmpleados;
    }

}