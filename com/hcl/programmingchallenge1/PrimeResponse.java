package com.hcl.programmingchallenge1;

public class PrimeResponse {
	private Integer number;
	private Boolean prime;	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Boolean getPrime() {
		return prime;
	}
	public void setPrime(Boolean prime) {
		this.prime = prime;
	}	
	@Override
	public String toString() {
		return "PrimeResponse [number=" + number + ", prime=" + prime + "]";
	}
}
