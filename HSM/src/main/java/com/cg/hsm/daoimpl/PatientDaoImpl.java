package com.cg.hsm.daoimpl;

import java.util.List;

import com.cg.hsm.dao.PatientDao;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.util.DbUtil;
/**
 * This class implements classes of DoctorDao Class
 * @author Jyothi
 *
 */

public class PatientDaoImpl extends DbUtil implements PatientDao {
	/**
	 * This addPatient method will add patient details in patients table in database
	 */
	@Override
	public void addPatient(Patient patient) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.getTransaction().commit();
		
		
	}
	/**
	 * This updatePatient method will update patient details in patients table in database
	 */
	@Override
	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * This deletePatient method will delete patient details from patients table in database
	 */
	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * This findAll method will list all patient details 
	 */
	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}