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
    // comment here
  }
  
  private void test() {
	  System.out.println("test");
  }
}
