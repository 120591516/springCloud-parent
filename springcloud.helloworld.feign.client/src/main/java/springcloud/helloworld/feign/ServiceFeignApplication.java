package springcloud.helloworld.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @SpringCloudApplication 包含	//@SpringBootApplication
 * 								//@EnableDiscoveryClient
 */
//@SpringBootApplication
//@EnableDiscoveryClient
@SpringCloudApplication
@EnableFeignClients //声明fegin的客户端
public class ServiceFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}