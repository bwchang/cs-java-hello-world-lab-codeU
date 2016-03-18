package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String p = System.getProperty("java.specification.version");
        double d = Double.parseDouble(p);
        return d;
    }

    public static void main(String[] args) {
	    System.out.println(getVersion());
    }
}
