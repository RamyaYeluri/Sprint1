package com.cg.hsm.daoimpl;

import java.util.List;

import com.cg.hsm.dao.DoctorDao;
import com.cg.hsm.domain.Doctor;
import com.cg.hsm.util.DbUtil;

/**
 * This class implements classes of DoctorDao Class
 * @author Pranjali Chaudhari
 *
 */
public class DoctorDaoImpl extends DbUtil implements DoctorDao {
	
	/**
	 * This addDoctor method will add doctor details in doctors table in database
	 */
	@Override
	public void addDoctor(Doctor doctor) {
		entityManager.getTransaction().begin();
		entityManager.persist(doctor);
		entityManager.getTransaction().commit();
		
	}

	/**
	 * This updateDoctor method will update doctor fees in doctors table in database 
	 */
	@Override
	public void updateDoctor(int doctorFee) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This updateDoctor method will update doctor details in doctors table in database
	 */
	@Override
	public void updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This deleteDcotor method will delete doctor details from doctors table in database
	 */
	@Override
	public void deleteDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This findAll method will list all doctor details 
	 */
	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
