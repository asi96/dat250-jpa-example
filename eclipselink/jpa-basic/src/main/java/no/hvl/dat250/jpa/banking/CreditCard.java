package no.hvl.dat250.jpa.banking;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

@Entity
public class CreditCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int number;
	private int limit;
	private int balance;
	
	@OneToOne
    private Pincode pin;
	
	@OneToOne
    private Bank bank;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getLimit() {
		return this.limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public Pincode getPin() {
		return pin;
	}
	
	@Override
    public String toString() {
        return "Credit Card [number=" + number + ", limit=" + limit
                + ", balance=" + balance + "]";
    }
}
