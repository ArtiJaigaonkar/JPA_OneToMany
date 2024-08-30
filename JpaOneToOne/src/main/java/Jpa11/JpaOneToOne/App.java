package Jpa11.JpaOneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
         EntityManager em=emf.createEntityManager();
         
         em.getTransaction().begin();
         
         order1 or=new order1(101,"Idli Samber",30,"Fast Food");
         
         Customer cus=new Customer(111,"Arti Jaigaonkar",or);
         em.persist(or);
         em.persist(cus);
         em.getTransaction().commit();
         
         System.out.println("Data inserted:....");
    }
}
