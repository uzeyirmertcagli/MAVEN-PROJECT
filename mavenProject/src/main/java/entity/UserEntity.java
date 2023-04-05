package entity;

import jakarta.persistence.*;


@Entity
@Table(name= "user_entity")
public class UserEntity {
	@Id
	@SequenceGenerator(name="userEntitySeq", sequenceName="STUDENT_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy  = GenerationType.SEQUENCE, generator="userEntitySeq")
	@Column(name  ="user_id")
	private long id;
	
	@Column(name="isim", length =255)
	private String name;
	
	@Column(name="soyisim", length =255)
	private String surname;
	
	@Column(name="student_email_adress", length =255)
	private String email;
	
	public void bilgileriYazdir() {
		System.out.println("id="+id+", name="+name+", surname="+surname+", email="+email);
	}

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
