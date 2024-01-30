package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.demo.model.Cart;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.Persistence;
// import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("cart_details");
		// EntityManager em = emf.createEntityManager();
		// Date date  = new Date();

		// em.getTransaction().begin();

		// Cart cartObj = new Cart();
		// cartObj.setDate(date);
		// cartObj.setQuantity(2);
		// cartObj.setEstimatedPrice(null);

		// em.persist(cartObj);
		

		// em.getTransaction().commit();

		// emf.close();
		// em.close();
	}

}
