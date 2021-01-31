package com.example.demo;

import com.example.demo.test.DemoController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
    @Autowired
    private DemoController demoController;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(demoController).build();
    }

    @Test
    public void demo() throws Exception {
        System.out.println("start test !!!!!!!!");

        mockMvc.perform(MockMvcRequestBuilders.get("/test1"));

        System.out.println("end test !!!!!!!!!!");
    }

}
