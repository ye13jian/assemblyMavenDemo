package com.jianye.assemblyMavenDemo;

import org.apache.commons.lang3.StringUtils;

public class AssemblyMain {
	public static void main(String[] args) {
		String helloWorldStr = "Hello World";
		if (StringUtils.isNotBlank(helloWorldStr)) {
			System.out.println(helloWorldStr);
		}
	}
}
