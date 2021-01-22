package edu.xau.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThirdPartyApplicationTests {
    @Autowired
    OSS ossClient;

    @Test
    public void testUpload() {
        // 上传文件流。
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\biZhi\\4.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ossClient.putObject("yb-gulimall-2021", "Desktop3.jpg", inputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
    }
    @Test
 public    void contextLoads() {
    }

}
