package com.wbr.pages;

import org.apache.tapestry5.annotations.PageActivationContext;

public class About
{
  @PageActivationContext
  private String learn;


  public String getLearn() {
    return learn;
  }

  public void setLearn(String learn) {
    this.learn = learn;
  }
  
  private void test() {
	  System.out.println("test!!1");
	  System.out.println("test!!123");
  }
}
