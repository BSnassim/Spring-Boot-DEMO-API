package com.nassim.Employes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nassim.Employes.domain.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
