package test.wxx.com.redis_sample.other;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.Jedis;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestRedisdemoApplication.class)
public class JedisTest {

	@Autowired
	private StringRedisTemplate template;

	@Test
	public void testJedisHelloWorld() {
		Jedis jedis = new Jedis("192.168.169.100");
		String keys = "name";

		// 删数据
		jedis.del(keys);
		// 存数据
		jedis.set(keys, "wangxiaoxi");
		// 取数据
		String value = jedis.get(keys);

		System.out.println(value);
		jedis.close();
	}

	@Test
	public void testJedisTemplate() {
		String key = "test-add";
		String value = "hello";
		template.opsForValue().set(key, value);
		assertEquals(value, template.opsForValue().get(key));
	}

}