package pojo;

// Generated 29-avr.-2014 11:57:26 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Joueurs generated by hbm2java
 */
@Entity
@Table(name = "joueurs", catalog = "argentinosll")
public class Joueurs implements java.io.Serializable {

	private int numeroDaffiliation;
	private long telephone;
	private String serie;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private EquipesJoueurs equipesJoueurs;
	private Set<Matchs> matchses = new HashSet<Matchs>(0);
	private Blessures blessures;
	private Suspensions suspensions;

	public Joueurs() {
	}

	public Joueurs(int numeroDaffiliation, long telephone, String serie,
			String nom, String prenom, Date dateDeNaissance) {
		this.numeroDaffiliation = numeroDaffiliation;
		this.telephone = telephone;
		this.serie = serie;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
	}

	public Joueurs(int numeroDaffiliation, long telephone, String serie,
			String nom, String prenom, Date dateDeNaissance,
			EquipesJoueurs equipesJoueurs, Set<Matchs> matchses,
			Blessures blessures, Suspensions suspensions) {
		this.numeroDaffiliation = numeroDaffiliation;
		this.telephone = telephone;
		this.serie = serie;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.equipesJoueurs = equipesJoueurs;
		this.matchses = matchses;
		this.blessures = blessures;
		this.suspensions = suspensions;
	}

	@Id
	@Column(name = "NumeroDAffiliation", unique = true, nullable = false)
	public int getNumeroDaffiliation() {
		return this.numeroDaffiliation;
	}

	public void setNumeroDaffiliation(int numeroDaffiliation) {
		this.numeroDaffiliation = numeroDaffiliation;
	}

	@Column(name = "Telephone", nullable = false, precision = 15, scale = 0)
	public long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	@Column(name = "Serie", nullable = false, length = 20)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Column(name = "Nom", nullable = false, length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Prenom", nullable = false, length = 50)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateDeNaissance", nullable = false, length = 10)
	public Date getDateDeNaissance() {
		return this.dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "joueurs")
	public EquipesJoueurs getEquipesJoueurs() {
		return this.equipesJoueurs;
	}

	public void setEquipesJoueurs(EquipesJoueurs equipesJoueurs) {
		this.equipesJoueurs = equipesJoueurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "joueurs")
	public Set<Matchs> getMatchses() {
		return this.matchses;
	}

	public void setMatchses(Set<Matchs> matchses) {
		this.matchses = matchses;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "joueurs")
	public Blessures getBlessures() {
		return this.blessures;
	}

	public void setBlessures(Blessures blessures) {
		this.blessures = blessures;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "joueurs")
	public Suspensions getSuspensions() {
		return this.suspensions;
	}

	public void setSuspensions(Suspensions suspensions) {
		this.suspensions = suspensions;
	}

}
