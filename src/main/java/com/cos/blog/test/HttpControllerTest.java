package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HttpControllerTest {
	
	private static final String TAG="HttpControllerTest : ";
	
	//localhost:8000/blog/http/lombok
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = new Member(1,"ssar","1234","email");
		System.out.println(TAG+"getter : "+m.getId());
		m.setId(1000);
		System.out.println(TAG+"setter : "+m.getId());
		return "lombok test complete";
	}
	
	//@controller로 해야됨
	@GetMapping("/http/jsp")
	public String httpJsp() {
		return "test";
	}
	

	//인터넷 브라우저 요청은 only get
	//http://localhost:8080/http/get - select
	@GetMapping("/http/get")
	public String getTest(Member m) {
	return "get요청: " + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() ;
	}
	//http://localhost:8080/http/post - insert
	@PostMapping("/http/post") //text/plain, application/json
	public String postTest(@RequestBody Member m) {
	return "post요청" + + m.getId() + ", " + m.getUsername() + ", " + m.getPassword() +","+ m.getEmail();
	}
	//http://localhost:8080/http/put - update
	@PutMapping("/http/put")
	public String putTest() {
	return "put요청";
	}
	//http://localhost:8080/http/delete - delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
	return "delete요청";
	}
}
