/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.HobbyEntity;
import entities.PersonEntity;
import entities.PhoneEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        
        /*
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        PersonFacade fe = PersonFacade.getFacadeExample(emf);
        */
        /*
        
        fe.create(new PersonDTO(new PersonEntity("jacob", "petersen", "jacobbayp@gmail.com")));
        fe.createHobby(new HobbyDTO(new HobbyEntity("tennis")));
        
        */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        PersonEntity p1 = new PersonEntity("Jacob", "Petersen", "jacobbayp@gmail.com");
        HobbyEntity h1 = new HobbyEntity("tennis");
        
        PhoneEntity pe1 = new PhoneEntity(1234, "nokia 3310");
        p1.addPhones(pe1);
        
        p1.setHobby_Entity(h1);
        
        em.getTransaction().begin();
        em.persist(p1);
     
        em.getTransaction().commit();
        
        
        System.out.println("p1: " + p1.getFirstName());
        System.out.println("h1: " + h1.getHobbyName());
   
        
        System.out.println("lad os se om to-vejs virker: " + h1.getPerson().getFirstName());
        
       
             System.out.println("p1 telefon er: " +  h1.getPerson().getPhones());
        
     
        
    }
    
    public static void main(String[] args) {
        populate();
    }
}
