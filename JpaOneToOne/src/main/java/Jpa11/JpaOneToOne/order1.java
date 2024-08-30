package Jpa11.JpaOneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class order1 {
	@Id
	
	private int id;
	private String oname;
	private int oprice;
	private String Category;
	
	public order1() {
		super();
		}

	public order1(int id, String oname, int oprice, String category) {
		super();
		this.id = id;
		this.oname = oname;
		this.oprice = oprice;
		Category = category;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", oname=" + oname + ", oprice=" + oprice + ", Category=" + Category + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public int getOprice() {
		return oprice;
	}

	public void setOprice(int oprice) {
		this.oprice = oprice;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	
	

}
