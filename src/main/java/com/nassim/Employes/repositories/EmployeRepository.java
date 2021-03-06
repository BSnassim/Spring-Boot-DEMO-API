package com.nassim.Employes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nassim.Employes.domain.Employe;
import com.nassim.Employes.domain.Societe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {
	
	public List<Employe> findBySociete(Societe soc);
}
