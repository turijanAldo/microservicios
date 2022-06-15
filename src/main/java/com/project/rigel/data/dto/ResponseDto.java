package com.project.rigel.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Notation that creates default setters for all attributes in class.
 *
 * @param <attribute> the new <value>
 */
@Setter

/**
 * Notation that creates default getters for all attributes in class.
 *
 * @return the <value> for the <attribute>
 */
@Getter

/**
 * Instantiates a new response.
 *
 * @param timestamp the timestamp
 * @param data the data
 */
@AllArgsConstructor

/**
 * Instantiates a new response.
 */
@NoArgsConstructor
public class ResponseDto<T> extends SuperObject {

  /** The message. */
  private String message;

  /** The timestamp. */
  private String timestamp;

  /** The data. */
  private T data;

  /** The details. */
  private String details;
}
