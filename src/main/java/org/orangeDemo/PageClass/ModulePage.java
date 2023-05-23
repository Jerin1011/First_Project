package org.orangeDemo.PageClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.poifs.macros.Module;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.orangeDemo.PageFactory.ModuleElements;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

public class ModulePage extends SeleniumBaseClass{
	public static ModuleElements obj = new ModuleElements(driver);
	
	public static void findElements() {
		List l = new ArrayList();
		l.add("Admin");
		l.add("PIM");
		l.add("Leave");
		l.add("Time");
		l.add("Recruitment");
		l.add("My Info");
		l.add("Performance");
		l.add("Dashboard");
		l.add("Directory");
		l.add("Maintenance");
		l.add("Buzz");
		int listsize = l.size();
		
		int j=0;
//			for(int i=0; i<listsize; i++) {
				for(WebElement webelement : obj.module){
					while(j<listsize) {
					String moduletext = webelement.getText();
//					System.out.println("moduletext = "+moduletext);
					Object expvalue = l.get(j);	
//				System.out.println("expvalue = "+expvalue);
				
				boolean equals = moduletext.equals(expvalue);
		System.out.println(" moduletext = " + moduletext + "  ||| expvalue = " + expvalue + " = " + equals);
		break;
			
			}
					j++;
				}
			
			
			
			
			
}

}