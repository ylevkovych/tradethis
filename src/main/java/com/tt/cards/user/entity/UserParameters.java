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
    @Column(name="CURCOMPANYID")
    private Company curCompanyId;
    @ManyToOne
    @Column(name="CURWAREHOUSEID")
    private Warehouse curWarehouseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCurCompanyId() {
        return curCompanyId;
    }

    public void setCurCompanyId(Company curCompanyId) {
        this.curCompanyId = curCompanyId;
    }

    public Warehouse getCurWarehouseId() {
        return curWarehouseId;
    }

    public void setCurWarehouseId(Warehouse curWarehouse) {
        this.curWarehouseId = curWarehouse;
    }
}
