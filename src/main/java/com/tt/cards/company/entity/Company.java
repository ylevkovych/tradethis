package com.tt.cards.company.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: ylevkovych
 * Date: 4/18/11
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="COMPANY")
public class Company implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    @Column(name="NAME", nullable = false)
    private String name;
    @Column(name="DESCRIPTION")
    private Long description;

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

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }
}
