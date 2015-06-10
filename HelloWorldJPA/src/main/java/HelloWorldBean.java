import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldBean {
    private String text = "Hello World!";

    @PostConstruct
    public void initialize() {
        System.out.println(HelloWorldBean.class.getSimpleName() + " was constructed");
    }

    public String getText() {
        return text;
    }
}