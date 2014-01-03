package service;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 */
public class ParseXMLFromFile {
	NodeList nodeList = null;
	File file = new File("360.xml");
	long modifyTime = 0;
	private static final ParseXMLFromFile pxmlInstan = new ParseXMLFromFile();

	private ParseXMLFromFile() {
		inital();
	}

	public static ParseXMLFromFile getInstance() {
		return pxmlInstan;
	}

	public void inital() {
		try {
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = dbfactory.newDocumentBuilder();
			Document doc = builder.parse(file);
			
			modifyTime = file.lastModified();
			Element root = doc.getDocumentElement();
			nodeList = root.getElementsByTagName("SMS");// AppConstants.ROOT_NODE="Subjects"
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateNodeList() {
		if (file.lastModified() != modifyTime)
			inital();
	}

	public NodeList getNodeList() {
		updateNodeList();
		return this.nodeList;
	}
}
