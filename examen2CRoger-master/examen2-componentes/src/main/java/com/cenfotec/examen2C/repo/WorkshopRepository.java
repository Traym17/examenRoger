package com.cenfotec.examen2C.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.examen2C.domain.Workshop;


public interface  WorkshopRepository extends JpaRepository<Workshop,Long> {
	public List<Workshop> findByNameContaining(String word);
    public List<Workshop> findByCategoriaContaining(String word);
    public List<Workshop> findByAutorContaining(String word);
    public List<Workshop> findByKeyWordContaining(String word);

}
