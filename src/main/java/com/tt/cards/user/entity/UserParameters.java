package com.tt.cards.user.entity;

import com.tt.cards.company.entity.Company;
import com.tt.cards.warehouse.entity.Warehouse;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: ylevkovych
 * Date: 4/18/11
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="USERPARAMETERS")
public class UserParameters  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    @ManyToOne
    @Column(name="CURCOMPANY")
    private Company curCompany;
    @ManyToOne
    @Column(name="CURWAREHOUSE")
    private Warehouse curWarehouse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCurCompany() {
        return curCompany;
    }

    public void setCurCompanyId(Company curCompany) {
        this.curCompany = curCompany;
    }

    public Warehouse getCurWarehouse() {
        return curWarehouse;
    }

    public void setCurWarehouse(Warehouse curWarehouse) {
        this.curWarehouse = curWarehouse;
    }
}
