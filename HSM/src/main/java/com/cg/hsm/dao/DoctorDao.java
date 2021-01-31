package com.cg.hsm.dao;

import java.util.List;

import com.cg.hsm.domain.Doctor;
/**
 * This class perform CRUD operations on database
 * @author Pranjali Chaudhari
 *
 */

public interface DoctorDao {
	
	/**
	 * This addDoctor method will add new doctor to database
	 * @param doctor
	 */
	public void addDoctor(Doctor doctor);
	/**
	 * This updateDoctor method will update doctor fees in database;
	 * @param fees
	 */
	public void updateDoctor(int fees);
	/**
	 * This updateDoctor will update doctor details in database
	 * @param doctor
	 */
	public void updateDoctor(Doctor doctor);
	/**
	 * This deleteDoctor method will delete record of doctor from database
	 * @param doctor
	 */
	public void deleteDoctor(Doctor doctor);
	/**
	 * This will return the list of all the doctors from database
	 * @return Doctors
	 */
	List<Doctor> findAll();
	

}
