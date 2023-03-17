package com.xcale.demo2.sampledemo.model;

import com.xcale.demo2.sampledemo.utils.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    @Column(columnDefinition = "varchar(255) default 'OTHER'")

    private ItemType itemType;

}
