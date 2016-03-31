package com.example.sunghuncom.hw_1_c_0330;

/**
 * Created by SunghunCom on 16. 3. 30..
 */
public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super();
    }
    public DivideByZeroException(String msg) {
        super(msg);
    }
}