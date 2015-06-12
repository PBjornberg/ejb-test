package com.corejsf;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import my.group.dao.CustomerDAO;
import my.group.entity.Customer;

@ManagedBean(name = "hello")
@SessionScoped
public class HelloBean {
	
	private CustomerDAO customerDAO;
//    private String value = "Hello World!";
    String listString = "";

    @PostConstruct
    public void initialize() {
    	customerDAO = new CustomerDAO();
        System.out.println(HelloBean.class.getSimpleName() + " was constructed");
    }


	public String getValue() {
		
		for (Customer s : customerDAO.findAll())
		{
		    listString += s.getCustomername() + "\t";
		}
		
		return listString;
		//return value;
	}
 
	public void setValue(String value) {
		this.listString = value;
	}
}