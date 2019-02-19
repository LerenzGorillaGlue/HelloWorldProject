package basics;

public class Variable {

	public static void main(String[] args) {
		// 1 bit - wahr oder falsch / 0 oder 1
		boolean boolVar;
		boolVar = true;
		System.out.print(boolVar);
		//
		boolVar = false;
		System.out.println(boolVar);
		//
		// short 16bit
		short shortVar;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		shortVar = 24673;
		System.out.println(shortVar);
		//
		shortVar = 2+5;
		System.out.println(shortVar);
		//
		shortVar = 9-5;
		System.out.println(shortVar);
		//
		shortVar = 3*3;
		System.out.println(shortVar);
		//
		shortVar = 9/4;
		System.out.println(shortVar);
		//
		System.out.println(9/4.0);
		//
		//
		int intVar;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		intVar = -23456;
		System.out.println(intVar);
		//
		//
		long longVar;
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		longVar = 1000*1000*1000*1000;
		System.out.println(longVar);
		//
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
		//
		//
		//
		float floatVar;
		floatVar = 10/3f; // 10/3.0
		System.out.println(floatVar);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		//
		double doubleVar;
		doubleVar = 10/3d; // 10/3.0
		System.out.print("Double: ");
		System.out.println(doubleVar);
		//
		System.out.print("Float: ");
		System.out.println(floatVar);
		//
		//
		String stringVar;
		stringVar = "Hallo Paul.";
		System.out.println(stringVar);

	}
}
