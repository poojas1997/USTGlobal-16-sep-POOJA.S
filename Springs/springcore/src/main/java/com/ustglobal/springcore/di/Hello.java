package com.ustglobal.springcore.di;	//App.java & LifeCycleClass.java

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")			//==refer spring.xml
public class Hello {

	private String msg;
	
	public Map<String, Integer> map;
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@PostConstruct				//used to Annotation.java
	public void init() {
		System.out.println("Init method executing from Hello");
	}
	@PreDestroy					//used to Annotation.java
	public void destroy() {
		System.out.println("Destroy method executing from Hello");
	}
}//end of Hello
