package my.group.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "hello")
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