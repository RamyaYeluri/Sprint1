package com.cg.hsm.domain;


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
	private String medicines;
	/**
	 * medicine cost
	 */
	private long medicineCost;
	
	/**
	 * Reports of patients
	 */
	private String reports;
	/**
	 * current treatment given to patient
	 */
	private String currentTreatment;
	/**
	 * Detail description of disease
	 */
	
	private String diseaseDescription;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "PatientCase [associatedDoctorName=" + associatedDoctorName + ", medicines=" + medicines
				+ ", medicineCost=" + medicineCost + ", reports=" + reports + ", currentTreatment=" + currentTreatment
				+ ", diseaseDescription=" + diseaseDescription + "]";
	}
	//getters and setters
		//Default Constructor
				public PatientCase() {
					super();
					
				}
				public String getAssociatedDoctorName() {
					return associatedDoctorName;
				}
				public void setAssociatedDoctorName(String associatedDoctorName) {
					this.associatedDoctorName = associatedDoctorName;
				}
				public String getMedicines() {
					return medicines;
				}
				public void setMedicines(String medicines) {
					this.medicines = medicines;
				}
				public long getMedicineCost() {
					return medicineCost;
				}
				public void setMedicineCost(long medicineCost) {
					this.medicineCost = medicineCost;
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
				public String getDiseaseDescription() {
					return diseaseDescription;
				}
				public void setDiseaseDescription(String diseaseDescription) {
					this.diseaseDescription = diseaseDescription;
				}
	//Parameterized Constructor
	public PatientCase(String associatedDoctorName, String medicines, long medicineCost, String reports,
			String currentTreatment, String diseaseDescription) {
		super();
		this.associatedDoctorName = associatedDoctorName;
		this.medicines = medicines;
		this.medicineCost = medicineCost;
		this.reports = reports;
		this.currentTreatment = currentTreatment;
		this.diseaseDescription = diseaseDescription;
	}
	

				
				
				

}