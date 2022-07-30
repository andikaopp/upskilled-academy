package com.javainuse.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin()
public class HelloWorldController {

	public static Object getBearerTokenHeader() {
		String strBearerToken = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getHeader("Authorization");
		String[] chunk = strBearerToken.split(" ");
		String[] arrToken = chunk[1].split("\\.");

		Base64.Decoder decoder = Base64.getUrlDecoder();

		String header = new String(decoder.decode(arrToken[0]));
		String payload = new String(decoder.decode(arrToken[1]));
		payload = payload.substring(1, payload.length()-1);
		String[] keyValuePairs = payload.split(",");
		Map<String,String> map = new HashMap<>();

		for(String pair : keyValuePairs)
		{
			String[] entry = pair.split(":");
			map.put(entry[0].replace("\"",""), entry[1].replace("\"",""));
		}
		String phone = map.get("sub");
		Map<String, Object> phoneObj = new HashMap<String, Object>();
		phoneObj.put("phone", phone);

		Map<String, Object> res = new HashMap<String, Object>();
		res.put("data", phoneObj);
		return res;
	}

	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}

	@RequestMapping({ "/v2/auth/info" })
	public Object hellobro() {
		return getBearerTokenHeader();
	}

}
