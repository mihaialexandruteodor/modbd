package com.modbd.modbd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zones")
public class Zone {

    @Id
    @Column(name = "id_zone")
    private Integer id_zone;

    @Column(name = "zone_name")
    private String zone_name;

    @Column(name = "zone_tariff")
    private Integer zone_tariff;

    @Column(name = "id_city")
    private Integer id_city;

    public Integer getId_zone() {
        return id_zone;
    }

    public void setId_zone(Integer id_zone) {
        this.id_zone = id_zone;
    }

    public String getZone_name() {
        return zone_name;
    }

    public void setZone_name(String zone_name) {
        this.zone_name = zone_name;
    }

    public Integer getZone_tariff() {
        return zone_tariff;
    }

    public void setZone_tariff(Integer zone_tariff) {
        this.zone_tariff = zone_tariff;
    }

    public Integer getId_city() {
        return id_city;
    }

    public void setId_city(Integer id_city) {
        this.id_city = id_city;
    }
}
