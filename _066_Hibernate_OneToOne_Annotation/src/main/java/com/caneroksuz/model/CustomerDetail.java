package com.caneroksuz.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name = "CUSTOMER_DETAIL")
public class CustomerDetail {

    @OneToOne
    //@PrimaryKeyJoinColumn
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)

    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name ="property",value = "customer"))


    @Column(name = "ID", nullable = false)
    private int id;
    @Column(name = "ADDRESS", length = 50)
    private String address;
    @Column(name = "PHONE", length = 50, nullable = false)
    private String phone;
    @Column(name = "CREATION_DATE", length = 50)
    private Date creationDate;


    public CustomerDetail() {
    }

    public CustomerDetail(String address, String phone, Date creationDate) {
        this.address = address;
        this.phone = phone;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
