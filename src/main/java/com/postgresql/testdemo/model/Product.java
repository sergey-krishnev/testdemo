package com.postgresql.testdemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="product")
public class Product {

    @Id
    private long id;
    private String name;

}
