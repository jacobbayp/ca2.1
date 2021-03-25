package facades;

import dtos.HobbyDTO;
import dtos.PersonDTO;
import entities.HobbyEntity;
import entities.PersonEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class PersonFacade {

    private static PersonFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private PersonFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static PersonFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public PersonDTO create(PersonDTO rm){
        PersonEntity rme = new PersonEntity(rm.getFirstName(), rm.getLastName(), rm.getEmail());
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(rme);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new PersonDTO(rme);
    }
   

    public HobbyDTO createHobby(HobbyDTO hd){
        HobbyEntity he = new HobbyEntity(hd.getHobby());
        EntityManager em = emf.createEntityManager();
        
              
        
        try{
            em.getTransaction().begin();
            em.persist(he);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
            return new HobbyDTO(he);
        }
    }



