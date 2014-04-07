package com.lcxbox.netloader.model;
/**
 * 内容与lcxl_net_code.h同步
 * @author lcxl
 *
 */
public class LcxlNetCode {

	public final static String JSON_CODE = "code";
	public final static int JC_NONE = 0x00;
	/**
	 * 获取模块列表命令
	 */
	public final static int JC_MODULE_LIST = 0x01;
	/**
	 * 获取服务器列表
	 */
	public final static int JC_SERVER_LIST = 0x03;
	/**
	 * 设置虚拟IP地址
	 */
	public final static int JC_SET_VIRTUAL_ADDR = 0x04;

	/**
	 * 设置负载均衡器的mac地址
	 */
	public final static int JC_SET_ROUTER_MAC_ADDR = 0x05;

	
	public final static String JSON_DATA = "data";
	public final static String JSON_MODULE_LIST = "module_list";
	public final static String JSON_SERVER_LIST = "server_list";
	public final static String JSON_MINIPORT_NET_LUID = "miniport_net_luid";

	public final static String JSON_STATUS ="status";
	public final static int JS_SUCCESS =0x00;
	public final static int JS_FAIL =0x01;
	public final static int JS_JSON_DATA_NOT_FOUND =0x02;
	public final static int JS_JSON_CODE_NOT_FOUND =0x03;
	public final static int JS_JSON_CODE_IP_FORMAT_INVALID =0x04;
}
