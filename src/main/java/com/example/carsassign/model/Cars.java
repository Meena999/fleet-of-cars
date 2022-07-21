package com.example.carsassign.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Cars {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="Id")
            private Long id;
        
        @Column(name="Name")
        private String carName;
        
        @Column(name="Miles_per_Gallon")
        private String milespGallon;
        
        @Column(name="Cylinders")
        private String cylinders;
        
        @Column(name="Displacement")
        private String displacement;
        
        @Column(name="Horsepower")
        private String horsePwr;
        
        @Column(name="Weight_in_lbs")
        private String wgtInlbs;
        
        @Column(name="Acceleration")
        private String accleration;
        
        @Column(name="Year")
        private String year;
        
        @Column(name="Origin")
        private String origin;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCarName() {
			return carName;
		}

		public void setCarName(String carName) {
			this.carName = carName;
		}

		public String getMilespGallon() {
			return milespGallon;
		}

		public void setMilespGallon(String milespGallon) {
			this.milespGallon = milespGallon;
		}

		public String getCylinders() {
			return cylinders;
		}

		public void setCylinders(String cylinders) {
			this.cylinders = cylinders;
		}

		public String getDisplacement() {
			return displacement;
		}

		public void setDisplacement(String displacement) {
			this.displacement = displacement;
		}

		public String getHorsePwr() {
			return horsePwr;
		}

		public void setHorsePwr(String horsePwr) {
			this.horsePwr = horsePwr;
		}

		public String getWgtInlbs() {
			return wgtInlbs;
		}

		public void setWgtInlbs(String wgtInlbs) {
			this.wgtInlbs = wgtInlbs;
		}

		public String getAccleration() {
			return accleration;
		}

		public void setAccleration(String accleration) {
			this.accleration = accleration;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}
}
