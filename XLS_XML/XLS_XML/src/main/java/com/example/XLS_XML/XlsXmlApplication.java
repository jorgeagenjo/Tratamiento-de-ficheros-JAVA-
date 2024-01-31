package com.example.XLS_XML;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.XLS_XML.models.employes;
import com.example.XLS_XML.utils.readXLS;
import com.example.XLS_XML.utils.writeXML;

@SpringBootApplication
public class XlsXmlApplication {

	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
		String rutaEntrada="src\\main\\resources\\static\\Employee Sample Data.xlsx";
		String rutaSalida="src\\main\\resources\\static\\Employee Sample Data.xml";
		
		readXLS mireadXLS=new readXLS();
		
		ArrayList<employes>arrEmployes=mireadXLS.leerXLS(rutaEntrada);
		
		for (employes x:arrEmployes) {
			System.out.println(x.toString());
		}
		
		writeXML miWriteXLS=new writeXML();
		
		miWriteXLS.escribirXML(arrEmployes, rutaSalida);
	}

}
