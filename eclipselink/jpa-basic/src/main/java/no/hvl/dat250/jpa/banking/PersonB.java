package no.hvl.dat250.jpa.banking;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class PersonB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany
    private ArrayList<Adress> adress;

    @OneToMany
    private ArrayList<CreditCard> cards;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Adress> getAdress() {
		return adress;
	}
	
	public List<CreditCard> getCards() {
		return cards;
	}
	
	@Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
