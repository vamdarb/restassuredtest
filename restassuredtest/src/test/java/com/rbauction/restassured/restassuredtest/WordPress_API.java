package com.rbauction.restassured.restassuredtest;

import org.junit.Test;
import org.junit.Before;
import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.baseURI;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class WordPress_API {
	
//	static com.jayway.restassured.RestAssured.baseURI = "http://localhost:54860/";

	@Test
	public void simpleExample(){
		expect().body("title",equalTo("Hello Vamsi!")).when().get("http://localhost:54860/wp-json/posts/1");
	}
}
