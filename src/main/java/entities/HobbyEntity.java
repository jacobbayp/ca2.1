/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author jacob
 */
@Entity
@NamedQuery(name = "HobbyEntity.deleteAllRows", query = "DELETE from HobbyEntity")
public class HobbyEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hobbyName;
    
    @OneToOne(mappedBy = "Hobby_Entity")
    private PersonEntity person;

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
    
    
    
    
    
    public HobbyEntity(){
        
    }

    public HobbyEntity(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobby(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}