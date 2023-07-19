package com.caneroksuz;

import com.caneroksuz.model.Address;
import com.caneroksuz.model.Customer;
import com.caneroksuz.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstname("Burak");
        customer.setLastname("Delice");

            Address address = new Address();
            address.setCity("Ankara");
            address.setTown("Aşağı Ayrancı");
            address.setStreet("Yukarı Ayrancı");

        customer.setAddress(address);
        customer.setCreationDate(new Date());

        customer.getAdresListesi().add(address);
        //----------------------------------------

        Address address2 = new Address("Adana","Tarsus","Seyhan");

        Customer customer2 = new Customer("Engin","Ertikmen",address2 ,new Date());
        customer2.getAdresListesi().add(address2);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{

            transaction = session.beginTransaction();
                session.save(customer);
                session.save(customer2);
            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();
            System.out.println("Hata : " + e);
        }finally {
            session.close();
        }
    }
}
