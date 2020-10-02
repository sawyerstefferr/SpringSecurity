//package com.example.wfc.entity;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Data
//@Entity
//@NoArgsConstructor
//@Table(name="authorities")
//public class Authority {
//    @Id
//    @Column(name="authority_id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @Column(name="authority")
//    private String authority;
//
//    @OneToMany
//    @JoinColumn(name="username")
//    private List<User> users;
//
//
//
//}
