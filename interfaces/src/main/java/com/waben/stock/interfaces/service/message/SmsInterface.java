package com.waben.stock.interfaces.service.message;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.waben.stock.interfaces.enums.SmsType;
import com.waben.stock.interfaces.pojo.Response;

/**
 * 短消息 reference服务接口
 *
 * @author luomengan
 */
@FeignClient(name = "message", path = "sms", qualifier = "smsInterface")
public interface SmsInterface {

	/**
	 * 发送短信
	 * 
	 * @param phone
	 *            手机号
	 * @param type
	 *            短信类型 {@link SmsType}
	 */
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public Response<String> send(@RequestParam(name = "phone") String phone, @RequestParam(name = "type") String type);

}
