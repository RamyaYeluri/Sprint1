package com.cg.hsm.test;

import java.util.Scanner;

import com.cg.hsm.daoimpl.DoctorDaoImpl;
import com.cg.hsm.domain.Doctor;
/**
 * This class tests the functionalities of DoctorDaoImpl Class
 * It checks whether all CRUD operations are performed correctly and ensures data is stoed in database
 * @author Pranjali Chaudhari
 *
 */

public class DoctorDaoImplTest {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Please Provide below details---------");
		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor's Name : ");
		doctor.setDoctorName(sc.nextLine());
		System.out.println("Enter Doctor's Contact Number : ");
		doctor.setContactNumber(sc.nextLong());
		System.out.println("Enter Number Of Hours Doctor is Available : ");
		doctor.setHoursOfAvailability(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Specializaion : ");
		doctor.setSpecialization(sc.nextLine());
		System.out.println("Enter Doctor's Degree Name : ");
		doctor.setDegree(sc.nextLine());
		System.out.println("Enter Doctor's Total Number of Experience : ");
		doctor.setYearsOfExperience(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Fees: ");
		doctor.setDoctorFee(sc.nextInt());
		
		DoctorDaoImpl impl=new DoctorDaoImpl();
		impl.addDoctor(doctor);
		System.out.println("Doctor Registered Successfully!");
		
	}

}
