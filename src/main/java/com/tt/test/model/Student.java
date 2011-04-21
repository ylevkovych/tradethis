package com.tt.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by IntelliJ IDEA.
 * User: ylevkovych
 * Date: 4/13/11
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Student {

    @Id @GeneratedValue
    private Long Id;
    private String firstName;
    private String lastName;
    @Version
    private Long version;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
