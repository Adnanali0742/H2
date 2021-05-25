package fr.adnan.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "MOVIES")
public class Movies {
	
//	@Column(name = "TITLE")
	private String name;

	@Id
//	@Column(name="ID")
	private int id;
	
//	@Column(name="REL_DATE")
	private String date;

	public Movies() {
		super();
	}

	public Movies(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", id=" + id + ", date=" + date + "]\n";
		
	}
	
	
	
	
}