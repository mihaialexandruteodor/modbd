package com.modbd.modbd.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @Column(name = "id_vehicle")
    private Integer id_vehicle;

    @Column(name = "vin")
    private String vin;

    @Column(name = "vehicle_plate")
    private String vehicle_plate;

    @Column(name = "id_model")
    private Integer id_model;

    @Column(name = "id_brand")
    private Integer id_brand;

    @Column(name = "id_customer")
    private Integer id_customer;

    public Integer getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(Integer id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehicle_plate() {
        return vehicle_plate;
    }

    public void setVehicle_plate(String vehicle_plate) {
        this.vehicle_plate = vehicle_plate;
    }

    public Integer getId_model() {
        return id_model;
    }

    public void setId_model(Integer id_model) {
        this.id_model = id_model;
    }

    public Integer getId_brand() {
        return id_brand;
    }

    public void setId_brand(Integer id_brand) {
        this.id_brand = id_brand;
    }

    public Integer getId_customer() {
        return id_customer;
    }

    public void setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
    }
}
