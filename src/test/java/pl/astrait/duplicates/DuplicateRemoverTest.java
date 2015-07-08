package pl.astrait.duplicates;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DuplicateRemoverTest {
	
	List<Person> persons;
	
	@Before
	public void setup(){
		persons = new LinkedList<>();
		Person person1 = new Person();
		person1.name = "a";
		person1.age = 1;
		persons.add(person1);
		
		Person person2 = new Person();
		person2.name = "b";
		person2.age = 2;
		persons.add(person2);
		
		Person person3 = new Person();
		person3.name = "a";
		person3.age = 1;
		persons.add(person3);
		
		Person person4 = new Person();
		person4.name = "a";
		person4.age = 1;
		persons.add(person4);
		
		Person person5 = new Person();
		person5.name = "b";
		person5.age = 2;
		persons.add(person5);
		
		Person person6 = new Person();
		person6.name = "a";
		person6.age = 1;
		persons.add(person6);
		
		Person person7 = new Person();
		person7.name = "b";
		person7.age = 2;
		persons.add(person7);
		
		Person person8 = new Person();
		person8.name = "a";
		person8.age = 1;
		persons.add(person8);
		
		Person person9 = new Person();
		person9.name = "b";
		person9.age = 2;
		persons.add(person9);
		
		Person person10 = new Person();
		person10.name = "b";
		person10.age = 2;
		persons.add(person10);	
	}
	
	@Test
	public void testRemoveDuplicate(){
		
		assertEquals(10, persons.size());
		DuplicateRemover.removeDuplicate(persons);
		assertEquals(2, persons.size());
	}
	
}
