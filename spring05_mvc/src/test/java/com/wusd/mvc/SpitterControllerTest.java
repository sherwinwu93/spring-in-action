package com.wusd.thymeleaf;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);

        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller)
                .build();

        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        //构建Repository
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("wusd", "Wusd123..", "Wu", "ShengDong");
        Spitter saved = new Spitter(24L, "wusd", "Wusd123..", "Wu", "ShengDong");
        when(mockRepository.save(unsaved)).thenReturn(saved);

        //构建mockMvc
        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller)
                .build();

        //执行请求
        mockMvc.perform(post("/spitter/register")
                .param("username", "wusd")
                .param("password", "Wusd123..")
                .param("firstName", "Wu")
                .param("lastName", "ShengDong"))
            .andExpect(redirectedUrl("/spitter/wusd"));

        //校验保存情况
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }

}