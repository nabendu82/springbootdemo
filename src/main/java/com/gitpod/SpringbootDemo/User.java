package com.gitpod.SpringbootDemo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class User implements Serializable {
  private String zipcode;

  private String suite;

  private String city;

  private String street;

  private String name;

  private Integer id;

  private String email;

  private String username;

  public String getZipcode() {
    return this.zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getSuite() {
    return this.suite;
  }

  public void setSuite(String suite) {
    this.suite = suite;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
