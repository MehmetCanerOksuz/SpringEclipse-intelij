package com.caneroksuz;

import com.caneroksuz.model.Customer;
import com.caneroksuz.model.Orders;
import com.caneroksuz.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setTitle("Dr");
        customer.setFirstName("Caner");
        customer.setLastName("Öksüz");


        Orders order1 = new Orders("Kayısı",254.23312F,new Date());
        Orders order2 = new Orders("Elma",173.23F,new Date());
        Orders order3 = new Orders("Armut",395.2F,new Date());

        customer.getOrder().add(order1);
        customer.getOrder().add(order2);
        customer.getOrder().add(order3);



        order1.setCustomer(customer);
        order2.setCustomer(customer);
        order3.setCustomer(customer);




        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{

            transaction = session.beginTransaction();
            session.save(customer);
            session.save(order1);
            session.save(order2);
            session.save(order3);



            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();
            System.out.println("Hata : " + e);
        }finally {
            session.close();
        }



    }
}
