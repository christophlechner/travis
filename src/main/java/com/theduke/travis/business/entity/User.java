package com.theduke.travis.business.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Christoph
 */
@Entity
public class User {
    
    @Id
    public String login;
    
    public String fullname;
    
    public String email;
}
