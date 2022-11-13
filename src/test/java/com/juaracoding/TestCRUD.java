package com.juaracoding;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCRUD {

	@Test()
	public void testGet() {
		//
		JSONObject request = new JSONObject();
		request.put("name", "John");
		request.put("job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(201)
		.log().all();
	}
	
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "John");
		request.put("job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "John");
		request.put("job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void testDelete() {
		
		when()
		.delete("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(204)
		.log().all();
		
	}
	
}
