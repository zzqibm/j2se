/*
 */
package model;

import java.util.HashMap;

/**
 * @���� zhangzhiqiang
 * @����ʱ�� 2013-12-3����03:47:35
 * @��ϵ��ʽ zzq_rj@163.com
 */
public class SMS {

	public static HashMap<String, String> smsMap = new HashMap<String, String>();
	static {
		smsMap.put("0", "������: ");
		smsMap.put("1", "������: ");
		smsMap.put("2", "�����ˣ�");
	}
	private String type;
	private String typeName;
	private String sender;
	private String receiver;
	private String address;
	private String cmsTime;
	private String cmsBody;

	/**
	 * ��ȡ type
	 * 
	 * @return ���� type
	 */
	public String getType() {
		return type;
	}

	/**
	 * ���� type
	 * 
	 * @param ��type���и�ֵ
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * ��ȡ typeName
	 * 
	 * @return ���� typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * ���� typeName
	 * 
	 * @param ��typeName���и�ֵ
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * ��ȡ address
	 * 
	 * @return ���� address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * ���� address
	 * 
	 * @param ��address���и�ֵ
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * ��ȡ cmsTime
	 * 
	 * @return ���� cmsTime
	 */
	public String getCmsTime() {
		return cmsTime;
	}

	/**
	 * ���� cmsTime
	 * 
	 * @param ��cmsTime���и�ֵ
	 */
	public void setCmsTime(String cmsTime) {
		this.cmsTime = cmsTime;
	}

	/**
	 * ��ȡ cmsBody
	 * 
	 * @return ���� cmsBody
	 */
	public String getCmsBody() {
		return cmsBody;
	}

	/**
	 * ���� cmsBody
	 * 
	 * @param ��cmsBody���и�ֵ
	 */
	public void setCmsBody(String cmsBody) {
		this.cmsBody = cmsBody;
	}

	/**
	 * ��ȡ sender
	 * @return ���� sender
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * ���� sender
	 * @param ��sender���и�ֵ
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * ��ȡ receiver
	 * @return ���� receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * ���� receiver
	 * @param ��receiver���и�ֵ
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
