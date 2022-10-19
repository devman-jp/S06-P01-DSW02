package pe.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.model.Bodega;
import pe.edu.service.BodegaService;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaController {

	@Autowired
	private BodegaService service;
	
	@RequestMapping(path = "/findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Bodega>> getBodegas(){
		return new ResponseEntity<List<Bodega>>(service.findAllBodega(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ResponseEntity<Bodega> insertarBodega(@RequestBody Bodega bodega) {
		Bodega savedBodega = service.saveBodega(bodega);
		return new ResponseEntity<Bodega>(savedBodega, HttpStatus.CREATED);
	}
	
}
