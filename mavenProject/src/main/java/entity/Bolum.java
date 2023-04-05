package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bolum")
public class Bolum {
	
	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "bolum_adi")
	private String bolumAdi;
	@Column(name = "arge_mi")
	private int argeMi;
	
	@ManyToOne
	@JoinColumn(name = "sirket_id")
	private Sirket sirket;
	
	public void bilgileriYazdir() {
		System.out.println(id+" , " + bolumAdi + " , " + argeMi + " , " + sirket.getAdi()); 
	}
	
	public Sirket getSirket() {
		return sirket;
	}
	public void setSirket(Sirket sirket) {
		this.sirket = sirket;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBolumAdi() {
		return bolumAdi;
	}
	public void setBolumAdi(String bolumAdi) {
		this.bolumAdi = bolumAdi;
	}
	public int getArgeMi() {
		return argeMi;
	}
	public void setArgeMi(int argeMi) {
		this.argeMi = argeMi;
	}

}
