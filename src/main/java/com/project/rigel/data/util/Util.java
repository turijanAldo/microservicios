package com.project.rigel.data.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.rigel.data.dto.ResponseDto;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * The Class Util.
 */
@Getter
@Component
public class Util {

	  public String getTimestamp() {
		    return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		  }

		  /**
		   * Sets response data.
		   *
		   * @param <T> the generic type
		   * @param data the data
		   * @param message the message
		   * @param details the details
		   * @return the response
		   */
		  public <T> ResponseDto<T> setDataResponse(T data, String message, String details) {
		    ResponseDto<T> response = new ResponseDto<>();

		    response.setTimestamp(getTimestamp());
		    response.setData(data);
		    response.setMessage(message);
		    response.setDetails(details);

		    return response;
		  }

}
