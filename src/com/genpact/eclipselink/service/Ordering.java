package com.genpact.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.genpact.eclipselink.entity.Employee;

public class Ordering {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_EclipseLink" );
	    EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	    Query query = entitymanager.createQuery( "Select e " + "from Employee e " + "ORDER BY e.ename ASC" );

	    List<Employee> list = (List<Employee>)query.getResultList( );

	    for( Employee e:list ) {
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));
	      }
	}

}
