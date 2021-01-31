package com.cg.hsm.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will create patientCase table in database and get all patient  details
 * @author samyuktha
 *
 */
import javax.persistence.Embeddable;

@Embeddable


public class PatientCase {
	/**
	 * DoctorName how to assigned to that patient
	 */
	private String associatedDoctorName;
	/**
	 * medicine for patient
	 */
	private List<String> medicines = new ArrayList<String>() ;
	public String getMedicines() {
		String medicinesList="";
		for(String med:medicines) {
			medicinesList+=med;
		}
				
		return medicinesList;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	/**
	 * Reports of patients
	 */
	private String reports;
	/**
	 * currenttreatment given to patient
	 */
	private String currentTreatment;
	@Override
	public String toString() {
		return "PatientCase [associatedDoctorName=" + associatedDoctorName + ", medicines=" + medicines + ", reports="
				+ reports + ", currentTreatment=" + currentTreatment + ", diseaseDescription=" + diseaseDescription
				+ "]";
	}
	/**
	 * Detail description of disease
	 */
	private String diseaseDescription;
	
	//getters and setters
	public String getDiseaseDescription() {
		return diseaseDescription;
	}
	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}
	public String getassociatedDoctorName() {
		return associatedDoctorName;
	}
	public void setassociatedDoctorId(String associatedDoctorName) {
		this.associatedDoctorName = associatedDoctorName;
	}
	
	public String getReports() {
		return reports;
	}
	public void setReports(String reports) {
		this.reports = reports;
	}
	public String getCurrentTreatment() {
		return currentTreatment;
	}
	public void setCurrentTreatment(String currentTreatment) {
		this.currentTreatment = currentTreatment;
	}
	//Parameterized Constructor
		public PatientCase(String associatedDoctorId,String reports, String currentTreatment,ArrayList<String> medicines,String diseaseDescription) {
			super();
			this.associatedDoctorName = associatedDoctorName;
			this.reports = reports;
			this.currentTreatment = currentTreatment;
			this.medicines = medicines;
			
			this.diseaseDescription=diseaseDescription;
		}
		//Default Constructor
				public PatientCase() {
					super();
					
				}
				
				
				

}