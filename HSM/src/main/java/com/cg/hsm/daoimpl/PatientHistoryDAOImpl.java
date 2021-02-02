package com.cg.hsm.daoimpl;

import java.util.List;

import javax.persistence.Query;

import com.cg.hsm.dao.PatientHistoryDAO;

import com.cg.hsm.domain.PatientHistory;
import com.cg.hsm.util.DBUtil;

public class PatientHistoryDAOImpl extends DBUtil implements PatientHistoryDAO {

	@Override
	public void addPatientHistory(PatientHistory patientHistory) {
		entityManager.getTransaction().begin();
		entityManager.persist(patientHistory);
		entityManager.getTransaction().commit();
		
		
	}

	
	@Override
	public List<PatientHistory> listAllPatientHistories() {
		Query query =entityManager.createQuery("from PatientsHistory");	
		List<PatientHistory> patientsHistory =  query.getResultList();
		for(PatientHistory patienthistory:patientsHistory)
		{
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


