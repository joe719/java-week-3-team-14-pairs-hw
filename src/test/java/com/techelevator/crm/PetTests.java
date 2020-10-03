package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

	
	
	@Test
	public void pet_vaccinations_list_test() {
		
		List<String> test = new ArrayList<String>("Corona", "Flu", "Diarrhea");
		
		
		List<String> input = List<String> ;
		
		Pet objectToTest = new Pet(input);
		
		String output = objectToTest.listVaccinations();
		
		Assert.assertEquals(, output);
		
	}
	
	
	
}
