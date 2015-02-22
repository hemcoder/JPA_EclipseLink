package com.genpact.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.genpact.eclipselink.entity.Employee;

public class CreateEmployee {

	public static void main( String[ ] args ) {
		   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_EclipseLink" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	      employee.setEid( 1206 );
	      employee.setEname( "Raman" );
	      employee.setSalary( 85000 );
	      employee.setDeg( "HR Manager" );
	      
	      entitymanager.persist( employee );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
	   }
}
