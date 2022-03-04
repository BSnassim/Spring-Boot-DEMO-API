package com.nassim.Employes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nassim.Employes.domain.Employe;
import com.nassim.Employes.domain.Societe;
import com.nassim.Employes.repositories.EmployeRepository;
import com.nassim.Employes.repositories.SocieteRepository;

@Service
public class SocieteServiceImpl implements SocieteService {

	@Autowired
	private SocieteRepository repo;
	@Autowired
	private EmployeRepository employeRepo;
	
	@Override
	public List<Societe> findAllSociete() {
		return (repo.findAll() != null)? repo.findAll() : null;
	}

	@Override
	public Societe findSociete(Integer id) {
		return (repo.findById(id).isPresent())? repo.findById(id).get() : null;
	}

	@Override
	public void saveSociete(Societe soc) {
		repo.save(soc);
	}

	@Override
	public void updateSociete(Integer id, Societe soc) {
		Societe SocieteToUpdate = repo.getById(id);
		SocieteToUpdate.setNom(soc.getNom());
		repo.save(SocieteToUpdate);
	}

	@Override
	public void deleteSociete(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Employe> findAllEmploye(Societe soc) {
		return employeRepo.findBySociete(soc);
	}

}
