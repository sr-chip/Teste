package com.example.crm.controler;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.crm.model.Cliente;
import com.example.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/dbdemo/clientes")
@ResponseStatus(HttpStatus.CREATED)
public class ClienteControler {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping(path="/{userId}")
	public Cliente atualizar(@PathVariable("userId") Long id, @RequestBody updateCliente cliente) {
		Cliente buffer = clienteRepository.getOne(id);
		buffer.setNome(cliente.getNome());
		buffer.setIdade(cliente.getIdade());
		return clienteRepository.save(buffer);
	}
	
	@DeleteMapping(path="/{userId}")
	public String deletar(@PathVariable("userId") Long id) {
		Cliente buffer = clienteRepository.getOne(id);
		clienteRepository.delete(buffer);
		return "Cliente " + buffer.getNome() + " foi deletado(a)";
	}
}
