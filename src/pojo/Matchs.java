package pojo;

// Generated 29-avr.-2014 11:57:26 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Matchs generated by hbm2java
 */
@Entity
@Table(name = "matchs", catalog = "argentinosll")
public class Matchs implements java.io.Serializable {

	private int numeroDeMatch;
	private Equipes equipes;
	private Coupe coupe;
	private Joueurs joueurs;
	private Clubadverse clubadverse;
	private String nomJoueur;
	private String prenomJoueur;
	private int delegue;
	private String score;
	private Calendrier calendrier;
	private Arbitre arbitre;

	public Matchs() {
	}

	public Matchs(int numeroDeMatch, Equipes equipes, Coupe coupe,
			Joueurs joueurs, Clubadverse clubadverse, String nomJoueur,
			String prenomJoueur, int delegue, String score) {
		this.numeroDeMatch = numeroDeMatch;
		this.equipes = equipes;
		this.coupe = coupe;
		this.joueurs = joueurs;
		this.clubadverse = clubadverse;
		this.nomJoueur = nomJoueur;
		this.prenomJoueur = prenomJoueur;
		this.delegue = delegue;
		this.score = score;
	}

	public Matchs(int numeroDeMatch, Equipes equipes, Coupe coupe,
			Joueurs joueurs, Clubadverse clubadverse, String nomJoueur,
			String prenomJoueur, int delegue, String score,
			Calendrier calendrier, Arbitre arbitre) {
		this.numeroDeMatch = numeroDeMatch;
		this.equipes = equipes;
		this.coupe = coupe;
		this.joueurs = joueurs;
		this.clubadverse = clubadverse;
		this.nomJoueur = nomJoueur;
		this.prenomJoueur = prenomJoueur;
		this.delegue = delegue;
		this.score = score;
		this.calendrier = calendrier;
		this.arbitre = arbitre;
	}

	@Id
	@Column(name = "NumeroDeMatch", unique = true, nullable = false)
	public int getNumeroDeMatch() {
		return this.numeroDeMatch;
	}

	public void setNumeroDeMatch(int numeroDeMatch) {
		this.numeroDeMatch = numeroDeMatch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Serie", nullable = false)
	public Equipes getEquipes() {
		return this.equipes;
	}

	public void setEquipes(Equipes equipes) {
		this.equipes = equipes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Coupe", nullable = false)
	public Coupe getCoupe() {
		return this.coupe;
	}

	public void setCoupe(Coupe coupe) {
		this.coupe = coupe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NumeroDAffiliation", nullable = false)
	public Joueurs getJoueurs() {
		return this.joueurs;
	}

	public void setJoueurs(Joueurs joueurs) {
		this.joueurs = joueurs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NomEquipeAdv", nullable = false)
	public Clubadverse getClubadverse() {
		return this.clubadverse;
	}

	public void setClubadverse(Clubadverse clubadverse) {
		this.clubadverse = clubadverse;
	}

	@Column(name = "Nom_joueur", nullable = false, length = 50)
	public String getNomJoueur() {
		return this.nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	@Column(name = "Prenom_joueur", nullable = false, length = 50)
	public String getPrenomJoueur() {
		return this.prenomJoueur;
	}

	public void setPrenomJoueur(String prenomJoueur) {
		this.prenomJoueur = prenomJoueur;
	}

	@Column(name = "Delegue", nullable = false)
	public int getDelegue() {
		return this.delegue;
	}

	public void setDelegue(int delegue) {
		this.delegue = delegue;
	}

	@Column(name = "Score", nullable = false, length = 4)
	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "matchs")
	public Calendrier getCalendrier() {
		return this.calendrier;
	}

	public void setCalendrier(Calendrier calendrier) {
		this.calendrier = calendrier;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "matchs")
	public Arbitre getArbitre() {
		return this.arbitre;
	}

	public void setArbitre(Arbitre arbitre) {
		this.arbitre = arbitre;
	}

}
