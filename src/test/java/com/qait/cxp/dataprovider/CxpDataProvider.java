package com.qait.cxp.dataprovider;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.seleniumemulation.GetXpathCount;

//import com.qait.cxp.pageobjects.AbstractPage;


//import com.qait.cxp.pageobjects.AbstractPage;

import com.qait.cxp.dsl.*;
public class CxpDataProvider{

	public  CxpDataProvider() {
		// TODO Auto-generated constructor stub
	
	}
	private void resourcepath (String sPath) {
        URL url  = getClass().getClassLoader().getResource(sPath);
        System.out.println(url);
        //System.out.println(System.getProperty("java.class.path"));
        if (url == null)
            System.out.println("ClassLoader.getResource(" + sPath + "): NULL");
        else
            System.out.println("ClassLoader.getResource(" + sPath + "): SUCCESS");
       
    }
	 private void doClassGetResource (String sPath) {
	        URL url  = getClass().getResource(sPath);
	        //System.out.println(System.getProperty("java.class.path"));
	        if (url == null)
	            System.out.println("Class.getResource(" + sPath + "): NULL");
	        else
	            System.out.println("Class.getResource(" + sPath + "): SUCCESS");
	        System.out.println(url);
	    }

	 public String getXmlFromFile(String fileName) throws Exception {
			
			
			BufferedReader br = null;
			String itemXml = "";		 
			try {
				String sCurrentLine;

				
				br = new BufferedReader(new FileReader("data/"+fileName));
	 
				while ((sCurrentLine = br.readLine()) != null) {
					itemXml=itemXml+sCurrentLine+"\n";
					
				}
				 System.out.println(itemXml);
	 
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
			return itemXml;
		}


public static void main (String[] args) throws Exception{
	//String filePath = "roundSF.txt";
	String filePath = "testdata/samples/roundSF.txt";
	CxpDataProvider dataProviderObject = new CxpDataProvider();
	dataProviderObject.getXmlFromFile("roundSF.txt");
	//dataProviderObject.resourcepath(filePath);
	//dataProviderObject.doClassGetResource(filePath);
	}
}



/**
 * previous code of reading resource file from cxpdata provider. You have to manually place the resource file once in test-classes.
 * package com.qait.cxp.dataprovider;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.seleniumemulation.GetXpathCount;

//import com.qait.cxp.pageobjects.AbstractPage;


//import com.qait.cxp.pageobjects.AbstractPage;

import com.qait.cxp.dsl.*;
public class CxpDataProvider{

	public  CxpDataProvider() {
		// TODO Auto-generated constructor stub
	
	}
	private void resourcepath (String sPath) {
        URL url  = getClass().getClassLoader().getResource(sPath);
        System.out.println(url);
        //System.out.println(System.getProperty("java.class.path"));
        if (url == null)
            System.out.println("ClassLoader.getResource(" + sPath + "): NULL");
        else
            System.out.println("ClassLoader.getResource(" + sPath + "): SUCCESS");
       
    }
	 private void doClassGetResource (String sPath) {
	        URL url  = getClass().getResource(sPath);
	        //System.out.println(System.getProperty("java.class.path"));
	        if (url == null)
	            System.out.println("Class.getResource(" + sPath + "): NULL");
	        else
	            System.out.println("Class.getResource(" + sPath + "): SUCCESS");
	        System.out.println(url);
	    }

	public String getXmlFromFile(String fileName) throws Exception{
	//	System.out.println("In CXP Data Provider Page ");
		System.out.println("fileName to be fetched is " + fileName);
		//System.out.println(getClass().getClassLoader().getResource("testdata/samples/"+fileName));
		//URL fileURL = this.getClass().getClassLoader().getResource("testdata/samples/"+fileName);
		//URL fileURL = CxpDataProvider.class.getResource("testdata/samples/"+fileName);
		//System.out.println("file path to e fetched " + getClass());
		//System.out.println("file path to e fetched " + getClass().getClassLoader().getResourceAsStream(fileName));
		
		//URL fileURL = getClass().getClassLoader().getResource("testdata/samples/"+fileName);
		URL fileURL = getClass().getResource("testdata/samples/"+fileName);
		if (fileURL==null)
			fileURL=getClass().getClassLoader().getResource("testdata/samples/"+fileName);
					
		//URL fileURL = getClass().getClassLoader().getResource(fileName);
	//	System.out.println("fetched file name ");
		System.out.println(fileURL);
		BufferedReader br = null;
		String itemXml = "";	
	//	System.out.println("itemXML value is " + itemXml);
		//System.out.println(System.getProperty("java.class.path"));
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(new File(fileURL.getFile())));
			//FileReader fl = new FileReader(new File(fileURL.getFile()));
			//br = new BufferedReader(fl);
			
			//br = new BufferedReader(new FileReader("C:\\testing.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				itemXml=itemXml+sCurrentLine+"\n";
				
			}
			// System.out.println(itemXml);
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		return itemXml;
	}


public static void main (String[] args){
	//String filePath = "roundSF.txt";
	String filePath = "testdata/samples/roundSF.txt";
	CxpDataProvider dataProviderObject = new CxpDataProvider();
	dataProviderObject.resourcepath(filePath);
	dataProviderObject.doClassGetResource(filePath);
}
}
 * 
 * 
 */
