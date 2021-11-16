package com.cos.blog.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController  //c+s+o
//스프링이 특정 어노테이션이 붙어 있는 클래스 파일들을 new해(Ioc)해서 스프링 컨테이너에서 관리
public class BlogControllerTest {
	
	 //http://localhost:8080/test/hello
	 @GetMapping("/test/hello")
	 public String hello()
	{
		return "<h1>hello spring boot</h1>";
	}
}
