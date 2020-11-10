package Test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Demo {
	public static void main(String[] args) {
		try {
			File archivo = new File("src/Recursos/Animes.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();
			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			System.out.println("==============================");
			NodeList listaEmpleados = document.getElementsByTagName("Anime");
			for (int temp = 0; temp < listaEmpleados.getLength(); temp++) {
				Node nodo = listaEmpleados.item(temp);
				System.out.println("Elemento:" + nodo.getNodeName());
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) nodo;
					System.out.println("id: " + element.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("Nombre: " + element.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("Numero Capitulos : "+element.getElementsByTagName("num_chapters").item(0).getTextContent());
					System.out.println("==============================");
				}
			}
			System.out.println("==============================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
