package com.modbd.modbd.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "parking_tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ticket;

    @Column(name = "date_ticket_issued")
    private Date date_ticket_issued;

    @Column(name = "date_ticket_finished")
    private Date date_ticket_finished;

    @Column(name = "id_vehicle")
    private Integer id_vehicle;

    @Column(name = "id_ticket_type")
    private Integer id_ticket_type;

    @Column(name = "id_ticket_status")
    private Integer id_ticket_status;

    @Column(name = "id_zone")
    private Integer id_zone;

    @Column(name = "price")
    private Integer price;

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Date getDate_ticket_issued() {
        return date_ticket_issued;
    }

    public void setDate_ticket_issued(Date date_ticket_issued) {
        this.date_ticket_issued = date_ticket_issued;
    }

    public Date getDate_ticket_finished() {
        return date_ticket_finished;
    }

    public void setDate_ticket_finished(Date date_ticket_finished) {
        this.date_ticket_finished = date_ticket_finished;
    }

    public Integer getId_vehicle() {
        return id_vehicle;
    }

    public void setId_vehicle(Integer id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public Integer getId_ticket_type() {
        return id_ticket_type;
    }

    public void setId_ticket_type(Integer id_ticket_type) {
        this.id_ticket_type = id_ticket_type;
    }

    public Integer getId_ticket_status() {
        return id_ticket_status;
    }

    public void setId_ticket_status(Integer id_ticket_status) {
        this.id_ticket_status = id_ticket_status;
    }

    public Integer getId_zone() {
        return id_zone;
    }

    public void setId_zone(Integer id_zone) {
        this.id_zone = id_zone;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    /*
    @ManyToOne
    @JoinColumn(name = "otherID")
    private Obj obj;

    @OneToMany(mappedBy = "user", cascade = CascadeType.MERGE)
    private List<Obj2> objs = new ArrayList<>();

     */
}
