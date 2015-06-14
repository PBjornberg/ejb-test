package my.group.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@javax.jws.WebService(endpointInterface = "my.group.ws.CalculatorWs", targetNamespace = "http://superbiz.org/wsdl", serviceName = "CalculatorService", portName = "CalculatorPort")
public class CalculatorPortImpl {

	public int multiply(int arg0, int arg1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	public int sum(int arg0, int arg1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}