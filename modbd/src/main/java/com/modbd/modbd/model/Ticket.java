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

    /*
    @ManyToOne
    @JoinColumn(name = "otherID")
    private Obj obj;

    @OneToMany(mappedBy = "user", cascade = CascadeType.MERGE)
    private List<Obj2> objs = new ArrayList<>();

     */
}
