package com.te.LearnJava8.designPatterns.factory;

public class OsFactory {
	public static AndroidOS getOs(String oSType) {
		
		if (oSType.equalsIgnoreCase("colors")) {
			return new ColorOS();
			
		} else if (oSType.equalsIgnoreCase("oxygenOS")) {
			return new OxygenOS();
			
		}else if (oSType.equalsIgnoreCase("miuios")) {
			return new MiuiOS();
			
		}else {
			throw new IllegalArgumentException("Type valid osType");
		}
		
	}

}
