/*
 */
package model;

import java.util.HashMap;

/**
 * @作者 zhangzhiqiang
 * @创建时间 2013-12-3下午03:47:35
 * @联系方式 zzq_rj@163.com
 */
public class SMS {

	public static HashMap<String, String> smsMap = new HashMap<String, String>();
	static {
		smsMap.put("0", "发信人: ");
		smsMap.put("1", "发信人: ");
		smsMap.put("2", "收信人：");
	}
	private String type;
	private String typeName;
	private String sender;
	private String receiver;
	private String address;
	private String cmsTime;
	private String cmsBody;

	/**
	 * 获取 type
	 * 
	 * @return 返回 type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置 type
	 * 
	 * @param 对type进行赋值
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取 typeName
	 * 
	 * @return 返回 typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * 设置 typeName
	 * 
	 * @param 对typeName进行赋值
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * 获取 address
	 * 
	 * @return 返回 address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置 address
	 * 
	 * @param 对address进行赋值
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取 cmsTime
	 * 
	 * @return 返回 cmsTime
	 */
	public String getCmsTime() {
		return cmsTime;
	}

	/**
	 * 设置 cmsTime
	 * 
	 * @param 对cmsTime进行赋值
	 */
	public void setCmsTime(String cmsTime) {
		this.cmsTime = cmsTime;
	}

	/**
	 * 获取 cmsBody
	 * 
	 * @return 返回 cmsBody
	 */
	public String getCmsBody() {
		return cmsBody;
	}

	/**
	 * 设置 cmsBody
	 * 
	 * @param 对cmsBody进行赋值
	 */
	public void setCmsBody(String cmsBody) {
		this.cmsBody = cmsBody;
	}

	/**
	 * 获取 sender
	 * @return 返回 sender
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * 设置 sender
	 * @param 对sender进行赋值
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * 获取 receiver
	 * @return 返回 receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * 设置 receiver
	 * @param 对receiver进行赋值
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
