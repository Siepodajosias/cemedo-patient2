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

import com.cemedo.data.Facturepatient;

@CrossOrigin("*")
@RestController
public class FactureController {

	@Autowired
 private IFacture facturet;
 
	
 @GetMapping(value = "/listeFact")
 public List<Facturepatient> getListe(){
	  return facturet.findAll();
 }
 
 @GetMapping(value = "/listeFact/{id}")
 public Facturepatient getListeId(@PathVariable(name = "id") Integer id){
	  return facturet.findById(id).get();
 }
 
 
	@PostMapping(value = "/listeFact")
	public Facturepatient Enregistrer(@RequestBody Facturepatient p) {
	     return  facturet.save(p);
	}
 
	@PutMapping(value = "/listeFact/{id}")
	public Facturepatient update(@PathVariable(name="id") Integer id,@RequestBody Facturepatient p) {
		p.setNumeroFacture(id);
	   return facturet.save(p);
	}
	
	@DeleteMapping(value = "/listeFact/{id}")
	public void supprimer(@PathVariable(name="id") Integer id) {
		facturet.deleteById(id);
	}
}
