package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

	private Pet objectToTest = new Pet();
	
	@Test
	public void pet_vaccinations_list_test() {
		
		Pet objectToTest = new Pet();
		
		List<String> test = new ArrayList<>();
		test.add("Corona");
		test.add("Flu");
		test.add("Diarrhea");
		
				

		objectToTest.setVaccinations(test);
		//Pet objectToTest = new Pet();
		
		String output = objectToTest.listVaccinations(test);
		
		Assert.assertEquals("Corona, Flu, Diarrhea", output);
		
	}
	
	
	
}
