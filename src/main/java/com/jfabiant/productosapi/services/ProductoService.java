package com.jfabiant.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfabiant.productosapi.models.Producto;
import com.jfabiant.productosapi.repositories.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.listar();
	}
	
	public void crear(Producto producto) {
		productoRepository.crear(producto);
	}
	
}

