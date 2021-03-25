/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.HobbyEntity;
import entities.PersonEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class HobbyDTO {
    
    private String hobbyName;

    public HobbyDTO(String hobby) {
        this.hobbyName = hobby;
    }
    
    public HobbyDTO(HobbyEntity he){
        this.hobbyName = he.getHobbyName();
        
    }
    
    

    public String getHobby() {
        return hobbyName;
    }

    public void setHobby(String hobbyName) {
        this.hobbyName = hobbyName;
    }
    
    
  
 
    
}
