package com.example.Child2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user2")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Child2Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int age;
    String dept;
    String address;

}
