package com.nassim.Employes.service;

import java.util.List;

import com.nassim.Employes.domain.Employe;

public interface EmployeService {
	
	public List<Employe> findAllEmploye();
	public Employe findEmploye(Integer id);
	public void saveEmploye(Employe emp);
	public void updateEmploye(Integer id, Employe emp);
	public void deleteEmploye(Integer id);

}
