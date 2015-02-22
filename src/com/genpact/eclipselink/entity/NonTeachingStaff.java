package com.genpact.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue( value="NTS" )
@PrimaryKeyJoinColumn(referencedColumnName="sid")
public class NonTeachingStaff extends Staff{
	 private String areaexpertise;

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaff(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NonTeachingStaff(int sid, String sname) {
		super(sid, sname);
		// TODO Auto-generated constructor stub
	}
	 
}
