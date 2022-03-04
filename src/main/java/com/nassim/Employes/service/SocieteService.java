package com.nassim.Employes.service;

import java.util.List;

import com.nassim.Employes.domain.Employe;
import com.nassim.Employes.domain.Societe;

public interface SocieteService {
	
	public List<Societe> findAllSociete();
	public List<Employe> findAllEmploye(Societe soc);
	public Societe findSociete(Integer id);
	public void saveSociete(Societe soc);
	public void updateSociete(Integer id, Societe soc);
	public void deleteSociete(Integer id);


}
