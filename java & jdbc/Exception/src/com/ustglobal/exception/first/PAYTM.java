package com.ustglobal.exception.first;

public class PAYTM {
	
	void book() {
		System.out.println("PayTm started..");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("PayTM ended..");
	}

}
