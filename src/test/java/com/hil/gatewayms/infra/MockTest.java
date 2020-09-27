package com.hil.gatewayms.infra;

import org.springframework.web.client.RestTemplate;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MockTest {

    private RestTemplate restTemplate;

    @BeforeClass
    void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void shouldFailForMissingToken() {
    }

    @BeforeTest
    public void beforeEachTest() {
        System.out.println("Executed before each test");
    }

    @AfterTest
    public void afterEachTest() {
        System.out.println("Executed after each test");
    }

    @BeforeGroups("mock_read_all_from_db")
    public void beforeGroupReadAll() {
    }

    @Test(groups = "mock_read_all_from_db")
    public void testAllProductsEndpoint() {
    }
}