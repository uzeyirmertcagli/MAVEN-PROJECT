package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_identity")

public class Student_identity {

	public Student_identity() {
		
	}
	
	@Id
	@SequenceGenerator(name = "seq_std_idntty", sequenceName = "SEQ_STD_IDENTITY", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_std_idntty")
	@Column(name  ="id")
	private int id;
	
	@Column(name="student_no")
	private int numara;
	
	@Column(name="bolum")
	private String bolum;
	
	public Student_identity(int numara, String bolum) {
		this.numara = numara;
		this.bolum = bolum;
	}
	
	public void bilgileriYazdir() {
		System.out.println(id + " , " + numara  + " , " + bolum);
	}
	




	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	

	
}
