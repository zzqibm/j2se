/*
 */
package test;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import service.ParseXMLFromFile;

/**
 * @作者 zhangzhiqiang
 * @创建时间 2013-12-3下午03:25:54
 * @联系方式 zzq_rj@163.com
 */
public class TestXml {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		NodeList algorithmsList = ParseXMLFromFile.getInstance().getNodeList();

		Element element = null;
		for (int i = 0; i < algorithmsList.getLength(); i++) {

			element = (Element) algorithmsList.item(i);
			Node singleElement = (Element) element
			.getElementsByTagName("Type").item(0);
			String type =singleElement.getTextContent();
			System.out.println(type);
			
			//type 0 1 标识是别人发送过来
			//2 标识是发送给别人
//			<Address>+8613701009680</Address>
//			<Date>2012-06-26 19:18:09</Date>
			//<Body><![CDATA[姜思宪]]></Body>

		}
	}
}
