/*
 */
package test;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import service.ParseXMLFromFile;

/**
 * @���� zhangzhiqiang
 * @����ʱ�� 2013-12-3����03:25:54
 * @��ϵ��ʽ zzq_rj@163.com
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
			
			//type 0 1 ��ʶ�Ǳ��˷��͹���
			//2 ��ʶ�Ƿ��͸�����
//			<Address>+8613701009680</Address>
//			<Date>2012-06-26 19:18:09</Date>
			//<Body><![CDATA[��˼��]]></Body>

		}
	}
}
