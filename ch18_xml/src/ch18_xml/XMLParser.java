package ch18_xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
	// Parse: 해석
	public static void main(String[] args) throws Exception {
		// SAX, DOM 의 두 종류 라이브러리가 있습니다.
		// DOM 한번읽어서 메모리에 객체를 만들어놓고 마음대로 :용량이 제한적 / 접근이 자유로움, 편리 
		// SAX 한줄 읽고 해석 ---  :느림, 순차접근, 불편 / 용량이 제한 x
		
		// Get Document Builder(해석기)
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Build Document
		Document document = builder.parse(new File("customer.xml"));

		// Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();

		// Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());

		// Get all employees
		NodeList nList = document.getElementsByTagName("employee");
		System.out.println("============================");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			System.out.println(""); // Just a separator
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				// Print each employee's detail
				Element eElement = (Element) node;
				System.out.println("Employee id : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastName").item(0).getTextContent());
				System.out.println("Location : " + eElement.getElementsByTagName("location").item(0).getTextContent());
			}
		}
	}
}
