package com.central.integral.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.central.integral.entity.Cliente;


public interface IClienteService {
	
	
		public List<Cliente> findAll();
		public Page<Cliente> findAll(Pageable pageable);
		public void save(Cliente cliente);
		public Cliente findOne(Long id);
		public void delete(Long id);
		public List<Cliente> findByRazonSocial(String busqueda) throws Exception;

}
