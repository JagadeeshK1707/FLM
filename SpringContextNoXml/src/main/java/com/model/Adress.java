package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Adress {
	@Value("${hno}")
	private String HouseNo;
	@Value("${dno}")
	private String Drno;
	
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getDrno() {
		return Drno;
	}
	public void setDrno(String drno) {
		Drno = drno;
	}
	public Adress(String houseNo, String drno) {
		super();
		HouseNo = houseNo;
		Drno = drno;
	}
	
	
	
	public Adress() {
		super();
	}
	@Override
	public String toString() {
		return "Adress [HouseNo=" + HouseNo + ", Drno=" + Drno + "]";
	}

	
}
