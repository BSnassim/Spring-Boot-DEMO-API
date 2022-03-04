package com.nassim.Employes.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nassim.Employes.domain.Employe;
import com.nassim.Employes.domain.Societe;
import com.nassim.Employes.service.SocieteService;

@RequestMapping("/APIsociete")
@RestController
public class SocieteEndpoint {
	@Autowired(required=false)
	private SocieteService societeService;
	
	@GetMapping("/societes")
	public List<Societe> findAllSoc() {
		return societeService.findAllSociete();
	}
	
	@GetMapping("/societes/{id}/employes")
	public List<Employe> findAllEmp(@PathVariable Integer id) {
		Societe soc = societeService.findSociete(id);
		return societeService.findAllEmploye(soc);
	}

	@GetMapping("/societes/{id}")
	public Societe findSoc(@PathVariable Integer id) {
		return societeService.findSociete(id);
	}

	@PostMapping("/societes")
	public void saveSociete(@RequestParam(name = "nom") String nom) {
		Societe soc = new Societe(nom);
		societeService.saveSociete(soc);
	}

	@PutMapping("/societes/{id}")
	public void updateSociete(@RequestParam @PathVariable(name = "id") Integer id,
			@RequestParam(name = "nom") String nom) {
		Societe soc= new Societe(id, nom);
		societeService.updateSociete(id, soc);
	}

	@DeleteMapping("/societe/{id}")
	public void deleteSociete(@PathVariable Integer id) {
		societeService.deleteSociete(id);
	}

}
