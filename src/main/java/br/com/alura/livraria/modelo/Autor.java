package br.com.alura.livraria.modelo;

import java.time.LocalDate;

public class Autor {
	
	 private String name;
	  private String email;
	  private LocalDate date;
	  
	  public Autor() {
		  
	  }

	  public Autor(String name, String email, LocalDate date) {

	    this.name = name;
	    this.email = email;
	    this.date = date;
	  }

	  public String getName() {

	    return this.name;
	  }

	  public String getEmail() {

	    return email;
	  }

	  public LocalDate getDate() {

	    return date;
	  }

	  public void setName(String name) {

	    this.name = name;
	  }

	  public void setEmail(String email) {

	    this.email = email;
	  }

	  public void setDate(LocalDate date) {

	    this.date = date;
	  }

}
