//package com.shopping_restapi.entities;
//
//import com.shopping_restapi.enums.ERoleName;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//
///**
// * @author: lemanhiep
// * @date: 13/07/2023
// **/
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "accounts")
//public class Account {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY);
//     private Integer id;
//     @Column(unique = true)
//     private String username;
//
//     private String fullname;
//     private String email;
//     private String phoneNumber;
//     private String password;
//     private ERoleName role;
//     private Boolean isActive;
//     private Boolean isDelete;
//     private Integer verificationCode;
//     private LocalDateTime timeValid;
//     private Double priority;
//     private LocalDateTime createDate;
//
//
//}
