package com.gmail.bezkrovnairyna;

import java.math.BigInteger;

public class Time {
	private BigInteger mili;

	public Time(BigInteger mili) {
		super();
		this.mili = mili;
	}

	public void convert() {

		BigInteger mls=mili.mod(BigInteger.valueOf(1000));
		BigInteger s=mili.divide(BigInteger.valueOf(1000)).mod(BigInteger.valueOf(60));
		BigInteger m=mili.divide(BigInteger.valueOf(1000*60)).mod(BigInteger.valueOf(60));
		BigInteger h=mili.divide(BigInteger.valueOf(1000*60*60)).mod(BigInteger.valueOf(24));
		BigInteger days=mili.divide(BigInteger.valueOf(1000*60*60*24)).mod(BigInteger.valueOf(30));
		System.out.println(days+"days "+h+"h "+m+"m "+s+ "s "+mls+"mls" );
	}
}