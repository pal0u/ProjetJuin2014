package pojo;

// Generated 29-avr.-2014 11:57:26 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Engendre generated by hbm2java
 */
@Entity
@Table(name = "engendre", catalog = "argentinosll")
public class Engendre implements java.io.Serializable {

	private int numeroDeMatch;
	private Calendrier calendrier;
	private Clubadverse clubadverse;
	private String nomClub;
	private String serie;

	public Engendre() {
	}

	public Engendre(Calendrier calendrier, Clubadverse clubadverse,
			String nomClub, String serie) {
		this.calendrier = calendrier;
		this.clubadverse = clubadverse;
		this.nomClub = nomClub;
		this.serie = serie;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "calendrier"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "NumeroDeMatch", unique = true, nullable = false)
	public int getNumeroDeMatch() {
		return this.numeroDeMatch;
	}

	public void setNumeroDeMatch(int numeroDeMatch) {
		this.numeroDeMatch = numeroDeMatch;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Calendrier getCalendrier() {
		return this.calendrier;
	}

	public void setCalendrier(Calendrier calendrier) {
		this.calendrier = calendrier;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Nom", nullable = false)
	public Clubadverse getClubadverse() {
		return this.clubadverse;
	}

	public void setClubadverse(Clubadverse clubadverse) {
		this.clubadverse = clubadverse;
	}

	@Column(name = "NomClub", nullable = false, length = 20)
	public String getNomClub() {
		return this.nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}

	@Column(name = "Serie", nullable = false, length = 20)
	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}