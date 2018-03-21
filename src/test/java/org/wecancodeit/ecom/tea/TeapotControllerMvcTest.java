package org.wecancodeit.ecom.tea;

import static org.springframework.http.HttpStatus.I_AM_A_TEAPOT;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TeapotController.class)
public class TeapotControllerMvcTest {

	@Resource
	private MockMvc mvc;

	@Test
	public void shouldNotMakeCoffee() throws Exception {
		mvc.perform(get("/teapot/coffee")).andExpect(status().is(I_AM_A_TEAPOT.value()));
	}
}
