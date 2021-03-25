/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.PersonEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class PersonDTO {
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    
    public PersonDTO(int id, String firstname, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
  
       
    }
    
    public PersonDTO(PersonEntity pe){
        this.id = pe.getId();
        this.firstName = pe.getFirstName();
        this.lastName = pe.getLastName();
        this.email = pe.getEmail();
    }

   
    
       public static List<PersonDTO> getDtos (List<PersonEntity> rms){
        List<PersonDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new PersonDTO(rm)));
        return rmdtos;
    }
    
    
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
