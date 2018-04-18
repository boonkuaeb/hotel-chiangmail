package com.ascendcorp.ctaworkshop.hotelchiangmai.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by Thanakornthanprasit on 17/4/2018 AD.
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
public class HelloWorldControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private HelloWorldController helloWorldController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
    }

    @Test
    public void testHelloWorldController() {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
                .get("/")
                .contentType(MediaType.APPLICATION_JSON);

        try {
            this.mockMvc.perform(builder)
                    .andExpect(MockMvcResultMatchers.content().string("Greetings from Spring Boot! jaaa"))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
