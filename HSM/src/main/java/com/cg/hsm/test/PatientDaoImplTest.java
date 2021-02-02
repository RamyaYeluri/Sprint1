package com.cg.hsm.test;

import java.util.Scanner;

import com.cg.hsm.daoimpl.PatientDAOImpl;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.domain.PatientHistory;

/**
 * This class tests the functionalities of PatientDaoImpl Class It checks
 * whether all CRUD operations are performed correctly and ensures data is
 * stored in database
 * 
 * @author jyothi
 *
 */

public class PatientDAOImplTest {

	private static void registerPatient() {
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

		PatientCase patientcase = new PatientCase();
		System.out.println("------Patient's Case-------");

		System.out.println("Enter Patient's Disease Description : ");
		patientcase.setDiseaseDescription(sc.next());
		System.out.println("Enter Patient's Medicine Description : ");
		patientcase.setMedicines(sc.next());
		System.out.println("Enter Patient's Medicine Cost : ");
		patientcase.setMedicineCost(sc.nextLong());
		
		System.out.println("Enter Doctor Associated : ");
		patientcase.setAssociatedDoctorName(sc.next());
		System.out.println("Enter Patient's Current Treatment Description : ");
		patientcase.setCurrentTreatment(sc.next());
		patient.setPatientCase(patientcase);
		PatientDAOImpl impl = new PatientDAOImpl();
		impl.addPatient(patient);
		System.out.println("Patient Registered Successfully!");
		sc.close();

			
	}

	public static void updatePatientPersonalInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------Enter the data to be updated------------------");
		Patient patient1 = new Patient();
		System.out.println("enter the id of the patient");
		int patientId = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name ");
		patient1.setPatientName(sc.next());
		System.out.println("Enter Patient's Age : ");
		patient1.setPatientAge(sc.nextInt());
		System.out.println("Enter Patient's Contact Number : ");
		patient1.setPatientContact(sc.nextLong());
		System.out.println("Enter Patient's Address : ");
		patient1.setAddress(sc.next());
		System.out.println("Enter Patient's Symptoms: ");
		patient1.setSymptoms(sc.next());
		System.out.println("Enter Patients's Admission Fees: ");
		patient1.setAdmissionFee(sc.nextInt());

		PatientDAOImpl impl = new PatientDAOImpl();
		impl.updatePatient(patient1, patientId);
		System.out.println("Patient updated Successfully!");
		sc.close();

	}

	private static void removePatient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Deleting details-------- ");
		//Patient patient = new Patient();
		System.out.println("Enter Patient id : ");
		int patientId = sc.nextInt();
		PatientDAOImpl impl = new PatientDAOImpl();

		impl.deletePatient(patientId);
		System.out.println("-------Deleted patient Details-------- ");
		sc.close();

	}

	public static void updatePatientHistory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------patient's history------------");
		System.out.println("enter the id of the patient");
		int patientId = sc.nextInt();
  
		  sc.nextLine();
		PatientHistory patientHistory = new PatientHistory();
		System.out.println("Enter Patient disease");
		patientHistory.setDiseaseName(sc.next());
		sc.nextLine();
		System.out.println("Enter the BloodGroup");
		patientHistory.setBloodGroup(sc.next());
		sc.nextLine();
		System.out.println("Enter Diet advised to the patient");
		patientHistory.setDietAdvised(sc.next());
		sc.nextLine();
		System.out.println("enter the treatment status of the patient");
		patientHistory.setTreatmentStatus(sc.next());
		sc.nextLine();

		System.out.println("Enter the reports name");
		patientHistory.setHistoryReports(sc.next());
		//sc.nextLine();
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------MENU------");
		System.out.println("1. Register patient");
		System.out.println("2. get all patient details ");
		System.out.println("3. UpdatePatient");
		System.out.println("4. Patient History");
		System.out.println("5. Remove Patient");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			registerPatient();
			break;
		case 2:
			PatientDAOImpl impl = new PatientDAOImpl();
			impl.getAllPatientDetails();
			System.out.println("-------------------");
			break;

		case 3:
			updatePatientPersonalInfo();
			break;

		case 4:
			updatePatientHistory();
			break;
		case 5:
			removePatient();
			break;
		default:
			break;
		}
		sc.close();
	}
	
}
