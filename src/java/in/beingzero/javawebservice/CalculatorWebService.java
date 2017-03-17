/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.beingzero.javawebservice;

import javafx.scene.control.Alert;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Andres
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {
    
    
    @WebMethod(operationName = "AddIntegers")
    public int add(@WebParam(name = "firstNum") int num1,
            @WebParam(name = "SecondNumber") int num2) {
        return num1 + num2;
    }

    @WebMethod(operationName = "SubstractIntegers")
    public int sub(@WebParam(name = "firstNum") int num1,
            @WebParam(name = "SecondNumber") int num2) {
        return num1 - num2;
    }

    @WebMethod(operationName = "MultiplyIntegers")
    public int mul(@WebParam(name = "firstNum") int num1,
            @WebParam(name = "SecondNumber") int num2) {
        return num1 * num2;
    }

    @WebMethod(operationName = "DivideIntegers")
    public int div(@WebParam(name = "firstNum") int num1,
            @WebParam(name = "SecondNumber") int num2) {
        
        return (num2 == 0) ?  0 : (num1 / num2); 
    }
   
}
