//package com.haitekuya.sessiontest;
//
//import static org.junit.Assert.assertNotEquals;
//
//import javax.servlet.http.Cookie;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import net.sourceforge.jwebunit.junit.WebTester;
//
//public class SessionRenewServletTest {
//    private WebTester tester;
//
//    @Before
//    public void prepare() {
//        tester = new WebTester();
//        tester.setBaseUrl("http://localhost:8080/session-test");
//    }
//    
//    @Test
//    public void test1() {
//    	String sessionId = "test";
//    	{
//            tester.beginAt("session");
//            tester.assertMatch("Hello World");
//            tester.assertCookiePresent("SESSION");
//            sessionId = ((Cookie) tester.getTestingEngine().getCookies().get(0)).getValue();
//            assertNotEquals(sessionId.length(), 0);
//    	}
//
//    	{
//            tester.gotoPage("session");
//            tester.assertCookieValueEquals("SESSION", sessionId);
//    	}
//
//    	{
//            tester.gotoPage("renew");
//            String sessionId2 = ((Cookie) tester.getTestingEngine().getCookies().get(0)).getValue();
//            assertNotEquals(sessionId2.length(), 0);
//            assertNotEquals(sessionId, sessionId2);
//    	}
//    }
//}