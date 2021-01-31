package com.cg.hsm.dao;

import java.util.List;

import com.cg.hsm.domain.PatientCase;
/**
 * This class perform CRUD operations on database
 * @author  samyuktha
 *
 */

public interface PatientCaseDao {
	/**
	 * This addPatientCase method will add new patientCase to database
	 * @param patient
	 */
	public void addPatientCase(PatientCase patientcase);
	/**
	 * This updatePatientCase will update PatientCase details in database
	 * @param patient
	 */
	public void updatePatientCase(PatientCase patientcase);
	/**
	 * This deletePatientCase method will delete record of patientCase from database
	 * @param patient
	 */
	public void deletePatientCase(PatientCase patientcase);
	/**
	 *This will return the list of all the PatientCase from database
	 * @return
	 */
	List<PatientCase> findAll();
}






