package com.testpackage;

import java.util.HashMap;
import java.util.Map;

public class TestClass1 {

	public static void main(String[] args) {
		Map<Integer,String> testMap = new HashMap<Integer,String>();
		testMap.put(1304, "Jun-17 V2-Final");
		testMap.put(1304, "Jun-17 V2");
		System.out.println(testMap);

	}

}
