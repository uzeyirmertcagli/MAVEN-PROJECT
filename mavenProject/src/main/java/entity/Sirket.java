package entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="sirket")
public class Sirket {

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "adi")
	private String adi;
	@Column(name = "sehir")
	private String sehir;
	@Column(name = "vergi_levha")
	private String vergi_levha;
	@Column(name = "son_yil_ciro")
	private long son_yil_ciro;
	
	@OneToMany(mappedBy = "sirket",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Bolum> bolumList;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getVergi_levha() {
		return vergi_levha;
	}
	public void setVergi_levha(String vergi_levha) {
		this.vergi_levha = vergi_levha;
	}
	public long getSon_yil_ciro() {
		return son_yil_ciro;
	}
	public void setSon_yil_ciro(long son_yil_ciro) {
		this.son_yil_ciro = son_yil_ciro;
	}
	
}
