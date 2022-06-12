package com.anc.cinema.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@ToString
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cinema implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude, latitude, altitude;
    private int nombreSales;

    @OneToMany(mappedBy = "cinema")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Salle> salles;
    @ManyToOne
    private Ville ville;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public int getNombreSales() {
		return nombreSales;
	}
	public void setNombreSales(int nombreSales) {
		this.nombreSales = nombreSales;
	}
	public Collection<Salle> getSalles() {
		return salles;
	}
	public void setSalles(Collection<Salle> salles) {
		this.salles = salles;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public Cinema(Long id, String name, double longitude, double latitude, double altitude, int nombreSales,
			Collection<Salle> salles, Ville ville) {
		super();
		this.id = id;
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.nombreSales = nombreSales;
		this.salles = salles;
		this.ville = ville;
	}
	public Cinema() {
		super();
	}

}
