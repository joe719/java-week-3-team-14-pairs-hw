package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;


public class Pet {


	
	
	//Instance Variables
	private String name;
	private String species;
	private List <String> vaccinations = new ArrayList<>();
	
	
	
	
	//Constructor
	public Pet(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	public Pet() {
		
		
	}

	//Method
	public String listVaccinations(List<String> vaccinations) {
		
		
		
		String listString = String.join(", ", vaccinations);
		
<<<<<<< HEAD
		return listString.substring(0, listString.length());
=======
		return listString;
>>>>>>> 05881b48ef1d4ac3948af6560f3a818ca3595da2
		
	}
	
	
    
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public List<String> getVaccinations() {
		return vaccinations;
	}
	public void setVaccinations(List<String> vaccinations) {
		this.vaccinations = vaccinations;
	}

	
    
}
