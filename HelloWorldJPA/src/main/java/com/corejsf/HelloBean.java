package com.corejsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "hello")
@SessionScoped
public class HelloBean {
    private String value = "Hello World!";

    @PostConstruct
    public void initialize() {
        System.out.println(HelloBean.class.getSimpleName() + " was constructed");
    }


	public String getValue() {
		return value;
	}
 
	public void setValue(String value) {
		this.value = value;
	}
}