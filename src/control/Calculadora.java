package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Calculadora {
	
	@WebMethod
	public int Soma(@WebParam (name="num1") int num1, @WebParam(name="num2") int num2) {
		return num1 + num2;
	}
	
	@WebMethod
	public int Subtrair(@WebParam (name="num1") int num1, @WebParam(name="num2") int num2) {
		return num1 - num2;
	}
	
	@WebMethod
	public int Multiplicar(@WebParam (name="num1") int num1, @WebParam(name="num2") int num2) {
		return num1 * num2;
	}
	
	@WebMethod
	public float Dividir(@WebParam (name="num1") float num1, @WebParam(name="num2") float num2) {
		return num1 / num2;
	}
}
