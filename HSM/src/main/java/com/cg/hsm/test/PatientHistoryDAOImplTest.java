package com.cg.hsm.test;


import java.util.Scanner;
import com.cg.hsm.daoimpl.PatientHistoryDAOImpl;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientHistory;

public class PatientHistoryDAOImplTest {
	private static void registerPatientHistory() {
		Patient patient=new Patient();
		Scanner sc = new Scanner(System.in);
		PatientHistory patienthistory = new PatientHistory();
		
		System.out.println("------Patient's History-------");
		System.out.println("enter the id of the patienthistory");
		patienthistory.setPatientHistoryId(sc.nextInt());
		System.out.println("Enter Patient's Blood Group :  ");
		patienthistory.setBloodGroup(sc.next());
		System.out.println("Enter Patient's Previous Disease Description : ");
		patienthistory.setDiseaseName(sc.next());
		System.out.println("Enter Treatment Status : ");
		patienthistory.setTreatmentStatus(sc.next());
		System.out.println("Enter Diet Advised : ");
		patienthistory.setDietAdvised(sc.next());
		System.out.println("Enter Report Details : ");
		patienthistory.setHistoryReports(sc.next());
		patient.getPatientHistory().add(patienthistory);
		
		PatientHistoryDAOImpl impl=new PatientHistoryDAOImpl();
		impl.addPatientHistory(patienthistory);
		System.out.println("Patient History added Successfully!");
		sc.close();
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Test AddPatientHistory method");
		System.out.println("2. Test FindAll method");
		System.out.println("Choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
			registerPatientHistory();
			break;
		case 2:
			
			PatientHistoryDAOImpl impl = new PatientHistoryDAOImpl();
			impl.listAllPatientHistories();
			
			
			break;
		
		}
		sc.close();
		

	}
}
