package com.ayoub.avions.entities;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Avions{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvions;
    private String nomAvions;
    private Double prixAvions;
    private Date dateCreation;
    @ManyToOne
    private Company company;
//    @OneToOne
//    private Image image;

    @OneToMany (mappedBy = "avion")
    private List<Image> images;

    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Avions(){
        super();
    }
    public Avions(String nomAvions, Double prixAvions, Date dateCreation) {
        super();
        this.nomAvions = nomAvions;
        this.prixAvions = prixAvions;
        this.dateCreation = dateCreation;
    }
    public Avions(Long idAvions, String nomAvions, Double prixAvions, Date dateCreation, Company company) {
		super();
		this.idAvions = idAvions;
		this.nomAvions = nomAvions;
		this.prixAvions = prixAvions;
		this.dateCreation = dateCreation;
		this.company = company;
	}

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Long getIdAvions() {
        return idAvions;
    }
    public void setIdAvions(Long idAvions) {
        this.idAvions = idAvions;
    }
    public String getNomAvions() {
        return nomAvions;
    }
    public void setNomAvions(String nomAvions) {
        this.nomAvions = nomAvions;
    }
    public Double getPrixAvions() {
        return prixAvions;
    }
    public void setPrixAvions(Double prixAvions) {
        this.prixAvions = prixAvions;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    @Override
    public String toString() {
        return "Avions [idAvions=" + idAvions + ", nomAvions=" +
                nomAvions + ", prixProduit=" + prixAvions
                + ", dateCreation=" + dateCreation + "]";
    }
}