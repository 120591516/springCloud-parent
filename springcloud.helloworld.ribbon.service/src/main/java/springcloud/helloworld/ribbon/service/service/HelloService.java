package springcloud.helloworld.ribbon.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	public String getHelloContent() {
		return restTemplate.getForObject("http://PROVIDER-USER/", String.class);
	}
}