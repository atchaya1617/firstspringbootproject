package com.spring.firstspring.firstspringbootproject.dto;

	import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;


	@Component
	@Entity
	public class AadharDto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int aId;
		long aNumber;
		String aAddress;
		public int getaId() {
			return aId;
		}
		public void setaId(int aId) {
			this.aId = aId;
		}
		public long getaNumber() {
			return aNumber;
		}
		public void setaNumber(long aNumber) {
			this.aNumber = aNumber;
		}
		public String getaAddress() {
			return aAddress;
		}
		public void setaAddress(String aAddress) {
			this.aAddress = aAddress;
		}
		
		
		

}
