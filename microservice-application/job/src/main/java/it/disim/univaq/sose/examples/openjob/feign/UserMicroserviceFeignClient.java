package it.disim.univaq.sose.examples.openjob.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.JsonNode;

@FeignClient("user-microservice")
public interface UserMicroserviceFeignClient {

	@RequestMapping(method=RequestMethod.GET, value="user/username/{username}")
	public JsonNode findUserByUsername(@PathVariable String username);
}
