package com.briant.gonzalez.service;

import java.util.List;

import com.briant.gonzalez.model.Empleado;

public interface IntEmpleadosService {

	public List<Empleado> obtnerTodos();
	public void guardar(Empleado empleado);
	public void eliminar(Integer idEmpleado);
	public Empleado buscarPorId(Integer idEmpleado);
	//otros metodo o metodos
	public Integer totalEmpleados();
	public Double montoTotal();
	
	
}
