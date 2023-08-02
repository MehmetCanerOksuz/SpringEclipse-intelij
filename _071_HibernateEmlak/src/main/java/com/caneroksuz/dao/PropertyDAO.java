package com.caneroksuz.dao;



import com.caneroksuz.model.Property;
import com.caneroksuz.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PropertyDAO {

    public void saveOrdUpdateProperty(Property property) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(property);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Property getPropertyById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Property.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Property> getAllProperties() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Property", Property.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deletePropertyById(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Property property = session.get(Property.class, id);
            if (property != null) {
                session.delete(id);
            }
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
