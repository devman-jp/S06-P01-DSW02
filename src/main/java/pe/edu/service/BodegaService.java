package pe.edu.service;

import java.util.List;
import pe.edu.model.Bodega;

public interface BodegaService {

	List<Bodega> findAllBodega();
	Bodega saveBodega(Bodega bodega);	
}
