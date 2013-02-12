package com.qait.cxp.dataprovider;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import com.qait.cxp.pageobjects.AbstractPage;

public class CxpDataProvider {

	public String getXmlFromFile(String fileName) throws Exception{
		URL fileURL = CxpDataProvider.class.getResource("testdata/samples/"+fileName);
		System.out.println(fileURL.getFile());
		BufferedReader br = null;
		String itemXml = "";		 
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(new File(fileURL.getFile())));
			//FileReader fl = new FileReader(new File(fileURL.getFile()));
			//br = new BufferedReader(fl);
			
			//br = new BufferedReader(new FileReader("C:\testing.txt"));
 
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

}
