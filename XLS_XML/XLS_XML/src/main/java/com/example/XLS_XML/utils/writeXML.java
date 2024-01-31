package com.example.XLS_XML.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.example.XLS_XML.models.employes;



public class writeXML {
	public void escribirXML(ArrayList<employes>arrEmployes,String rutaSalida) throws ParserConfigurationException, TransformerException, IOException {
	
	 DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
     DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
     Document document = documentBuilder.newDocument();

     Element rootElement = document.createElement("EMPLEADOS");
     document.appendChild(rootElement);

     for (employes x : arrEmployes) {
    	 
         Element oscarElement = document.createElement("Employes");

         Element eeid = document.createElement("Index");
         eeid.appendChild(document.createTextNode(x.getEeid()));
         oscarElement.appendChild(eeid);

         Element fullName = document.createElement("fullName");
         fullName.appendChild(document.createTextNode(x.getFullName()));
         oscarElement.appendChild(fullName);

         Element jobTitle = document.createElement("jobTitle");
         jobTitle.appendChild(document.createTextNode(x.getJobTitle()));
         oscarElement.appendChild(jobTitle);

         Element department = document.createElement("department");
         department.appendChild(document.createTextNode(x.getDepartment()));
         oscarElement.appendChild(department);

         Element businessUnit = document.createElement("businessUnit");
         businessUnit.appendChild(document.createTextNode(x.getBusinessUnit()));
         oscarElement.appendChild(businessUnit);
         
         Element gender = document.createElement("gender");
         gender.appendChild(document.createTextNode(x.getGender()));
         oscarElement.appendChild(gender);

         Element ethnicity = document.createElement("ethnicity");
         ethnicity.appendChild(document.createTextNode(x.getEthnicity()));
         oscarElement.appendChild(ethnicity);

         Element ageStr = document.createElement("ageStr");
         ageStr.appendChild(document.createTextNode(x.getAge()));
         oscarElement.appendChild(ageStr);

         Element hireDate = document.createElement("hireDate");
         hireDate.appendChild(document.createTextNode(x.getHireDate()));
         oscarElement.appendChild(hireDate);
         
         Element annualSalaryStr = document.createElement("annualSalaryStr");
         annualSalaryStr.appendChild(document.createTextNode(x.getAnnualSalary()));
         oscarElement.appendChild(annualSalaryStr);
         
         Element bonusPercentageStr = document.createElement("bonusPercentageStr");
         bonusPercentageStr.appendChild(document.createTextNode(x.getBonusPercentage()));
         oscarElement.appendChild(bonusPercentageStr);
         
         Element country = document.createElement("country");
         country.appendChild(document.createTextNode(x.getCountry()));
         oscarElement.appendChild(country);
         
         Element city = document.createElement("city");
         city.appendChild(document.createTextNode(x.getCity()));
         oscarElement.appendChild(city);
         
         Element exitDate = document.createElement("exitDate");
         exitDate.appendChild(document.createTextNode(x.getExitDate()));
         oscarElement.appendChild(exitDate);
         

         rootElement.appendChild(oscarElement);
     }

     // Escribir el documento XML en un archivo
     TransformerFactory transformerFactory = TransformerFactory.newInstance();
     Transformer transformer = transformerFactory.newTransformer();
     DOMSource domSource = new DOMSource(document);

     // Cambia la ruta y el nombre del archivo según tus necesidades
     FileWriter fileWriter = new FileWriter(rutaSalida);
     StreamResult streamResult = new StreamResult(fileWriter);

     transformer.transform(domSource, streamResult);

     fileWriter.close();
 }
}


