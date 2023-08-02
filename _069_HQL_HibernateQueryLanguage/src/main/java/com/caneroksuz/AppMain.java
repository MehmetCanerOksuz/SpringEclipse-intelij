package com.caneroksuz;

import com.caneroksuz.model.Customer;
import com.caneroksuz.model.CustomerDetail;
import com.caneroksuz.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AppMain {

    public static void main(String[] args) throws InterruptedException {

        Customer customer = new Customer();
        customer.setTitle("MSc.Computer Engineer");
        customer.setFirstname("Burak");
        customer.setLastname("Delice");


        CustomerDetail customerDetail = new CustomerDetail();

        customerDetail.setAddress("Ankara");
        customerDetail.setPhone("666");
        customerDetail.setCreationDate(new Date());
        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);

        Customer customer2 = new Customer("Dr.","Caner","Oksuz");
        CustomerDetail customerDetail2 = new CustomerDetail("Çanakkale", "555", new Date());
        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{

            transaction = session.beginTransaction();
//                session.save(customer);
//                session.save(customer2);

            Query query = session.createQuery("from Customer ");
            List<Customer> customerList = query.list();

            for (Customer cust:customerList) {
                System.out.println(cust.getTitle()+" " + cust.getFirstname()+" "+cust.getLastname());
            }

            System.out.println("===============WHERE ID = 1==========================");

            Query query2 = session.createQuery("from Customer where id=:id");
            query2.setLong("id",4);
            Customer cust2 = (Customer) query2.uniqueResult();
            System.out.println(cust2.getTitle()+" "+cust2.getFirstname()+" "+ cust2.getLastname());


            System.out.println("================= update =======================");
            query = session.createQuery("update Customer set title=:title,firstname=:first_name,lastname=:last_name " +
                    "where id=:id");
            query.setParameter("title","Doc");
            query.setParameter("first_name","Aminenur");
            query.setParameter("last_name","Göynük");
            query.setLong("id",4);

            int result = query.executeUpdate();
            System.out.println(result);


            query = session.createQuery("from Customer ");
            customerList = query.list();

            for (Customer cust:customerList) {
                System.out.println(cust.getTitle()+" " + cust.getFirstname()+" "+cust.getLastname());
            }

            System.out.println("================== delete ====================");

//
//
//            query = session.createQuery("delete from CustomerDetail where id=:id");
//            query.setLong("id",1);
//
//            int deleteResult = query.executeUpdate();
//            System.out.println(deleteResult);
//
//            query = session.createQuery("delete from Customer where id=:id");
//            query.setLong("id",1);
//
//            deleteResult = query.executeUpdate();
//            System.out.println(deleteResult);

            System.out.println("=========== AVG SUM MIN MAX COUNT ==================");

            query= session.createQuery("select count(*) from Customer ");
            long customerCount = (long) query.uniqueResult();

            System.out.println(customerCount);

            System.out.println("================= JOIN =====================");

            query = session.createQuery("select c.title, c.firstname, c.lastname, d.address from Customer c " +
                    "INNER JOIN CustomerDetail d " +
                    "ON c.id = d.id");

            List<Object[]> myList = query.list();
            for (Object[] arr : myList) {
                System.out.println(Arrays.toString(arr));
            }


            transaction.commit();

        }catch (HibernateException e){
            transaction.rollback();
            System.out.println("Hata : " + e);
        }finally {
            session.close();
        }


    }
}
