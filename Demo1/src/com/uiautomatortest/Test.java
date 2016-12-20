package com.uiautomatortest;

import android.os.Bundle;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Test extends UiAutomatorTestCase {
	public void testDemo(){
		UiDevice.getInstance().pressHome();
		sleep(2000);
		Bundle bundle = getParams();
		String phone=bundle.getString("phone");
		System.out.println("PHONE:"+phone);
	}
	
	public void testMenu(){
		UiDevice.getInstance().pressMenu();
	}
	
	public void testRecent() throws Exception{
		UiDevice.getInstance().pressRecentApps();
	}
	
	public static void main(String args[]){
		String jarName="DemoTest";
	    String testClass="com.uiautomatortest.Test";
	    String testName="testRecent";
	    String androidId="2";
				
		new UiAutomatorHelper(jarName, testClass, testName, androidId);
		
	}
}
