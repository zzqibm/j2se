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
 * @作者 zhangzhiqiang
 * @创建时间 2013-12-3下午03:49:50
 * @联系方式 zzq_rj@163.com
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

			// 类型 Type
			Node typeElement = (Element) element.getElementsByTagName("Type")
					.item(0);
			String type = typeElement.getTextContent();
			sms.setType(type);

			// 地址Address
			Element addressElement = (Element) element.getElementsByTagName(
					"Address").item(0);
			String address = addressElement.getTextContent();
			sms.setAddress(address);

			// 收发时间 Date
			Element dateElement = (Element) element
					.getElementsByTagName("Date").item(0);
			String date = dateElement.getTextContent();
			sms.setCmsTime(date);

			// 短信内容 Body
			Element bodyElement = (Element) element
					.getElementsByTagName("Body").item(0);
			String body = bodyElement.getTextContent();
			sms.setCmsBody(body);
			list.add(sms);

			// type 0 1 标识是别人发送过来
			// 2 标识是发送给别人
			// <Address>+8613701009680</Address>
			// <Date>2012-06-26 19:18:09</Date>
			// <Body><![CDATA[姜思宪]]></Body>

		}

		return list;
	}

	public static void main(String[] args) {
		CMSService cmsService = new CMSService();
		List<SMS> list = cmsService.parseXml("360.xml", "SMS");
		for (int i = 0; i < list.size(); i++) {
			String type = list.get(i).getType();
			if (type.equals("0") || type.equals("1")) {
				System.out.println("发信人："+list.get(i).getAddress());
				System.out.println("收信人： 我");
			} else {
				System.out.println("发信人： 我");
				System.out.println("收信人："+list.get(i).getAddress());
			}
			System.out.println("日期：" + list.get(i).getCmsTime());
			System.out.println("内容：" + list.get(i).getCmsBody());
			System.out.println("===================");
		}
	}
}
