package pl.astrait.duplicates;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DuplicateRemover {
	
	
	public static List<Person> removeDuplicate(List<Person> persons){
		Comparator<Person> byAge = (person1, person2) -> Integer.compare(person1.age, person2.age);
		Comparator<Person> byName = (person1, person2) -> person1.name.compareTo(person2.name);
		Comparator<Person> personComparator = byAge.thenComparing(byName);
		
		Collections.sort(persons, personComparator);
		
		Iterator<Person> iterator = persons.listIterator();
		Person lastPerson = (iterator.hasNext()) ? iterator.next() : null;
		if(lastPerson != null){
			while(iterator.hasNext()) {
				Person currentPerson = (Person) iterator.next();
				if(lastPerson.age == currentPerson.age && lastPerson.name.equals(currentPerson.name)){
					iterator.remove();
				}else{
					lastPerson = currentPerson;
				}
			}
		}
		return persons;
	}
	
}
