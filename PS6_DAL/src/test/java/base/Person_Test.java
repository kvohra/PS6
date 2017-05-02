package base;

import static org.junit.Assert.*;


import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {
	
private static PersonDomainModel person1 = new PersonDomainModel();
private static PersonDomainModel person2 = new PersonDomainModel();
private static  LocalDate perbirth = LocalDate.of(2000, 10, 10);	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		person1 = new PersonDomainModel();
		person1.setFirstName("Zhu");
		person1.setLastName("Yi");
		person1.setBirthday(perbirth);
		person1.setCity("Newark");
		person1.setPostalCode(19711);
		person1.setStreet("110 main street");
		
		person2 = new PersonDomainModel();
		person2.setFirstName("Zhuu");
		person2.setLastName("Yii");
		person2.setBirthday(perbirth);
		person2.setCity("Delaware");
		person2.setPostalCode(19712);
		person2.setStreet("220 main street");
	
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		person1=null;
		person2=null;
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void addtest() throws Exception {
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
	}

	@Test
	public void gettest() throws Exception{
		String LastName1 = person1.getLastName();
		String LastName2 = person2.getLastName();
		assertEquals("Zhu",LastName1);
		assertEquals("Zhuu",LastName2);
	}
	
	@Test
	public void updatetest() throws Exception{
		
		person1.setFirstName("Zhu");
		person2.setFirstName("Zhuu");
		PersonDAL.updatePerson(person1);
		PersonDAL.updatePerson(person2);
	}
	
	@Test
	public void DeletePersonTest() throws Exception{
		PersonDAL.addPerson(person1);
}
}