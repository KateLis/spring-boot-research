package com.spring.boot.research.controller;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
public class BookControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldReturnPersonWithSpecifiedId() throws Exception {
        mvc.perform(get("/book/id/2"))
                .andExpect(status().isOk())
                .andExpect(
                        content().string(containsString("Klara")));
    }
}
