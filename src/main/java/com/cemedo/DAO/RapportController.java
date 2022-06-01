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

import com.cemedo.data.Rapport;

@CrossOrigin("*")
@RestController
public class RapportController {
	@Autowired
 private IRapport rapport;
 
	
 @GetMapping(value = "/listeRpt")
 public List<Rapport> getListe(){
	  return rapport.findAll();
 }
 
 @GetMapping(value = "/listeRpt/{id}")
 public Rapport getListeId(@PathVariable(name = "id") Integer id){
	  return rapport.findById(id).get();
 }
 
 
	@PostMapping(value = "/listeRpt")
	public Rapport Enregistrer(@RequestBody Rapport p) {
	     return  rapport.save(p);
	}
 
	@PutMapping(value = "/listeRpt/{id}")
	public Rapport update(@PathVariable(name="id") Integer id,@RequestBody Rapport p) {
		p.setIdRapport(id);
	   return rapport.save(p);
	}
	
	@DeleteMapping(value = "/listeRpt/{id}")
	public void supprimer(@PathVariable(name="id") Integer id) {
		rapport.deleteById(id);
	}
}
