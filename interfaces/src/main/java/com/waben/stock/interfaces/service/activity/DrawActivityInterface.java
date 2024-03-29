package com.waben.stock.interfaces.service.activity;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waben.stock.interfaces.dto.activity.DrawActivityDto;
import com.waben.stock.interfaces.dto.activity.TicketAmountDto;
import com.waben.stock.interfaces.pojo.Response;

@FeignClient(name = "activity", path = "drawactivity", qualifier = "drawActivityInterface")
public interface DrawActivityInterface {

	@RequestMapping(value = "/draw/{activityId}/{publisherId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	Response<TicketAmountDto> draw(@PathVariable("activityId") long activityId,
			@PathVariable("publisherId") long publisherId);

	@RequestMapping(value = "/getDrawActicity/{activityId}/{publisherId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	Response<DrawActivityDto> getDrawActicity(@PathVariable("activityId") long activityId,
			@PathVariable("publisherId") long publisherId);

}
