package my.group.server;

import javax.ejb.Stateless;
@Stateless(mappedName="HelloWorld")
public class HelloWorldBean implements HelloWorld

{
public void sayHello(String name)

{
System.out.println("Hello " + name + " It’s Working!");

}

}