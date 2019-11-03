package springcloud.helloworld.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//调用服务提供者
@FeignClient(value = "PROVIDER-USER")
public interface HelloWorldService {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String sayHello();

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	String hello(@PathVariable("name") String name);
}
