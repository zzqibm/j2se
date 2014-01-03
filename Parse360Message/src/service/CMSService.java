/*
 */
package service;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.SMS;

/**
 * @���� zhangzhiqiang
 * @����ʱ�� 2013-12-3����03:49:50
 * @��ϵ��ʽ zzq_rj@163.com
 */
public class CMSService {

	public List<SMS> parseXml(String fileName, String nodeName) {
		List<SMS> list = new ArrayList<SMS>();
		NodeList smsList = new ParseXMLFromFileCS(fileName, nodeName)
				.getNodeList();

		Element element = null;
		for (int i = 0; i < smsList.getLength(); i++) {
			SMS sms = new SMS();
			element = (Element) smsList.item(i);

			// ���� Type
			Node typeElement = (Element) element.getElementsByTagName("Type")
					.item(0);
			String type = typeElement.getTextContent();
			sms.setType(type);

			// ��ַAddress
			Element addressElement = (Element) element.getElementsByTagName(
					"Address").item(0);
			String address = addressElement.getTextContent();
			sms.setAddress(address);

			// �շ�ʱ�� Date
			Element dateElement = (Element) element
					.getElementsByTagName("Date").item(0);
			String date = dateElement.getTextContent();
			sms.setCmsTime(date);

			// �������� Body
			Element bodyElement = (Element) element
					.getElementsByTagName("Body").item(0);
			String body = bodyElement.getTextContent();
			sms.setCmsBody(body);
			list.add(sms);

			// type 0 1 ��ʶ�Ǳ��˷��͹���
			// 2 ��ʶ�Ƿ��͸�����
			// <Address>+8613701009680</Address>
			// <Date>2012-06-26 19:18:09</Date>
			// <Body><![CDATA[��˼��]]></Body>

		}

		return list;
	}

	public static void main(String[] args) {
		CMSService cmsService = new CMSService();
		List<SMS> list = cmsService.parseXml("360.xml", "SMS");
		for (int i = 0; i < list.size(); i++) {
			String type = list.get(i).getType();
			if (type.equals("0") || type.equals("1")) {
				System.out.println("�����ˣ�"+list.get(i).getAddress());
				System.out.println("�����ˣ� ��");
			} else {
				System.out.println("�����ˣ� ��");
				System.out.println("�����ˣ�"+list.get(i).getAddress());
			}
			System.out.println("���ڣ�" + list.get(i).getCmsTime());
			System.out.println("���ݣ�" + list.get(i).getCmsBody());
			System.out.println("===================");
		}
	}
}
