package no.hvl.dat250.jpa.banking;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Pincode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String pincode;
	private int count;
	
	public int getCount() {
		return this.count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getPincode() {
		return this.pincode;
	}
	
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
    public String toString() {
        return "Pincode [pincode=" + pincode + ", count=" + count
                 + "]";
    }
}
