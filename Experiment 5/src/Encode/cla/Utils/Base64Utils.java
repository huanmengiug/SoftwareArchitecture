package Encode.cla.Utils;

import org.apache.commons.codec.binary.Base64;
import java.nio.charset.StandardCharsets;

/**
 * 
 * commons.codec.BASE64编码解码工具包
 * 依赖javabase64-1.3.1.jar
 *
 * @author IceWee
 * @date 2015-5-19
 * @version 1.0
 */
public class Base64Utils {
    
    public static String byteArrayToStr(byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        String str = new String(byteArray);
        return str;
    }

    /**
     * BASE64字符串解码为二进制数据
     *
     * @param base64
     * @return
     * @throws Exception
     */
    public static byte[] decode(String str) throws Exception {

        return Base64.decodeBase64(str.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 
     * 二进制数据编码为BASE64字符串
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String encode(byte[] bytes) throws Exception {
        return new String(Base64.encodeBase64Chunked(bytes));
    }

    /**
     * 给字符串加密
     * 
     * @param text
     * @return
     * @throws Exception
     */
    public static String encode(String text) throws Exception {
        byte[] textByte = text.getBytes(StandardCharsets.UTF_8);
        return new String(Base64.encodeBase64Chunked(textByte));
    }
    // 定义密钥类
    public static class KeyStore {
        public String toString(){
            return "Base64无密钥";
        }
    }
    

    public static void main(String[] args) throws Exception {

        String username = "Miracle Luna";
        String password = "p@sSW0rd";

        // 加密
        System.out.println("====  [加密后] 用户名/密码  =====");
        System.out.println(Base64Utils.encode(username));
        System.out.println(Base64Utils.encode(password));

        // 解密
        System.out.println("\n====  [解密后] 用户名/密码  =====");
        System.out.println(byteArrayToStr(Base64Utils.decode(Base64Utils.encode(username))));
        System.out.println(byteArrayToStr(Base64Utils.decode(Base64Utils.encode(password))));
    }
}
