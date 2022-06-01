package com.cemedo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cemedo.data.Ordonnance;

@CrossOrigin("*")
@RestController
public class OrdonnanceController {
	
	@Autowired
 private IOrdonnance ordonnance;
 
	
 @GetMapping(value = "/listeOrd")
 public List<Ordonnance> getListe(){
	  return ordonnance.findAll();
 }
 
 @GetMapping(value = "/listeOrd/{id}")
 public Ordonnance getListeId(@PathVariable(name = "id") Integer id){
	  return ordonnance.findById(id).get();
 }
 
 
	@PostMapping(value = "/listeOrd")
	public Ordonnance Enregistrer(@RequestBody Ordonnance p) {
	     return  ordonnance.save(p);
	}
 
	@PutMapping(value = "/listeOrd/{id}")
	public Ordonnance update(@PathVariable(name="id") Integer id,@RequestBody Ordonnance p) {
		p.setIdOrdonnance(id);
	   return ordonnance.save(p);
	}
	
	@DeleteMapping(value = "/listeOrd/{id}")
	public void supprimer(@PathVariable(name="id") Integer id) {
		ordonnance.deleteById(id);
	}

}
