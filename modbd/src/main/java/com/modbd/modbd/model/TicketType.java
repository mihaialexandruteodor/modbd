package com.modbd.modbd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_types")
public class TicketType {

    @Id
    @Column(name = "id_tichet_type")
    private Integer id_tichet_type;

    @Column(name = "type_name")
    private String type_name;

    @Column(name = "type_tariff")
    private Integer type_tariff;

    public Integer getId_tichet_type() {
        return id_tichet_type;
    }

    public void setId_tichet_type(Integer id_tichet_type) {
        this.id_tichet_type = id_tichet_type;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getType_tariff() {
        return type_tariff;
    }

    public void setType_tariff(Integer type_tariff) {
        this.type_tariff = type_tariff;
    }
}
