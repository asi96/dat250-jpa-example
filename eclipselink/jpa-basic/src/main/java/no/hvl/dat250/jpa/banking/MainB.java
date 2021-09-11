package no.hvl.dat250.jpa.banking;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainB {
    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select t from PersonB t");
        @SuppressWarnings("unchecked")
		List<PersonB> personList = q.getResultList();
        for (PersonB personB : personList) {
            System.out.println(personB);
        }
        System.out.println("Size: " + personList.size());

        // create new person
        em.getTransaction().begin();
        PersonB person = new PersonB();
        person.setName("Anders Simonsen");
        em.persist(person);
        
        Adress adress = new Adress();
        adress.setNumber(192);
        adress.setStreet("Øvre Kråkenes");
        em.persist(adress);
        
        Bank bank = new Bank();
        bank.setName("Sparebanken");
        em.persist(bank);
        
        CreditCard card = new CreditCard();
        card.setBalance(5000);
        card.setLimit(4500);
        card.setNumber(123);
        em.persist(card);
        
        Pincode code = new Pincode();
        code.setPincode("5156");
        code.setCount(1);
        em.persist(code);
        
        em.getTransaction().commit();
        
        em.close();
    }
}
