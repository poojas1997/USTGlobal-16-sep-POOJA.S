package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;

import com.ustglobal.studentapp.jspiders.*;  //to import all class from package.

public class TestA {
	public static void main(String[] args) {


		QTP q = new QTP();
		q.teachQTP();

		Selenium s = new Selenium();
		s.teachSelenium();

		//		com.ustglobal.studentapp.jspiders.Angular a = new com.ustglobal.studentapp.jspiders.Angular();//instead of import

		Angular a = new Angular();
		a.teachAngular();

		Angular a1 = new Angular();
		a1.teachAngular();

		React r= new React();
		r.teachReact();
	}
}
