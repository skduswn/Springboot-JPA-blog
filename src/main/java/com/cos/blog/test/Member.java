package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {

	//final db에서 가져온 값 변경안하니까 final
	private  int id;
	private  String username;
	private  String password;
	private  String  email;
}
