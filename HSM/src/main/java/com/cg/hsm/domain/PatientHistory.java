package com.cg.hsm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * This class will create patientHistory table in database and get all patient history  details
 * @author Y.K Sai Ramya
 *
 */

@Entity
@Table(name="patientshistory")

public class PatientHistory {
		
	@ManyToOne
	private Patient patient;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 * id of the patientHistoryId
	 */
	@Column(name="patientHistoryId")
	private int patientHistoryId;
	
	/**
	 * Name of old Disease.
	 */
	
		private String diseaseName;
		/**
		 * Foreign key from Patient class patientId .
		 */
		private int patientId;
		
      /**
       * Blood group
       */
		private String bloodGroup;
		/**
		 * Diet advised for patient
		 */
		private String dietAdvised;
		/**
		 * .Status of treatment
		 */
		private String treatmentStatus;
		/**
		 * Name of the reports  patient have.
		 */
		private String histoyReports;
		
		//Getters and Setters
		
		
		public void setPatient(Patient patient)	{
			this.patient=patient;
		}
		public String getDiseaseName() {
			return diseaseName;
		}

		public int getPatientHistoryId() {
			return patientHistoryId;
		}

		public void setPatientHistoryId(int patientHistoryId) {
			this.patientHistoryId = patientHistoryId;
		}

		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public void setDiseaseName(String diseaseName) {
			this.diseaseName = diseaseName;
		}

		public String getBloodGroup() {
			return bloodGroup;
		}

		public Patient getPatient() {
			return patient;
		}

		
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}

		public String getDietAdvised() {
			return dietAdvised;
		}

		public void setDietAdvised(String dietAdvised) {
			this.dietAdvised = dietAdvised;
		}

		public String getTreatmentStatus() {
			return treatmentStatus;
		}

		public void setTreatmentStatus(String treatmentStatus) {
			this.treatmentStatus = treatmentStatus;
		}

		public String getHistoryReports() {
			return histoyReports;
		}

		public void setHistoryReports(String reports) {
			this.histoyReports = reports;
		}

		//Default Constructor
		public PatientHistory() {
			super();
			
		}

		@Override
		public String toString() {
			return "PatientHistory [patient=" + patient + ", patientHistoryId=" + patientHistoryId
					+ ", diseaseName=" + diseaseName + ", bloodGroup=" + bloodGroup + ", dietAdvised=" + dietAdvised
					+ ", treatmentStatus=" + treatmentStatus + ", histoyReports=" + histoyReports + "]";
		}
   //ToString method
		public PatientHistory( int patientHistoryId, String diseaseName, String bloodGroup,
				String dietAdvised, String treatmentStatus, String histoyReports) {
			super();
			this.patientHistoryId = patientHistoryId;
			this.diseaseName = diseaseName;
			this.bloodGroup = bloodGroup;
			this.dietAdvised = dietAdvised;
			this.treatmentStatus = treatmentStatus;
			this.histoyReports = histoyReports;
		}
		
		
		
	}
		


