package com.cg.hsm.dao;

import java.util.List;
/**
 * This class will create patientHistory table in database and get all patient history  details
 * @author Y.K Sai Ramya
 *
 */


import com.cg.hsm.domain.PatientHistory;



public interface PatientHistoryDAO {
	/**
	 * This addPatientHistory method will add history details of patient to database
	 * @param patientHistory
	 */
	public void addPatientHistory(PatientHistory patientHistory);
		 	/**
	 * This will return the list of all the patient's history details from database
	 * @return Doctors
	 */
	List<PatientHistory> listAllPatientHistories();
	

}
