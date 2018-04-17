package com.ascendcorp.ctaworkshop.hotelchiangmai.controller;

import com.ascendcorp.ctaworkshop.hotelchiangmai.entity.Room;
import com.ascendcorp.ctaworkshop.hotelchiangmai.service.RoomService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by Thanakornthanprasit on 17/4/2018 AD.
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
public class RoomControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private RoomController roomController;

    @Mock
    private RoomService mockRoomService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(roomController).build();
    }

    @Test
    public void TestGetAllRoomController() {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
                .get("/room")
                .contentType(MediaType.APPLICATION_JSON);

        List<Room> mockRoomList = new ArrayList<>();
        Room mockRoom = new Room();
        mockRoom.setName("test");
        mockRoomList.add(mockRoom);
        when(mockRoomService.listAll()).thenReturn(mockRoomList);

        try {
            this.mockMvc.perform(builder)
                    .andExpect(MockMvcResultMatchers.jsonPath("$[0].name",org.hamcrest.Matchers.is("test")))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
