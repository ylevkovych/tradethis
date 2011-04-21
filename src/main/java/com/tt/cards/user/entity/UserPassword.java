package com.tt.cards.user.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: ylevkovych
 * Date: 4/18/11
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "USERPASSWORD")
public class UserPassword implements Serializable {

    @Id @GeneratedValue
    @Column(name="ID")
    private Long id;
    @Column(name="PASSWORD")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
