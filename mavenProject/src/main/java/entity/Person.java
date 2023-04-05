package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "person")
public class Person {
	@Id
	@Column(name  ="id")
	private long id;
	
	@Column(name="name", length =255)
	private String name;

	@OneToOne
	@JoinColumn(name="pasaport")
	private Pasaport pasaport;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pasaport getPasaport() {
		return pasaport;
	}

	public void setPasaport(Pasaport pasaport) {
		this.pasaport = pasaport;
	}
	
	
}
