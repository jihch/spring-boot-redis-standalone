package io.github.jihch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTemplateTest {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private static String KEY = "20230218";

    private static String VALUE = "11:28:00";

    @Test
    public void testSet() {
        redisTemplate.opsForValue().set(KEY, VALUE);
    }

    @Test
    public void testGet() {
        Object o = redisTemplate.opsForValue().get(KEY);
        Assertions.assertEquals(VALUE, o);
    }
}
