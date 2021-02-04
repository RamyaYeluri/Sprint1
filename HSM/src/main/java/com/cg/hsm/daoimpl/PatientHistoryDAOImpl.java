package com.cg.hsm.daoimpl;

import java.util.List;


import javax.persistence.Query;

import com.cg.hsm.dao.PatientHistoryDAO;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.domain.PatientHistory;
import com.cg.hsm.util.DBUtil;
/**
* This PatientHistoryDAOImpl implements CRUD operations of PatientDAO class
* @author Y.K.Sai Ramya
*
*/

public class PatientHistoryDAOImpl extends DBUtil implements PatientHistoryDAO {

	@Override
	/**
	 * This addPatientHistory method will add history details of patient to database
	 * @param patientHistory
	 */
	public void addPatientHistory(PatientHistory patientHistory) {
		entityManager.getTransaction().begin();
		Patient patient = entityManager.find(Patient.class, patientHistory.getPatientId());
		patient.getPatientHistory().add(patientHistory);
		entityManager.merge(patient);
		entityManager.getTransaction().commit();
		
		
	}
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * This method will return list of patient history details based on patient id
	 * @param patientId
	 */
	public void viewPatientHistory(int patientId) {
		System.out.println("Patient ID is: " + patientId);
		Query query=entityManager.createQuery("from PatientHistory where patientid=patientId");
		List<PatientHistory> patienthistory = query.getResultList();
		for(PatientHistory patientshistory:patienthistory) {
			System.out.println("PatientHistory ID : " + patientshistory.getPatientHistoryId());
				System.out.println("Patient ID : " + patientshistory.getPatientId());
				System.out.println("Name of the disease: " + patientshistory.getDiseaseName());
				System.out.println("Blood group : " + patientshistory.getBloodGroup());
				System.out.println("Diet adviced : " + patientshistory.getDietAdvised());
				System.out.println("Treatment status: " +patientshistory .getTreatmentStatus());
				System.out.println("Reports : " + patientshistory.getHistoryReports());
		}		
	}

	@SuppressWarnings("unchecked")
	@Override
	/**
	 * This will return the list of all the patient's history details from database
	 * @return Patient's History
	 */
	
	public List<PatientHistory> listAllPatientHistories() {
		
		Query query =entityManager.createQuery("from PatientHistory");	
		List<PatientHistory> patientsHistory =  query.getResultList();
		for(PatientHistory patienthistory:patientsHistory)
		{
			System.out.println("PatientHistory ID : " + patienthistory.getPatientHistoryId());
			System.out.println("Patient ID : " + patienthistory.getPatientId());
			System.out.println("Name of the disease: " + patienthistory.getDiseaseName());
			System.out.println("Blood group : " + patienthistory.getBloodGroup());
			System.out.println("Diet adviced : " + patienthistory.getDietAdvised());
			System.out.println("Treatment status: " +patienthistory .getTreatmentStatus());
			System.out.println("Reports : " + patienthistory.getHistoryReports());
			
			System.out.println("-----------------------------");
		}
		return null;
	}
		
	}


