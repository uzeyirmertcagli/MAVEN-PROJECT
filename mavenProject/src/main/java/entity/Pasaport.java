package entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pasaport")
public class Pasaport {
	@Id
	@Column(name ="id")
	private long id;
	
	@Column(name="valid_date")
	private Date valiDate;
	
	public long getId() {
		return id;
	}

	public Date getValiDate() {
		return valiDate;
	}

	public void setValiDate(Date valiDate) {
		this.valiDate = valiDate;
	}

	public void setId(long id) {
		this.id = id;
	}
}
