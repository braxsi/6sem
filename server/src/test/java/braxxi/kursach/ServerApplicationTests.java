package braxxi.kursach;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class ServerApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testJspWithEl() throws Exception {
//		ResponseEntity<String> entity = this.restTemplate.getForEntity("/", String.class);
//		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
//		assertThat(entity.getBody()).contains("/resources/text.txt");
	}

}
