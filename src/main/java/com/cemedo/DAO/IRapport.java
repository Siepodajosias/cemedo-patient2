package com.cemedo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cemedo.data.Rapport;

@CrossOrigin("*")
@RepositoryRestResource
public interface IRapport extends JpaRepository<Rapport, Integer>{

}
