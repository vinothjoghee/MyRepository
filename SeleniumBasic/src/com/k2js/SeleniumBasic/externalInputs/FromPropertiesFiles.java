package com.k2js.SeleniumBasic.externalInputs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FromPropertiesFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("D:\\SeleniumTrainingByJitendra\\Practicals\\SeleniumPracticals\\SeleniumBasic\\config.properties");
        System.out.println(fis);
        Properties p=new Properties();
        p.load(fis);
        String browsername=p.getProperty("config.bn");
        String remote=p.getProperty("rm");
        System.out.println(browsername);
        System.out.println(remote);
	}

}
