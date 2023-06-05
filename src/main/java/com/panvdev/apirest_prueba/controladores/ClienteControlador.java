package com.panvdev.apirest_prueba.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panvdev.apirest_prueba.modelos.Cliente;
import com.panvdev.apirest_prueba.servicios.ClienteServicioImpl;

@RestController
@RequestMapping("/api")
public class ClienteControlador {
	
	@Autowired
	ClienteServicioImpl clienteservicio;
	
	
	@GetMapping("/candidatos")
	public List<Cliente> obtenerClientes(){
		return clienteservicio.obtenerTodo();
	}
	
	
	
	
	
	
	
	
	
	@PostMapping("/guardar")
	public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cliente){
		Cliente nuevo_cliente = clienteservicio.guardar(cliente);
		return new ResponseEntity<>(nuevo_cliente, HttpStatus.CREATED);
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> obtenerClienteId(@PathVariable long id){
		Cliente clientePorId = clienteservicio.obtenerPorId(id);
		return ResponseEntity.ok(clientePorId);
	}
	
	
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarCliente(@PathVariable long id){
		this.clienteservicio.eliminar(id);
		
		HashMap<String, Boolean> estadoClienteEliminado = new HashMap<>();
		estadoClienteEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoClienteEliminado);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
