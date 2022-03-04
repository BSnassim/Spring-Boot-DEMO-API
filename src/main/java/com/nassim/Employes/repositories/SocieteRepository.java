package com.nassim.Employes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nassim.Employes.domain.Societe;

@Repository
public interface SocieteRepository extends JpaRepository<Societe, Integer> {
	
}
