package com.cg.hsm.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * This class will create patientHistory table in database and get all patient history  details
 * @author Y.K Sai Ramya
 *
 */

@Entity
@Table(name="patient's history")

	

public class PatientHistory {
		/**
		 * Name of old Disease.
		 */
	@ManyToOne
	@JoinColumn(name="FK_PatientId")
	private Patient patientId;
	
	
	
		private String diseaseName;
		/**
		 * blood group.
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
			
		public String getDiseaseName() {
			return diseaseName;
		}

		public void setDiseaseName(String diseaseName) {
			this.diseaseName = diseaseName;
		}

		public String getBloodGroup() {
			return bloodGroup;
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
		
		
		public PatientHistory(String diseaseName, String bloodGroup, String dietAdvised, String treatmentStatus,
				String historyReports,Patient patientId) {
			super();
			this.diseaseName = diseaseName;
			this.bloodGroup = bloodGroup;
			this.dietAdvised = dietAdvised;
			this.treatmentStatus = treatmentStatus;
			this.histoyReports = historyReports;
			this.patientId=patientId;
		}

		//Overridden toString method
		@Override
		public String toString() {
			return "PatientsHistory [diseaseName=" + diseaseName + ", bloodGroup=" + bloodGroup + ", dietAdvised="
					+ dietAdvised + ", treatmentStatus=" + treatmentStatus + ", reports=" + histoyReports + ", patientId = " +patientId+ "]";
		}
	}
		


