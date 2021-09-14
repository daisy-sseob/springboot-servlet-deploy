package me.sseob.springbootdemojsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
war packaging으로 spring boot를 만들면
ServletInitailizer를 생성하게된다. tomcat에 배포하는 형태로 사용하게 될경우 SpringBootApplication을 사용하지 않고
이 Class를 사용하게 된다.
*/
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootDemoJspApplication.class);
	}
}
