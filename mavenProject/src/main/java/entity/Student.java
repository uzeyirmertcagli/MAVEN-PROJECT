package entity;

import jakarta.persistence.*;


@Entity
@Table(name = "student")
public class Student {
	
	
	@Id
	@SequenceGenerator(name = "seq_stdnt", sequenceName = "SEQ_STUDENT", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_stdnt")
	@Column(name = "id")
	private int id;
	
	@Column(name = "fname")
	private String name;
	
	@Column(name = "lname")
	private String surname;
	
	@Column(name = "contact_no")
	private String telefon;
	
	@OneToOne
	@JoinColumn(name = "identity_id")
	private Student_identity identity;

	public Student_identity getIdentity() {
		return identity;
	}

	public void setIdentity(Student_identity identity) {
		this.identity = identity;
	}

	public Student() {
		
	}
	
	public Student( String name, String surname, String telefon) {
		this.name = name;
		this.surname = surname;
		this.telefon = telefon;
	}
	
	
	public Student(int id, String name, String surname, String telefon) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.telefon = telefon;
	}
	
	public Student( String name, String surname, String telefon, Student_identity identity) {

		this.name = name;
		this.surname = surname;
		this.telefon = telefon;
		this.identity=identity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public void bilgileriYazdir() {
		System.out.println(id + " , " + name + " , " + surname + " , " + telefon  );
	}
	
}
