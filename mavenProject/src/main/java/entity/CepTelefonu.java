package entity;

import jakarta.persistence.*;


@Entity 
@Table(name="cep_telefonu")
public class CepTelefonu {

	@Id
	@Column(name="cep_telefonu_id")
	private int id;
	
	@Column(name="marka" , length = 255)
	private String marka;
	
	@Column(name="kamera_pixel")
	private int pixel; 
	
	@Column(name="renk")
	private String renk;
	
	public CepTelefonu(int id, String marka, int pixel, String renk) {
		super();
		this.id = id;
		this.marka = marka;
		this.pixel = pixel;
		this.renk = renk;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}


}
