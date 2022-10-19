package pe.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.model.Bodega;
import pe.edu.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{

	@Autowired
	private BodegaRepository repository;
	
	@Override
	public List<Bodega> findAllBodega() {
		return repository.findAll();
	}

	@Override
	public Bodega saveBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		if(bodega.getIdBodega() != null) {
			return null;
		}
		Bodega validateBodega = validarBodega(bodega);
		repository.save(validateBodega);
		List<Bodega> listadoBodegas = findAllBodega();
		return listadoBodegas.get(listadoBodegas.size() - 1);
	}
	
	public Bodega validarBodega(Bodega bodega) {
		if(bodega.getTelefono() <= 0) {
			return null;
		}
		if(bodega.getDireccion().length() == 0 || bodega.getDireccion().length() < 3) {
			return null;
		}
		if(bodega.getDuenio().length() == 0 || bodega.getDuenio().length() < 3) {
			return null;
		}
		if(bodega.getNombre().length() == 0 || bodega.getNombre().length() < 3) {
			return null;
		}
		return bodega;
	}

}
