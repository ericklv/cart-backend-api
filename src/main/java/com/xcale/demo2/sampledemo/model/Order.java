//package com.xcale.demo2.sampledemo.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.CreatedDate;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//@Table(name = "ORDER")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private double price;
//    private double discounts;
//
//    @CreatedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdAt;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date paidAt;
//
//}
