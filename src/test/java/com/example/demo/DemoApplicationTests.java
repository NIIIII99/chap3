package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:application-test.properties")
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
//	WebTestClient webClient;
//
//	public void setup(){
//		webClient=WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
//	}
//
//	@Test
//	public void testWebFluxEndpoint() throws Exception {
//		webClient.get().uri("/")
//				.accept(MediaType.APPLICATION_JSON)
//				.exchange()
//				.expectStatus().isOk()
//				.expectBody(Greet.class).returnResult()
//				.getResponseBody().getMessage().equals("Hello World!");
//	}

}
