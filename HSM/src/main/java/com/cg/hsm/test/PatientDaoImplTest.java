package com.cg.hsm.test;

import java.text.DecimalFormat;

import java.util.Scanner;

import com.cg.hsm.daoimpl.PatientDAOImpl;
import com.cg.hsm.daoimpl.PatientHistoryDAOImpl;
import com.cg.hsm.domain.InsurancePolicy;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.domain.PatientHistory;
import com.cg.hsm.exception.AssociatedDoctorNullException;
import com.cg.hsm.exception.FeeNotFoundException;
import com.cg.hsm.exception.IdNotFoundException;
import com.cg.hsm.exception.InsufficientContactException;
import com.cg.hsm.exception.InsufficientDiseaseDescriptionException;
import com.cg.hsm.exception.NameNotFoundException;

/**
 * This class tests the functionalities of PatientDAOImpl Class It checks
 * whether all CRUD operations are performed correctly and ensures data is
 * stored in database
 * 
 * @author Jyothi & Diparna
 *
 */

public class PatientDAOImplTest {
	static Scanner sc = new Scanner(System.in);

	private static void registerPatient() throws InsufficientContactException {

		Patient patient = new Patient();
		InsurancePolicy policy = new InsurancePolicy();

		System.out.println("-------Please Provide below details---------");
		System.out.println("Enter Patient's Name : ");
		String patientName=sc.nextLine();
		try {
			if(patientName.isBlank())
				throw new NameNotFoundException("No name provided for patient");
			else
				patient.setPatientName(patientName);
		}
		catch(NameNotFoundException exp) {
			exp.printStackTrace();
		}
		sc.nextLine();
		System.out.println("Enter Patient's Age : ");
		patient.setPatientAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Patient's Contact Number : ");

		long patientContact = sc.nextLong();

		int temp = String.valueOf(patientContact).length();
		try {
		if (temp > 10 || temp < 10)
			throw new InsufficientContactException("Your phone contact number must be equal to 10");
		else
			patient.setPatientContact(patientContact);
		}catch(InsufficientContactException exp) {
			exp.printStackTrace();
		}
		sc.nextLine();
		System.out.println("Enter Patient's Address : ");
		patient.setAddress(sc.nextLine());
		System.out.println("Enter Patient's Symptoms : ");
		patient.setSymptoms(sc.nextLine());
		System.out.println("Enter Patient's Admission Fees : ");
		float admissionFee=sc.nextFloat();
		try {
			if(admissionFee==0) {
				throw new FeeNotFoundException("admission fee is not provided");
			}
			else
				patient.setAdmissionFee(admissionFee);
		}
		catch(FeeNotFoundException exh) {
			exh.printStackTrace();
		}
		
		sc.nextLine();
		System.out.println("Do you want a new Policy ?");
		String choice = sc.next();
		sc.nextLine();
		if (choice.equalsIgnoreCase("Yes")) {

			String num = new DecimalFormat("##").format(Math.random() * 1000000);
			policy.setPolicyId(patient.getPatientName().substring(0, 2) + num);
			policy.setPolicyName("Individual Star Health Policy");
			
		} else {
			policy.setPolicyId(sc.nextLine());
			policy.setPolicyName(sc.nextLine());
		}
		patient.setInsurancePolicy(policy);

		PatientCase patientcase = new PatientCase();
		System.out.println("------Patient's Case-------");
		System.out.println("Enter Patient's Disease Description : ");
		String diseaseDescription = sc.nextLine();
		try {
			if (diseaseDescription.isEmpty()) {
				throw new InsufficientDiseaseDescriptionException("disease description is not provided");

			}
		} catch (InsufficientDiseaseDescriptionException exe) {
			exe.printStackTrace();

		}
		patientcase.setDiseaseDescription(diseaseDescription);
		System.out.println("Enter Patient's Medicine Description : ");
		patientcase.setMedicines(sc.nextLine());
		System.out.println("Enter Patient's Medicine Fee : ");
		float medicineFee=sc.nextFloat();
		try {
			if(medicineFee==0) {
				throw new FeeNotFoundException("medicine fee is not entered");
			}
			else
				patientcase.setMedicineFee(medicineFee);
		}
		catch(FeeNotFoundException exception) {
			exception.printStackTrace();
		}
		sc.nextLine();
		System.out.println("Enter Doctor Associated : ");
		String associatedDoctor = sc.nextLine();
		try {
			if (associatedDoctor.isEmpty()) {
				throw new AssociatedDoctorNullException("Associated Doctor is not given");
			}
		} catch (AssociatedDoctorNullException exp) {
			exp.printStackTrace();
		}
		patientcase.setAssociatedDoctorName(associatedDoctor);
		System.out.println("Enter Patient's Current Treatment Description : ");
		patientcase.setAssociatedDoctorName(associatedDoctor);
		System.out.println("Enter Patient's Reports Taken : ");
		patientcase.setReports(sc.nextLine());
		patient.setPatientCase(patientcase);

		PatientDAOImpl impl = new PatientDAOImpl();
		impl.addPatient(patient);
		System.out.println("Patient Registered Successfully!");
		sc.close();

	}

	public static void updatePatientPersonalInfo() {

		System.out.println("------------Enter the data to be updated------------------");
		Patient patient1 = new Patient();
		System.out.println("Enter the id of the patient");
		int patientId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Patient's Name : ");
		String patientName=sc.nextLine();
		try {
			if(patientName.isBlank())
				throw new NameNotFoundException("No name provided for patient");
			else
				patient1.setPatientName(patientName);
		}
		catch(NameNotFoundException exp) {
			exp.printStackTrace();
		}
		System.out.println("Enter Patient's Age : ");
		patient1.setPatientAge(sc.nextInt());
		System.out.println("Enter Patient's Contact Number : ");

		long patientContact = sc.nextLong();

		int temp = String.valueOf(patientContact).length();
		try {
		if (temp > 10 || temp < 10)
			throw new InsufficientContactException("Your phone contact number must be equal to 10");
		else
			patient1.setPatientContact(patientContact);
		}catch(InsufficientContactException exp) {
			exp.printStackTrace();
		}
		sc.nextLine();
		System.out.println("Enter Patient's Address : ");
		patient1.setAddress(sc.nextLine());
		System.out.println("Enter Patient's Symptoms: ");
		patient1.setSymptoms(sc.nextLine());
		System.out.println("Enter Patient's Admission Fees : ");
		float admissionFee=sc.nextFloat();
		try {
			if(admissionFee==0) {
				throw new FeeNotFoundException("admission fee is not provided");
			}
			else
				patient1.setAdmissionFee(admissionFee);
		}
		catch(FeeNotFoundException exh) {
			exh.printStackTrace();
		}
		
		sc.nextLine();
		PatientDAOImpl impl = new PatientDAOImpl();
		impl.updatePatient(patient1, patientId);
		System.out.println("Patient Updated Successfully!");

	}

	private static void removePatient() {

		System.out.println("-------Deleting details-------- ");
		System.out.println("Enter Patient id : ");
		int patientId = sc.nextInt();
		sc.nextLine();
		PatientDAOImpl impl = new PatientDAOImpl();
		impl.deletePatient(patientId);
		System.out.println("-------Patient Details Deleted-------- ");

	}
	@SuppressWarnings("resource")
	public static void registerPatientHistory() {
		Patient patient=new Patient();
		Scanner sc = new Scanner(System.in);
		PatientHistory patienthistory = new PatientHistory();
		
		System.out.println("------Patient's History-------");
		System.out.println("enter the id of the patient");
		int patientId=(sc.nextInt());
		try {
			if(patientId==0) {
				throw new IdNotFoundException("Id is not provided");
			}
			else {
				patienthistory.setPatientId(patientId);
		}
			}
		catch(IdNotFoundException exh) {
			exh.printStackTrace();
		}
		
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
		
	

	public static void updateInsurancePolicy() {
		System.out.println("----------Policy Information------------");
		System.out.println("Enter the new Policy Name ");

		InsurancePolicy insurancePolicy = new InsurancePolicy();
		insurancePolicy.setPolicyName(sc.next());
	}

	public static void main(String[] args) throws InsufficientContactException {

		System.out.println("------MENU------");
		System.out.println("1. Register patient");
		System.out.println("2. Get all Patient Details ");
		System.out.println("3. UpdatePatient");
		System.out.println("4. Patient History");
		System.out.println("5. Remove Patient");
		System.out.println("6. Update Insurance Policy Name");
		System.out.println("7. get all patient history details");
		System.out.println("8.view patient history based on id");
		System.out.println("Enter any of the choice below");
		int choice = sc.nextInt();
		sc.nextLine();

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
			registerPatientHistory();
			break;
		case 5:
			removePatient();
			break;
		case 6:
			updateInsurancePolicy();
			break;
		case 7:
			PatientHistoryDAOImpl impls = new PatientHistoryDAOImpl();
			impls.listAllPatientHistories();
			break;
		case 8:
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter patient id");
			
			int patientId=sc.nextInt();
			PatientHistoryDAOImpl impl1 = new PatientHistoryDAOImpl();
			impl1.viewPatientHistory( patientId);
			break;
		
		default:
			break;
			
		}

		sc.close();
	}

}