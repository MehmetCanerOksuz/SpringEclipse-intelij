package com.caneroksuz.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PROPERTIES")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PROPERTY_NAME", length = 80)
    private String propertyName;
    @Column(name = "TITLE", length = 80)
    private String title;
    @Column(name = "DESCRIPTION", length = 40)
    private String description;
    @Column(name = "TYPE", length = 80)
    private String type;
    private BigDecimal price;
    private int bedrooms;
    private int bathrooms;
    private float area;
    private String location;

    @ManyToOne
    @JoinColumn(name = "agent_ıd")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "seller_ıd")
    private Seller seller;

    @ManyToMany
    @JoinTable(name = "property_buyer",
            joinColumns = @JoinColumn (name = "property_id"),
            inverseJoinColumns =  @JoinColumn (name = "buyer_id")
    )
    private Set<Buyer> buyers = new HashSet<>();
}
