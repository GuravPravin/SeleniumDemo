package com.accenture.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest {
  @Test
  public void loginTest() {
	  boolean ER=true;
	  boolean AR=true;
	  Assert.assertEquals(ER, AR);
  }
  @Test
  public void RegTest() {
	  boolean ER=true;
	  boolean AR=false;
	  Assert.assertEquals(ER, AR);
  }
}
