package com.modbd.modbd.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "name")
    private String name;

    /*
    @ManyToOne
    @JoinColumn(name = "otherID")
    private Obj obj;

    @OneToMany(mappedBy = "user", cascade = CascadeType.MERGE)
    private List<Obj2> objs = new ArrayList<>();

     */
}
