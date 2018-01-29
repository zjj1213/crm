package com.zking.crm.util;

import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.codehaus.jackson.JsonEncoding;
//import org.codehaus.jackson.JsonGenerator;
//import org.codehaus.jackson.map.ObjectMapper;

/**
 * JSON工具类
 * 
 */
public class JsonUtils {
	private static ObjectMapper objectMapper = new ObjectMapper();

	static {

	}

	/**
	 * Java->Json
	 * 
	 * @param os
	 * @param value
	 */
	public static void writeValue(OutputStream os, Object value) {
		try {
			JsonGenerator jsonGenerator = objectMapper.getJsonFactory()
					.createJsonGenerator(os, JsonEncoding.UTF8);
			jsonGenerator.writeObject(value);
			if (jsonGenerator != null) {
				jsonGenerator.flush();
			}
			if (!jsonGenerator.isClosed()) {
				jsonGenerator.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Json->Java
	 * 
	 * @param os
	 * @param value
	 */
	public static Object readValue(String json, Class<?> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
