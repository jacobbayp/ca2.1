package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@NamedQuery(name = "PersonEntity.deleteAllRows", query = "DELETE from PersonEntity")
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;   
    private String email;
    @OneToOne(cascade = CascadeType.PERSIST)
    private HobbyEntity Hobby_Entity;
    
    @OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
    List<PhoneEntity> phones;
    
    /*
    address skal have en @OneToMany (mappedBy = "address", cascade = CascadeType.PERSIST)
    */

    public List<PhoneEntity> getPhones() {
        return phones;
    }

    public void addPhones(PhoneEntity phones) {
        this.phones.add(phones);
        if(phones != null){
            phones.setPerson(this);
        }
    }
    
    
    
    
    
    
    
    
    

    public HobbyEntity getHobby_Entity() {
        return Hobby_Entity;
    }

    public void setHobby_Entity(HobbyEntity Hobby_Entity) {
        this.Hobby_Entity = Hobby_Entity;
        if(Hobby_Entity != null){
            Hobby_Entity.setPerson(this);
        }
    }
 
    
    
    
    
    
    public PersonEntity() {
    }  

    public PersonEntity( String firstName, String lastName, String email) {
      
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phones = new ArrayList<>();
    }
    
    
    
    // TODO, delete this class, or rename to an Entity class that makes sense for what you are about to do
    // Delete EVERYTHING below if you decide to use this class, it's dummy data used for the initial demo


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}


