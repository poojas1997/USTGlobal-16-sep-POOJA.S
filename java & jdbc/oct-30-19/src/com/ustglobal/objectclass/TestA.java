package com.ustglobal.objectclass;

public class TestA {

	public static void main(String[] args) {	//upcasting

		Mouse m = new Mouse();
		USBPort.connect(m);

		PenDrive p = new PenDrive();
		USBPort.connect(p);

	}

}
