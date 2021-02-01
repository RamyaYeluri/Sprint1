package com.cg.hsm.service;
/**
 * This class provides services to Doctor
 * @author Pranjali Chaudhari
 *
 */

public interface DoctorService {
	
	
	
	/**
	 * this viewPatientHistory method shows patient's history of treatments
	 */
	void viewPatientHistory(int patientId);

	/**
	 * This viewPatientCase method shows patient's current case
	 */
	void viewPatientCase(int patientId);

}
