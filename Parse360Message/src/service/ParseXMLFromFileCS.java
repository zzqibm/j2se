package service;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 */
public class ParseXMLFromFileCS {

	private String fileName;
	private String nodeName;
	private String rootNodeName;

	private NodeList nodeList;

	public ParseXMLFromFileCS(String fileName, String nodeName) {
		this.fileName = fileName;
		this.nodeName = nodeName;
		inital();
	}

	public void inital() {
		try {
			File file = new File(fileName);
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = dbfactory.newDocumentBuilder();
			Document doc = builder.parse(file);
			Element root = doc.getDocumentElement();
			nodeList = root.getElementsByTagName(nodeName);// AppConstants.ROOT_NODE="Subjects"
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public NodeList getNodeList() {
		return this.nodeList;
	}
}
