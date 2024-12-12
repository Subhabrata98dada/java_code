package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.MarriageSeekerManagementInterface;

@Component
public class MarriageSeekerRunner implements CommandLineRunner {

	@Autowired
	private MarriageSeekerManagementInterface service;
//	@Override
//	public void run(String... args) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter marriage seeker name : ");
//		String name=sc.next();
//		System.out.println("Enter marriage seeker address :");
//		String address=sc.next();
//		System.out.println("Enter marriage seeker is indian or not :");
//		boolean indian= sc.nextBoolean();
//		
//		//byte array to create blob
//		String photopath="C:\\Users\\subha\\OneDrive\\Desktop\\hm.png";
//		File f1=new File(photopath);
//		FileInputStream fis=new FileInputStream(f1);
//		byte []photocontent=new byte[fis.available()];
//		photocontent =fis.readAllBytes();
//		
//		
//		//char[] array to clob
//		String resumepath="C:\\Users\\subha\\OneDrive\\Desktop\\java_basic.txt";
//		File f2=new File(resumepath);
//		FileReader reader=new FileReader(f2);
//		char[] resumecontent=new char[(int)f2.length()];
//		reader.read(resumecontent);
//		
//		//create entity class object
//		MarriageSeeker seeker=new MarriageSeeker(name, address, indian, photocontent, resumecontent);
//		
//		try {
//			String resultmessage=service.registerMarriageSeeker(seeker);
//			System.out.println(resultmessage);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		fis.close();
//		reader.close();
//		sc.close();
//		
//		
//		
//
//	}

	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marriage seeker id");
		int id=sc.nextInt();
		sc.close();
		Optional<MarriageSeeker> seeker=service.getMarriageSeeker(id);
		
		seeker.ifPresentOrElse(i->System.out.println(i), ()->System.out.println("marriage seerker not prsent"));
		
	}

}
