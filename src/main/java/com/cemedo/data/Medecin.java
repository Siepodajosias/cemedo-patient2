package  com.cemedo.data;
// Generated 1 juin 2022 � 14:01:29 by Hibernate Tools 4.3.5.Final

import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Medecin generated by hbm2java
 */
@Entity
@Table(name = "medecin", catalog = "heroku_88ae11bd39df693")
public class Medecin implements java.io.Serializable {

	private Integer idMedecins;
	private String nomMedecin;
	private String prenomMedecin;
	private String genreMedecin;
	private String residenceMedecin;
	private String specialiteMedecin;
	private String typeMedecin;
	private String emailMedecin;
	private int telephoneMedecin;
	private String password;
	private int numeroCniMedecin;
	private Date heureDebut;
	private Date heureFin;
	private String photoMedecin;
	private Double salaireMedecin;
	private Double primeMedecin;
	private Set<Examen> examens = new HashSet<Examen>(0);
	private Set<Facturepatient> facturepatients = new HashSet<Facturepatient>(0);
	private Set<Rendezvous> rendezvouses = new HashSet<Rendezvous>(0);
	private Set<Consultation> consultations = new HashSet<Consultation>(0);
	private Set<Rapport> rapports = new HashSet<Rapport>(0);
	private Set<Ordonnance> ordonnances = new HashSet<Ordonnance>(0);
	private Set<Appl> appls = new HashSet<Appl>(0);
	private Set<Chat> chats = new HashSet<Chat>(0);
	private Set<Dossier> dossiers = new HashSet<Dossier>(0);

	public Medecin() {
	}

	public Medecin(String nomMedecin, String prenomMedecin, String genreMedecin, String residenceMedecin,
			String specialiteMedecin, String typeMedecin, String emailMedecin, int telephoneMedecin, String password,
			int numeroCniMedecin) {
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.genreMedecin = genreMedecin;
		this.residenceMedecin = residenceMedecin;
		this.specialiteMedecin = specialiteMedecin;
		this.typeMedecin = typeMedecin;
		this.emailMedecin = emailMedecin;
		this.telephoneMedecin = telephoneMedecin;
		this.password = password;
		this.numeroCniMedecin = numeroCniMedecin;
	}

	public Medecin(String nomMedecin, String prenomMedecin, String genreMedecin, String residenceMedecin,
			String specialiteMedecin, String typeMedecin, String emailMedecin, int telephoneMedecin, String password,
			int numeroCniMedecin, Date heureDebut, Date heureFin, String photoMedecin, Double salaireMedecin,
			Double primeMedecin, Set<Examen> examens, Set<Facturepatient> facturepatients, Set<Rendezvous> rendezvouses,
			Set<Consultation> consultations, Set<Rapport> rapports, Set<Ordonnance> ordonnances, Set<Appl> appls,
			Set<Chat> chats, Set<Dossier> dossiers) {
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.genreMedecin = genreMedecin;
		this.residenceMedecin = residenceMedecin;
		this.specialiteMedecin = specialiteMedecin;
		this.typeMedecin = typeMedecin;
		this.emailMedecin = emailMedecin;
		this.telephoneMedecin = telephoneMedecin;
		this.password = password;
		this.numeroCniMedecin = numeroCniMedecin;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.photoMedecin = photoMedecin;
		this.salaireMedecin = salaireMedecin;
		this.primeMedecin = primeMedecin;
		this.examens = examens;
		this.facturepatients = facturepatients;
		this.rendezvouses = rendezvouses;
		this.consultations = consultations;
		this.rapports = rapports;
		this.ordonnances = ordonnances;
		this.appls = appls;
		this.chats = chats;
		this.dossiers = dossiers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_Medecins", unique = true, nullable = false)
	public Integer getIdMedecins() {
		return this.idMedecins;
	}

	public void setIdMedecins(Integer idMedecins) {
		this.idMedecins = idMedecins;
	}

	@Column(name = "nom_medecin", nullable = false, length = 45)
	public String getNomMedecin() {
		return this.nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	@Column(name = "prenom_medecin", nullable = false, length = 45)
	public String getPrenomMedecin() {
		return this.prenomMedecin;
	}

	public void setPrenomMedecin(String prenomMedecin) {
		this.prenomMedecin = prenomMedecin;
	}

	@Column(name = "genre_medecin", nullable = false, length = 45)
	public String getGenreMedecin() {
		return this.genreMedecin;
	}

	public void setGenreMedecin(String genreMedecin) {
		this.genreMedecin = genreMedecin;
	}

	@Column(name = "residence_medecin", nullable = false, length = 45)
	public String getResidenceMedecin() {
		return this.residenceMedecin;
	}

	public void setResidenceMedecin(String residenceMedecin) {
		this.residenceMedecin = residenceMedecin;
	}

	@Column(name = "specialite_medecin", nullable = false, length = 45)
	public String getSpecialiteMedecin() {
		return this.specialiteMedecin;
	}

	public void setSpecialiteMedecin(String specialiteMedecin) {
		this.specialiteMedecin = specialiteMedecin;
	}

	@Column(name = "type_medecin", nullable = false, length = 45)
	public String getTypeMedecin() {
		return this.typeMedecin;
	}

	public void setTypeMedecin(String typeMedecin) {
		this.typeMedecin = typeMedecin;
	}

	@Column(name = "email_medecin", nullable = false, length = 45)
	public String getEmailMedecin() {
		return this.emailMedecin;
	}

	public void setEmailMedecin(String emailMedecin) {
		this.emailMedecin = emailMedecin;
	}

	@Column(name = "telephone_medecin", nullable = false)
	public int getTelephoneMedecin() {
		return this.telephoneMedecin;
	}

	public void setTelephoneMedecin(int telephoneMedecin) {
		this.telephoneMedecin = telephoneMedecin;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "numero_CNI_medecin", nullable = false)
	public int getNumeroCniMedecin() {
		return this.numeroCniMedecin;
	}

	public void setNumeroCniMedecin(int numeroCniMedecin) {
		this.numeroCniMedecin = numeroCniMedecin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "heure_debut", length = 26)
	public Date getHeureDebut() {
		return this.heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "heure_fin", length = 26)
	public Date getHeureFin() {
		return this.heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	@Column(name = "photo_medecin", length = 45)
	public String getPhotoMedecin() {
		return this.photoMedecin;
	}

	public void setPhotoMedecin(String photoMedecin) {
		this.photoMedecin = photoMedecin;
	}

	@Column(name = "salaire_medecin", precision = 22, scale = 0)
	public Double getSalaireMedecin() {
		return this.salaireMedecin;
	}

	public void setSalaireMedecin(Double salaireMedecin) {
		this.salaireMedecin = salaireMedecin;
	}

	@Column(name = "prime_medecin", precision = 22, scale = 0)
	public Double getPrimeMedecin() {
		return this.primeMedecin;
	}

	public void setPrimeMedecin(Double primeMedecin) {
		this.primeMedecin = primeMedecin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Examen> getExamens() {
		return this.examens;
	}

	public void setExamens(Set<Examen> examens) {
		this.examens = examens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Facturepatient> getFacturepatients() {
		return this.facturepatients;
	}

	public void setFacturepatients(Set<Facturepatient> facturepatients) {
		this.facturepatients = facturepatients;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Rendezvous> getRendezvouses() {
		return this.rendezvouses;
	}

	public void setRendezvouses(Set<Rendezvous> rendezvouses) {
		this.rendezvouses = rendezvouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Consultation> getConsultations() {
		return this.consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Rapport> getRapports() {
		return this.rapports;
	}

	public void setRapports(Set<Rapport> rapports) {
		this.rapports = rapports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Ordonnance> getOrdonnances() {
		return this.ordonnances;
	}

	public void setOrdonnances(Set<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Appl> getAppls() {
		return this.appls;
	}

	public void setAppls(Set<Appl> appls) {
		this.appls = appls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set<Chat> getChats() {
		return this.chats;
	}

	public void setChats(Set<Chat> chats) {
		this.chats = chats;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "dossiers_has_medecins", catalog = "heroku_88ae11bd39df693", joinColumns = {
			@JoinColumn(name = "Medecins_id_Medecins", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Dossiers_id_dossier", nullable = false, updatable = false) })
	public Set<Dossier> getDossiers() {
		return this.dossiers;
	}

	public void setDossiers(Set<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

}
