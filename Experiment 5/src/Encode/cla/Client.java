package Encode.cla;

import Encode.cla.Utils.XMLUtil;

public class Client {
    public static void main(String[] args) throws Exception {
        // Encode encode= new Base64Adapter();

        Encode encode = (Encode) XMLUtil.getBean();

        String username = "Miracle Luna";
        String password = "p@sSW0rd";

        System.out.println("====  [原] 用户名/密码  =====");
        System.out.println(username);
        System.out.println(password);

        System.out.println("====  [加密后] 用户名/密码  =====");
        System.out.println(encode.encodes(username));
        System.out.println(encode.encodes(password));

        Object key = encode.Keys();

        System.out.println("====================  密钥  ===========================");
        System.out.println(key.toString());

        System.out.println("\n==== [解密后] 用户名/密码 =====");
        System.out.println(encode.decodes(encode.encodes(username), encode.getKey()));
        System.out.println(encode.decodes(encode.encodes(password), encode.getKey()));

    }

}