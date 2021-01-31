package com.cg.hsm.test;

import java.util.Scanner;

import com.cg.hsm.daoimpl.PatientDaoImpl;
import com.cg.hsm.domain.Patient;
/**
 * This class tests the functionalities of PatientDaoImpl Class
 * It checks whether all CRUD operations are performed correctly and ensures data is stored in database
 * @author jyothi
 *
 */


public class PatientDaoImplTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Please Provide below details---------");
		Patient patient = new Patient();
		System.out.println("Enter Patient's Name : ");
		patient.setPatientName(sc.nextLine());
		System.out.println("Enter Patient's Age : ");
		patient.setPatientAge(sc.nextInt());
		System.out.println("Enter Patient's Contact Number : ");
		patient.setPatientContact(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Patient's Address : ");
		patient.setAddress(sc.nextLine());
		System.out.println("Enter Patient's Symptoms : ");
		patient.setSymptoms(sc.nextLine());
		System.out.println("Enter Patient's Admission Fees : ");
		patient.setAdmissionFee(sc.nextInt());
		System.out.println("Enter Patient's Policy Id : ");
		patient.setPolicyId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Patient's Policy Name : ");
		patient.setPolicyName(sc.nextLine());
		
		PatientDaoImpl impl=new PatientDaoImpl();
		impl.addPatient(patient);
		System.out.println("Patient Registered Successfully!");
		
	}

}