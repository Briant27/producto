package com.briant.gonzalez.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.briant.gonzalez.model.Empleado;


@Service
public class EmpleadosServiceImp implements IntEmpleadosService {

	private List<Empleado> lista;
	
	public EmpleadosServiceImp() {
		lista = new LinkedList<Empleado>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			Empleado a1 = new Empleado();
			a1.setId(1);
			a1.setNombre("Computadora");
			a1.setEmail("HP 1TR 4RAM");
			a1.setFechaNacimiento(LocalDate.now());
			a1.setSalario(12000.00);
			
			Empleado a2 = new Empleado();
			a2.setId(2);
			a2.setNombre("Iphone 13");
			a2.setEmail("128 GB Product RED");
			a2.setFechaNacimiento(LocalDate.now());
			a2.setSalario(21000.00);
			
			Empleado a3 = new Empleado();
			a3.setId(3);
			a3.setNombre("Samsung S21");
			a3.setEmail("128 GB 8 RAM");
		
			a3.setFechaNacimiento(LocalDate.now());
			a3.setSalario(25000.00);
			
			Empleado a4 = new Empleado();
			a4.setId(4);
			a4.setNombre("Homepod Mini");
			a4.setEmail("Color: Gris espacial");
			
			a4.setFechaNacimiento(LocalDate.now());
			a4.setSalario(2500.00);
		
			Empleado a5 = new Empleado();
			a5.setId(5);
			a5.setNombre("Macbook");
			a5.setEmail("Air macbook ");
			
			a5.setFechaNacimiento(LocalDate.now());
			a5.setSalario(20000.00);
			
			lista.add(a1);
			lista.add(a2);
			lista.add(a3);
			lista.add(a4);
			lista.add(a5);
			
		}catch(DateTimeParseException ex) {
					System.out.println("Error: " + 	ex.getMessage());
		}
	}
	
	@Override
	public List<Empleado> obtnerTodos() {
		return lista;
	}

	@Override
	public void guardar(Empleado empleado) {
		lista.add(empleado);
	}

	@Override
	public void eliminar(Integer idEmpleado) {
		lista.remove(buscarPorId(idEmpleado));
	}

	@Override
	public Empleado buscarPorId(Integer idEmpleado) {
		for(Empleado a : lista) {
			if ( a.getId() == idEmpleado) {
				return a;
			}
		}
		return null;
	}

	@Override
	public Integer totalEmpleados() {
		// TODO Auto-generated method stub
		return lista.size();
	}
	
	@Override
	public Double montoTotal() {
		Double salario = 0.0;
		for(Empleado a : lista) {
			salario = salario + a.getSalario();
		}
		return salario;
	}

	

}
