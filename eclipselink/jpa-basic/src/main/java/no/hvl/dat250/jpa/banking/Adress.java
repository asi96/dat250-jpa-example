package no.hvl.dat250.jpa.banking;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String street;
	private int number;
	
    @ManyToMany
    private ArrayList<PersonB> people;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public List<PersonB> getPeople() {
		return people;
	}
	
	@Override
    public String toString() {
        return "Adress [street=" + street + ", number=" + number
                + "]";
    }
}
