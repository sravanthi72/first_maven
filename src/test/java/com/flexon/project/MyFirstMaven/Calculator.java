package com.flexon.project.MyFirstMaven;

public class Calculator {
	
		//hello
		public static Integer sum(Integer x, Integer y){
			if (x == null || y == null)
				return null;
			return x + y;}
		public static Integer sub(Integer x, Integer y){
			if (x == null || y == null)
				return null;
			return x - y;}
	

}
/*
Create a Calculator class
▪Create  Sum Method in src/main/java folderpublic static Integer sum(Integer x, Integer y
		){if (x == null || y == null)return null;return x + y;}
▪Create Unit tests for Addition method in src/test/java folder@Testpublic void testSum()
{System.out.println("sum");Integer x = 15;Integer y = 15;Integer expResult = 30;Integer result = Calculator.sum(x, y);
assertEquals(expResult, result);assertEquals(null, Calculator.sum(15, null));
assertEquals(null, Calculator.sum(null, 15));assertEquals(null, Calculator.sum(null, null));}
▪mvn compile and mvn test – commands
▪mvn package▪mvn clean  deletes the files that are stored in target folder*/