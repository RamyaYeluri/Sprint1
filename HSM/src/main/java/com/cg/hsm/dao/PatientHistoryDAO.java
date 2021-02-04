package com.cg.hsm.dao;

import java.util.List;
/**
 * This class will create patientHistory table in database and get all patient history  details
 * @author Y.K Sai Ramya
 *
 */


import com.cg.hsm.domain.PatientHistory;

/**
* This PatientHistoryDAOImpl define CRUD operations 
* @author Y.K.Sai Ramya
*
*/

public interface PatientHistoryDAO {
	/**
	 * This addPatientHistory method will add history details of patient to database
	 * @param patientHistory
	 */
	public void addPatientHistory(PatientHistory patientHistory);
		 	/**
	 * This will return the list of all the patient's history details from database
	 * @return Patient's History
	 */
	List<PatientHistory> listAllPatientHistories();
	/**
	 * This method will return list of patient history details based on patientid
	 * @param patientId
	 */
	void viewPatientHistory(int patientId);
	

}
