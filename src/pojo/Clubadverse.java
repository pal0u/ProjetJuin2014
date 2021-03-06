package pojo;

// Generated 29-avr.-2014 11:57:26 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clubadverse generated by hbm2java
 */
@Entity
@Table(name = "clubadverse", catalog = "argentinosll")
public class Clubadverse implements java.io.Serializable {

	private String nom;
	private int matricule;
	private Adresse adresse;
	private Set<Engendre> engendres = new HashSet<Engendre>(0);
	private Set<Matchs> matchses = new HashSet<Matchs>(0);

	public Clubadverse() {
	}

	public Clubadverse(String nom, int matricule) {
		this.nom = nom;
		this.matricule = matricule;
	}

	public Clubadverse(String nom, int matricule, Adresse adresse,
			Set<Engendre> engendres, Set<Matchs> matchses) {
		this.nom = nom;
		this.matricule = matricule;
		this.adresse = adresse;
		this.engendres = engendres;
		this.matchses = matchses;
	}

	@Id
	@Column(name = "Nom", unique = true, nullable = false, length = 30)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Matricule", nullable = false)
	public int getMatricule() {
		return this.matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "clubadverse")
	public Adresse getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clubadverse")
	public Set<Engendre> getEngendres() {
		return this.engendres;
	}

	public void setEngendres(Set<Engendre> engendres) {
		this.engendres = engendres;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clubadverse")
	public Set<Matchs> getMatchses() {
		return this.matchses;
	}

	public void setMatchses(Set<Matchs> matchses) {
		this.matchses = matchses;
	}

}
