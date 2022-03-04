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
import com.nassim.Employes.service.EmployeService;

@RequestMapping("/APIemploye")
@RestController
public class EmployeEndpoint {
	@Autowired(required = false)
	EmployeService employeService;

	@GetMapping("/employes")
	public List<Employe> findAllEmp() {
		return employeService.findAllEmploye();
	}

	@GetMapping("/employes/{id}")
	public Employe findEmp(@PathVariable Integer id) {
		return employeService.findEmploye(id);
	}

	@PostMapping("/employes")
	public void saveEmploye(
			@RequestParam(name = "nom") String nom,
			@RequestParam(name = "prenom") String prenom,
			@RequestParam(name = "age") Integer age) {
		Employe emp = new Employe(nom, prenom, age);
		employeService.saveEmploye(emp);
	}

	@PutMapping("/employes/{id}")
	public void updateEmploye(@RequestParam @PathVariable(name = "id") Integer id,
			@RequestParam(name = "nom") String nom,
			@RequestParam(name = "prenom") String prenom,
			@RequestParam(name = "age") Integer age
			/*@RequestParam(name = "IdSociete")*/) {
		Employe emp = new Employe(id, nom, prenom, age/*, societe*/);
		employeService.updateEmploye(id, emp);
	}

	@DeleteMapping("/employes/{id}")
	public void deleteEmploye(@PathVariable Integer id) {
		employeService.deleteEmploye(id);
	}
}
