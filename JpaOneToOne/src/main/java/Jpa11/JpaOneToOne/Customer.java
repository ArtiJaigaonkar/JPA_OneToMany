package Jpa11.JpaOneToOne;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Customer {
	@Id
	
	private int cid;
	private String cname;
	@OneToOne
	private order1 Order;
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", Order=" + Order + "]";
	}
	public Customer(int cid, String cname, order1 order) {
		super();
		this.cid = cid;
		this.cname = cname;
		Order = order;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public order1 getOrder() {
		return Order;
	}
	public void setOrder(order1 order) {
		Order = order;
	}
}
