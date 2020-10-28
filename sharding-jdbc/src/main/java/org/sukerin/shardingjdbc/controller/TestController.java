package org.sukerin.shardingjdbc.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

/**
 * @author sukerin
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("ip_port")
    public String getIpPort() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
//        System.out.println("Local HostAddress: "+addr.getHostAddress());
//        String hostname = addr.getHostName();
//        System.out.println("Local host name: "+hostname);
        return addr.toString()+":"+serverPort;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String seed="48";
        //用默认字符编码解码字符串。
        byte[] bs = seed.getBytes();
        //用新的字符编码生成字符串
        seed= new String(bs, StandardCharsets.UTF_8);
//
//        System.out.println(DigestUtils.md2Hex(seed));
        int i=0;
        while (i<100000000){
            seed=DigestUtils.md2Hex(seed);
            i++;
        }


//        int i=0;
//        while (i<100){
//            digest= md.digest(digest);
//            i++;
//        }
//        System.out.println(new String(digest, StandardCharsets.UTF_8));
//        // 获取二进制十六进制互转工具
//        HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
//        // 将二进制数组转换为十六进制字符串
//        String marshal = hexBinaryAdapter.marshal(digest);
//        // 输出结果
//        System.out.println(marshal);

    }
}
