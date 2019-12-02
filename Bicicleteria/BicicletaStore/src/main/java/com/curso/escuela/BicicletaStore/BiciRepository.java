package com.curso.escuela.BicicletaStore;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiciRepository extends JpaRepository<Bicicleta,Long>{
	
	List<Bicicleta> getByid(Long id);
	List<Bicicleta> findAllByModeloLike(String Modelo);
	
	
}
