package com.cg.hsm.dao;

import java.util.List;

import com.cg.hsm.domain.PatientsHistory;

/**
 * This class perform CRUD operations on database
 * @author Y.K.Sai Ramya
 *
 */


public interface PatientsHistoryDao {
	/**
	 * This addPatientsHistory method will add new history of a patient to database
	 * @param history
	 */
	public void addPatientsHistory(PatientsHistory history);
	/**
	 * This updatePatientsHistory will update history details of existing patient in database
	 * @param history
	 */
	public void updatePatientsHistory(PatientsHistory history);
	/**
	* This deletePatientsHistory will delete history details of existing patient in database
	 * @param history
	 */ 
	public void deletePatientsHistory(PatientsHistory history);
	/**
	 * This will return the list of all the patient's history from database
	 * @return PatientsHistory
	 */
	List<PatientsHistory> findAll();
	

}



