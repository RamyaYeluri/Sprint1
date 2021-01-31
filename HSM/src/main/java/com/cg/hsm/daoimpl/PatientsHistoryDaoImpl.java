package com.cg.hsm.daoimpl;

import java.util.List;


import com.cg.hsm.dao.PatientsHistoryDao;
import com.cg.hsm.domain.PatientsHistory;
import com.cg.hsm.util.DbUtil;
/**
 * This class implements classes of PatientsHistorDao Class
 * @author Y.K.Sai Ramya
 *
 */

public class PatientsHistoryDaoImpl extends DbUtil implements PatientsHistoryDao {

	@Override
	public void addPatientsHistory(PatientsHistory history) {
		entityManager.getTransaction().begin();
		entityManager.persist(history);
		entityManager.getTransaction().commit();
		

	}

	@Override
	public void updatePatientsHistory(PatientsHistory history) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePatientsHistory(PatientsHistory history) {
		//specific row using find statement
         entityManager.remove(history);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	
		// TODO Auto-generated method stub

	}

	@Override
	public List<PatientsHistory> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
