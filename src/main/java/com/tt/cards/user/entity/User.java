package com.tt.cards.user.entity;

import com.tt.cards.user.enums.Role;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: ylevkovych
 * Date: 4/18/11
 * Time: 10:57 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {

    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ROLE", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne
    @JoinColumn(name="USERID")
    @Column(name = "PASSWORD")
    private UserPassword password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UserPassword getPassword() {
        return password;
    }

    public void setPassword(UserPassword password) {
        this.password = password;
    }
}
