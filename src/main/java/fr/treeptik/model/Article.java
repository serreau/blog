package fr.treeptik.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Article implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String chapeau;
	@Column(length=1000)
	private String contenu;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private Boolean enLigne;
	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Auteur auteur;
	@JsonIgnore
	@OneToMany(mappedBy="article")
	private Set<Commentaire> commentaires;
	
	
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(Integer id, String nom, String chapeau, Date dateCreation,
			Boolean enLigne, Categorie categorie, Auteur auteur,
			Set<Commentaire> commentaires) {
		super();
		this.id = id;
		this.nom = nom;
		this.chapeau = chapeau;
		this.dateCreation = dateCreation;
		this.enLigne = enLigne;
		this.categorie = categorie;
		this.auteur = auteur;
		this.commentaires = commentaires;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getChapeau() {
		return chapeau;
	}
	public void setChapeau(String chapeau) {
		this.chapeau = chapeau;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Boolean getEnLigne() {
		return enLigne;
	}
	public void setEnLigne(Boolean enLigne) {
		this.enLigne = enLigne;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}	
	public Set<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", chapeau=" + chapeau
				+ ", contenu=" + contenu + ", dateCreation=" + dateCreation
				+ ", enLigne=" + enLigne + ", categorie=" + categorie
				+ ", auteur=" + auteur + ", commentaires=" + commentaires + "]";
	}


}
