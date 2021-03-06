package  com.cemedo.data;
// Generated 1 juin 2022 � 14:01:29 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Medicament2 generated by hbm2java
 */
@Entity
@Table(name = "medicament2", catalog = "heroku_88ae11bd39df693")
public class Medicament2 implements java.io.Serializable {

	private Integer idMedicament;
	private String nomMedicament;
	private String quantiteMedicament;
	private double prixMedicament;
	private String dureeTraitementMedicament;
	private String heure1Medicament;
	private String heure2Medicament;
	private String heure3Medicament;
	private String heure4Medicament;
	private Set<Ordonnance> ordonnances = new HashSet<Ordonnance>(0);

	public Medicament2() {
	}

	public Medicament2(String nomMedicament, String quantiteMedicament, double prixMedicament,
			String dureeTraitementMedicament, String heure1Medicament) {
		this.nomMedicament = nomMedicament;
		this.quantiteMedicament = quantiteMedicament;
		this.prixMedicament = prixMedicament;
		this.dureeTraitementMedicament = dureeTraitementMedicament;
		this.heure1Medicament = heure1Medicament;
	}

	public Medicament2(String nomMedicament, String quantiteMedicament, double prixMedicament,
			String dureeTraitementMedicament, String heure1Medicament, String heure2Medicament, String heure3Medicament,
			String heure4Medicament, Set<Ordonnance> ordonnances) {
		this.nomMedicament = nomMedicament;
		this.quantiteMedicament = quantiteMedicament;
		this.prixMedicament = prixMedicament;
		this.dureeTraitementMedicament = dureeTraitementMedicament;
		this.heure1Medicament = heure1Medicament;
		this.heure2Medicament = heure2Medicament;
		this.heure3Medicament = heure3Medicament;
		this.heure4Medicament = heure4Medicament;
		this.ordonnances = ordonnances;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_medicament", unique = true, nullable = false)
	public Integer getIdMedicament() {
		return this.idMedicament;
	}

	public void setIdMedicament(Integer idMedicament) {
		this.idMedicament = idMedicament;
	}

	@Column(name = "nom_medicament", nullable = false, length = 45)
	public String getNomMedicament() {
		return this.nomMedicament;
	}

	public void setNomMedicament(String nomMedicament) {
		this.nomMedicament = nomMedicament;
	}

	@Column(name = "quantite_medicament", nullable = false, length = 45)
	public String getQuantiteMedicament() {
		return this.quantiteMedicament;
	}

	public void setQuantiteMedicament(String quantiteMedicament) {
		this.quantiteMedicament = quantiteMedicament;
	}

	@Column(name = "prix_medicament", nullable = false, precision = 22, scale = 0)
	public double getPrixMedicament() {
		return this.prixMedicament;
	}

	public void setPrixMedicament(double prixMedicament) {
		this.prixMedicament = prixMedicament;
	}

	@Column(name = "duree_traitement_medicament", nullable = false, length = 45)
	public String getDureeTraitementMedicament() {
		return this.dureeTraitementMedicament;
	}

	public void setDureeTraitementMedicament(String dureeTraitementMedicament) {
		this.dureeTraitementMedicament = dureeTraitementMedicament;
	}

	@Column(name = "heure1_medicament", nullable = false, length = 45)
	public String getHeure1Medicament() {
		return this.heure1Medicament;
	}

	public void setHeure1Medicament(String heure1Medicament) {
		this.heure1Medicament = heure1Medicament;
	}

	@Column(name = "heure2_medicament", length = 45)
	public String getHeure2Medicament() {
		return this.heure2Medicament;
	}

	public void setHeure2Medicament(String heure2Medicament) {
		this.heure2Medicament = heure2Medicament;
	}

	@Column(name = "heure3_medicament", length = 45)
	public String getHeure3Medicament() {
		return this.heure3Medicament;
	}

	public void setHeure3Medicament(String heure3Medicament) {
		this.heure3Medicament = heure3Medicament;
	}

	@Column(name = "heure4_medicament", length = 45)
	public String getHeure4Medicament() {
		return this.heure4Medicament;
	}

	public void setHeure4Medicament(String heure4Medicament) {
		this.heure4Medicament = heure4Medicament;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "medicaments_has_ordonnances", catalog = "heroku_88ae11bd39df693", joinColumns = {
			@JoinColumn(name = "Medicaments_id_medicament", nullable = false, updatable = false) }, 
	inverseJoinColumns = {@JoinColumn(name = "Ordonnances_id_ordonnance", nullable = false, updatable = false)})
	public Set<Ordonnance> getOrdonnances() {
		return this.ordonnances;
	}

	public void setOrdonnances(Set<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

}
