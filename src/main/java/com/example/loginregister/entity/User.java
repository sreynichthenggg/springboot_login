package com.example.loginregister.entity;


import ch.qos.logback.core.model.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userregister")
public class User extends Model {
    private  String name;
    @Id
    private  String userid;
    private String email;
    private String phone;
    private String password;
    private String cpassword;
    private String gender;



}
