package com.cg.hsm.daoimpl;

import java.util.List;

import javax.persistence.Query;

import com.cg.hsm.dao.PatientDAO;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.domain.PatientHistory;
import com.cg.hsm.util.DBUtil;

public class PatientDAOImpl extends DBUtil implements PatientDAO {
	/**
	 * This addPatient method will add patient details in patients table in database
	 */
	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
		  
		
	}
	/**
	 * This updatePatient method will update patient details in patients table in database
	 */
	@Override
	public void updatePatient(Patient patient1, int patientId) {
		entityManager.getTransaction().begin();	
		
		Patient patient=entityManager.find(Patient.class, patientId);
		patient.setPatientName(patient1.getPatientName());
	    patient.setPatientAge(patient1.getPatientAge());
		patient.setPatientContact(patient1.getPatientContact());
		patient.setAddress(patient1.getAddress());
		patient.setAdmissionFee(patient1.getAdmissionFee());
		patient.setPatientCase(patient1.getPatientCase());
		patient.setPatientHistory(patient1.getPatientHistory());
		 entityManager.getTransaction().commit();
		 entityManager.close();
		  
	}
	
	/**
	 * This deletePatient method will delete patient details from patients table in database
	 */
	@Override
	public void deletePatient(int patientId) {
		
		entityManager.getTransaction().begin();
		Patient patient=entityManager.find(Patient.class, patientId);
		entityManager.remove(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
		  
	}
	/**
	 * This findAll method will list all patient details 
	 */
	@Override
	public List<Patient> getAllPatientDetails() {
		
		Query query =entityManager.createQuery("from Patient");	
		List<Patient> patients =  query.getResultList();
		for(Patient patient:patients) {
			System.out.println("Patient ID : " + patient.getPatientId());
			System.out.println("Patient Name : "+ patient.getPatientName());
			System.out.println("Patient Age : "+patient.getPatientAge());
			System.out.println("Contact Number : "+ patient.getPatientContact());
			System.out.println("Address : " +patient.getAddress());
			System.out.println("Symptoms : "+patient.getSymptoms());
			System.out.println("Admission Fee : "+ patient.getAdmissionFee());
			System.out.println("Patient Case : " + patient.getPatientCase());
			System.out.println("Patient History : "+patient.getPatientHistory());
		}
		return null;
	}
	public void updatePatientHistory( PatientHistory patientHistory, int patientId) {
		
		entityManager.getTransaction().begin();	
		Patient patient=entityManager.find(Patient.class, patientId);
		patientHistory.setDiseaseName(patientHistory.getDiseaseName());
		patientHistory.setBloodGroup(patientHistory.getBloodGroup());
		patientHistory.setTreatmentStatus(patientHistory.getTreatmentStatus());
		patientHistory.setDietAdvised(patientHistory.getDietAdvised());
		patientHistory.setHistoryReports(patientHistory.getHistoryReports());
		patient.setPatientHistory(patientHistory);
		 entityManager.getTransaction().commit();
		 entityManager.close();
		
	}
public void updatePatientCase( PatientCase patientcase, int patientId) {
		
		entityManager.getTransaction().begin();	
		Patient patient=entityManager.find(Patient.class, patientId);
		patientcase.setMedicines(patientcase.getMedicines());
		patientcase.setDiseaseDescription(patientcase.getDiseaseDescription());
		patientcase.setAssociatedDoctorName(patientcase.getAssociatedDoctorName());
		patientcase.setReports(patientcase.getReports());
		patientcase.setCurrentTreatment(patientcase.getCurrentTreatment());
		patientcase.setMedicineCost(patientcase.getMedicineCost());
		patient.setPatientCase(patientcase);
		 entityManager.getTransaction().commit();
		 entityManager.close();
	
}
}