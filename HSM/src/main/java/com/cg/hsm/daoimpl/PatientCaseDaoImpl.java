package com.cg.hsm.daoimpl;

import java.util.List;
import com.cg.hsm.dao.PatientCaseDao;
import com.cg.hsm.dao.PatientDao;
import com.cg.hsm.domain.PatientCase;
import com.cg.hsm.util.DbUtil;

public class PatientCaseDaoImpl extends DbUtil implements PatientCaseDao {
	/**
	 * This addPatientCase method will add patient details in patients table in database
	 */
	@Override
	public void addPatientCase(PatientCase patientcase) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(patientcase);
		entityManager.getTransaction().commit();
		
		
	}
	/**
	 * This updatePatientCase method will update patientCase details in patients table in database
	 */
	@Override
	public void updatePatientCase(PatientCase patientcase) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * This deletePatientCase method will delete patientCase details from patients table in database
	 */
	@Override
	public void deletePatientCase(PatientCase patientcase) {
		// TODO Auto-generated method stub
		
	}
	/**
	 *  This findAll method will list all patientCase details
	 */
	@Override
	public List<PatientCase> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}