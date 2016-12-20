package com.test;

import android.text.style.ClickableSpan;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestUiObject extends UiAutomatorTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jarName, testClass, testName, androidId;
		jarName = "uiobject";
		testClass ="com.test.TestUiObject";
		testName ="testClick";
		androidId="2";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);
	}
	
	//com.android.deskclock:id/analog_appwidget
	public void testClick() throws Exception{
		
		UiObject clock=new UiObject(new UiSelector().resourceId("com.android.deskclock:id/analog_appwidget"));
		//clock.click();
		//clock.clickAndWaitForNewWindow(5000);
//		clock.clickBottomRight();
//		sleep(3000);
//		UiDevice.getInstance().pressBack(); //·µ»Ø
//		sleep(1000);
//		clock.clickTopLeft();	
//		sleep(3000);
//		UiDevice.getInstance().pressBack();
//		sleep(1000);
		
		//clock.longClick();
		UiDevice.getInstance().swipe(236, 212, 238, 214, 200);
		
	}

}
