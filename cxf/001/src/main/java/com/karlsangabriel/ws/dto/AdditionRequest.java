package com.karlsangabriel.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class AdditionRequest {

	private int adden1;

	private int adden2;

	public int getAdden1() {
		return adden1;
	}

	public void setAdden1(int adden1) {
		this.adden1 = adden1;
	}

	public int getAdden2() {
		return adden2;
	}

	public void setAdden2(int adden2) {
		this.adden2 = adden2;
	}

}
