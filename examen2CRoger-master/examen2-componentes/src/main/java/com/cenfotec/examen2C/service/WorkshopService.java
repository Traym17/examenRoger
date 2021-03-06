package com.cenfotec.examen2C.service;

import java.util.List;
import java.util.Optional;

import com.cenfotec.examen2C.domain.Workshop;

public interface WorkshopService {
	public void save(Workshop workshop);
	public Optional<Workshop> get(Long id);
	public List<Workshop> getAll();
	public List<Workshop> find(String name);
    public List<Workshop> findCategoria(String name);
    public List<Workshop> findAutor(String name);
    public List<Workshop> findKey(String name);
}
