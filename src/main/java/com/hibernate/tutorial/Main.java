package com.hibernate.tutorial;

import com.hibernate.objects.Member;
import com.hibernate.persistence.HibernatePersistence;
import org.hibernate.Session;

public class Main {

    public static void main( String[] args ) {
        Session session = HibernatePersistence.getSessionFactory().openSession();

        session.beginTransaction();
        Member member = new Member();

        //Make a user for storing in database
        member.setFirstName("Chelsea");
        member.setLastName("Stobbart");
        member.setEmail("Test@test.com");

        //Save product to database
        Integer id = (Integer) session.save(member);
        session.getTransaction().commit();

        //get data from  database
        member = (Member) session.get(Member.class, id);
        System.out.println(member);

        //close session
        HibernatePersistence.shutdown();
    }
}