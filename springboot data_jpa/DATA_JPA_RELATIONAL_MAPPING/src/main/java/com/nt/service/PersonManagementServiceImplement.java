package com.nt.service;

import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.PersonRepository;
import com.nt.repository.PhoneNumberRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonManagementServiceImplement implements PersonManageMentService{
	
	@Autowired
	private PersonRepository personrepo;
	@Autowired
	private PhoneNumberRepository phonerepo;
	

	@Override
	@Transactional
	public void saveDataUsingParent() {
		Person pr=new Person("raja", "hydrabad");
		PhoneNumber p1=new PhoneNumber(9348338693l, "gsm", "vi");
		PhoneNumber p2=new PhoneNumber(7653828858l,"cdmi","airtel");
		pr.setPhones(Set.of(p1,p2));
		p1.setPerson(pr);
		p2.setPerson(pr);
		personrepo.save(pr);
		System.out.println("person with phone saved");
		
	}


	@Override
	public void saveDataUsingChild() {
		Person pr=new Person("manik", "bengaluru");
		PhoneNumber p1=new PhoneNumber(9933735581l, "gsm", "vi");
		PhoneNumber p2=new PhoneNumber(8895918464l,"cdmi","airtel");
		pr.setPhones(Set.of(p1,p2));
		p1.setPerson(pr);
		p2.setPerson(pr);
		phonerepo.save(p1);
		phonerepo.save(p2);
		System.out.println("person with phone saved");
		
	}


	@Override
	public void loadDataUsingParent() {
		Iterable<Person> persons= personrepo.findAll();
		persons.forEach(i->{
			System.out.println(i);
			Set<PhoneNumber> phones= i.getPhones();
			Consumer<PhoneNumber> c= p->System.out.println(p);
			phones.forEach(c);
		});
		
	}


	@Override
	public void loadDataUsingChild() {
		Iterable<PhoneNumber> phones= phonerepo.findAll();
		phones.forEach(i->{
			System.out.println(i);
			Person p=i.getPerson();
			System.out.println(p);
			System.out.println("-----------------------");
		});
		
	}


	@Override
	@Transactional
	public void addChildToExistParent(Integer id) {
		Optional<Person> opt=personrepo.findById(id);
		if(opt.isPresent()) {
			Person person=opt.get();
			System.out.println(person);
			Set<PhoneNumber> phones= person.getPhones();
			PhoneNumber phone=new PhoneNumber(1234567890l, "satelite", "bsnl");
			phones.add(phone);
			phone.setPerson(person);
			phonerepo.save(phone);
			System.out.println("New child added");
			
		}
		else {
			System.out.println("Given id not present");
		}
		
	}


	@Override
	@Transactional
	public String deleteByParent(Integer id) {
		Optional<Person> opt= personrepo.findById(id);
		if(opt.isPresent())
		{
			Person person= opt.get();
			personrepo.delete(person);
			return "person deleted with phones";
		}
		else
		{
			return "person not found";
		}
	}


	@Override
	public void deleteAllChildOfparent(Integer id) {
		Optional<Person> opt=personrepo.findById(id);
		if(opt.isPresent())
		{
			Set<PhoneNumber> phones= opt.get().getPhones();
			phones.forEach(p->p.setPerson(null));
			phonerepo.deleteAll(phones);
			System.out.println("all phones deleted");
		}
		else {
			System.out.println("parent not found");
		}
		
	}

}
