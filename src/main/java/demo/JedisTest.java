package demo;

import redis.clients.jedis.Jedis;

/**
 * @author wangchunji
 */
public class JedisTest {
    public static void runTest() {
        //创建jedis实例，连接本地redis服务
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println("连接成功");

        //查看服务是否正在运行
        System.out.println("服务正在运行：" + jedis.ping());

    }
}
