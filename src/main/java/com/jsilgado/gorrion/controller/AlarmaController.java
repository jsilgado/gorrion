package com.jsilgado.gorrion.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsilgado.gorrion.GlobalProperties;
import com.jsilgado.gorrion.bs.interfaces.PeticionBS;
import com.jsilgado.gorrion.dto.AlarmaDTO;
import com.jsilgado.gorrion.dto.PeticionDTO;
import com.jsilgado.gorrion.dto.TareaDTO;
import com.jsilgado.gorrion.exception.BusinessException;

@RestController
public class AlarmaController {

	@Autowired
	GlobalProperties global;
	
	@Autowired
	PeticionBS peticionBS; 
    
    @RequestMapping("/alarmas")
    public List<AlarmaDTO> calcularAlarmas() {

		List<AlarmaDTO> lstAlarmaDTO = new ArrayList<AlarmaDTO>();
		
		List<PeticionDTO> lstPeticiones;
		try {
			lstPeticiones = peticionBS.obtenerPeticionesActivas();
			
			Iterator<PeticionDTO> it = lstPeticiones.iterator();
			while( it.hasNext() ) {
				PeticionDTO peticion = it.next();

				lstAlarmaDTO.add( alarmaPetAcuerdoVsSumaTareas( peticion ) );
				lstAlarmaDTO.add( alarmaEstadoPeticionPtEjecucion( peticion ) );
				lstAlarmaDTO.add( alarmaTareaPeticionEstimadoCeroVacio( peticion ) );
				lstAlarmaDTO.add( alarmaTareaETCnoCeroPeticionEntregada( peticion ) );
				lstAlarmaDTO.add( alarmaPeticionHorasCentroDistintaHorasPeticionario( peticion ) );

			}

			lstAlarmaDTO.removeAll( Collections.singleton( null ) );
			
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstAlarmaDTO;

	}

	private AlarmaDTO alarmaPetAcuerdoVsSumaTareas( final PeticionDTO peticionDTO ) {

		Integer iAlarma = 1;
		String strDescripcionAlarma = "La suma de los estimados de las tareas de la petición no es igual al acuerdo de la petición";
		AlarmaDTO alarmaDTO = null;

		if( !peticionDTO.getEstado().equalsIgnoreCase( "ENTREGADA" ) ) {
			Double dPetAcuerdo = peticionDTO.getHorasAcuerdo();
			Double dSumaTareas = Double.valueOf( 0 );

			Iterator<TareaDTO> it = peticionDTO.getLstTareas().iterator();
			while( it.hasNext() ) {
				TareaDTO tarea = it.next();
				if( tarea.getEstimado() != null ) {
					dSumaTareas += tarea.getEstimado();
				}
			}

			if( !dPetAcuerdo.equals( dSumaTareas ) ) {
				alarmaDTO = new AlarmaDTO( peticionDTO.getId(), peticionDTO.getNombre(), iAlarma, strDescripcionAlarma );
				alarmaDTO.setDetalle( "Petición acuerdo: " + dPetAcuerdo + " vs Suma Tareas: " + dSumaTareas );
			}
		}

		return alarmaDTO;
	}

	private AlarmaDTO alarmaEstadoPeticionPtEjecucion( final PeticionDTO peticionDTO ) {

		Integer iAlarma = 2;
		String strDescripcionAlarma = "El estado de la peticion es pendiente de ejecucion";
		AlarmaDTO alarmaDTO = null;

		if( peticionDTO.getEstado().equalsIgnoreCase( "PTE_EJECUCION" ) ) {
			alarmaDTO = new AlarmaDTO( peticionDTO.getId(), peticionDTO.getNombre(), iAlarma, strDescripcionAlarma );
		}

		return alarmaDTO;
	}

	private AlarmaDTO alarmaTareaPeticionEstimadoCeroVacio( final PeticionDTO peticionDTO ) {

		Integer iAlarma = 3;
		String strDescripcionAlarma = "Una tarea tiene estimado igual a 0 o vacio";
		AlarmaDTO alarmaDTO = null;

		Iterator<TareaDTO> it = peticionDTO.getLstTareas().iterator();
		while( it.hasNext() ) {
			TareaDTO tarea = it.next();
			if( tarea.getEstimado() == null || tarea.getEstimado() == 0 ) {
				alarmaDTO = new AlarmaDTO( peticionDTO.getId(), peticionDTO.getNombre(), iAlarma, strDescripcionAlarma );
				alarmaDTO.setDetalle( "Petición: " + peticionDTO.getNombre() + " Tarea: " + tarea.getDescripcion() );
			}
		}

		return alarmaDTO;
	}

	private AlarmaDTO alarmaTareaETCnoCeroPeticionEntregada( final PeticionDTO peticionDTO ) {

		Integer iAlarma = 4;
		String strDescripcionAlarma = "Una tarea de una petición ENTREGADA tiene etc distinto de 0";
		AlarmaDTO alarmaDTO = null;

		if( peticionDTO.getEstado().equalsIgnoreCase( "ENTREGADA" ) ) {
			Iterator<TareaDTO> it = peticionDTO.getLstTareas().iterator();
			while( it.hasNext() ) {
				TareaDTO tarea = it.next();
				if( tarea.getEtc() != 0 ) {
					alarmaDTO = new AlarmaDTO( peticionDTO.getId(), peticionDTO.getNombre(), iAlarma, strDescripcionAlarma );
					alarmaDTO.setDetalle( "Petición: " + peticionDTO.getNombre() + " Tarea: " + tarea.getDescripcion() );
				}
			}
		}

		return alarmaDTO;
	}

	private AlarmaDTO alarmaPeticionHorasCentroDistintaHorasPeticionario( final PeticionDTO peticionDTO ) {

		Integer iAlarma = 5;
		String strDescripcionAlarma = "Las horas centro son distintas de las horas del peticionario";
		AlarmaDTO alarmaDTO = null;

		if( !peticionDTO.getHorasAcuerdo().equals( peticionDTO.getHorasPeticionario() ) ) {
			alarmaDTO = new AlarmaDTO( peticionDTO.getId(), peticionDTO.getNombre(), iAlarma, strDescripcionAlarma );
			alarmaDTO.setDetalle( "Petición: " + peticionDTO.getNombre() + " Horas Centro: " + peticionDTO.getHorasAcuerdo() + " Horas Peticionario: " + peticionDTO.getHorasPeticionario() );
		}

		return alarmaDTO;
	}

}