package com.caneroksuz.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID",nullable = false)
    private int id;

    @Basic // bu kolon tabloda mutlaka olacak
    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstname;

    @Transient //Bu alanı (kolon) u gormezden gel..
    @Column(name = "LAST_NAME", length = 50)
    private String lastname;
/*
    @Lob //Large Obje.. çook uzun olanlar için..
    @Column(name = "ADDRESS", length = 50)
    private String address;

 */
    @Embedded
    private Address address;

    @ElementCollection
    private Set<Address> adresListesi = new HashSet<>();

    @Temporal(TemporalType.DATE)  // Sadece Tarih formatını istedik..
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    public Customer() {
    }

    public Customer(int id, String firstname, String lastname, Address address, Date creationDate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.creationDate = creationDate;
    }

    public Customer(String firstname, String lastname, Address address, Date creationDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.creationDate = creationDate;
    }


    public Customer(String firstname, String lastname, Address address, Set<Address> adresListesi, Date creationDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.adresListesi = adresListesi;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Address> getAdresListesi() {
        return adresListesi;
    }

    public void setAdresListesi(Set<Address> adresListesi) {
        this.adresListesi = adresListesi;
    }
}
