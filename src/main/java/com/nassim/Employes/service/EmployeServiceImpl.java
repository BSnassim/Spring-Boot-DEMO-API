package com.nassim.Employes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nassim.Employes.domain.Employe;
import com.nassim.Employes.repositories.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService{
	
	@Autowired
	private EmployeRepository repo;

	@Override
	public List<Employe> findAllEmploye() {
		return (repo.findAll() != null)? repo.findAll() : null;
	}

	@Override
	public Employe findEmploye(Integer id) {
		return (repo.findById(id).isPresent())? repo.findById(id).get() : null;
	}

	@Override
	public void saveEmploye(Employe emp) {
		repo.save(emp);
	}

	@Override
	public void updateEmploye(Integer id, Employe emp) {
		Employe EmployeToUpdate = repo.getById(id);
		EmployeToUpdate.setAge(emp.getAge());
		EmployeToUpdate.setNom(emp.getNom());
		EmployeToUpdate.setPrenom(emp.getPrenom());
		repo.save(EmployeToUpdate);
	}

	@Override
	public void deleteEmploye(Integer id) {
		repo.deleteById(id);
	}



}
