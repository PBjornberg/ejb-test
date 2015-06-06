package my.group.client;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

import my.group.server.HelloWorld;

public class HelloWorldClient {

	private static HelloWorld helloWorld;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		env.put(Context.SECURITY_PRINCIPAL,"weblogic");
		env.put(Context.SECURITY_CREDENTIALS,"welcome1");
		env.put(Context.PROVIDER_URL,"t3://localhost:7001");
		Context ctx = new InitialContext(env);
		System.out.println("Initial Context created");
		helloWorld = (HelloWorld) ctx.lookup("HelloWorld#my.group.server.HelloWorld");
		System.out.println("lookup successful");
		System.out.println("Calling EJB method . . .");
		helloWorld.sayHello("Test message from HelloWorldClient");
		System.out.println("Output will be in Managed server console");
		}

		catch (Exception e)
		{
		e.printStackTrace();
		}
	}
}

