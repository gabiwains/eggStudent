
package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ej1PU");
    EntityManager em = emf.createEntityManager();
    
    
}
