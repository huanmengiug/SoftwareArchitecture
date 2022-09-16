package Encode.cla.Adapter;

import Encode.cla.Encode;
import Encode.Base64Utils;

public class Base64Adapter extends Base64Utils implements Encode {

    @Override
    public String decodes(String str, byte[] key) {
        try {
            return byteArrayToStr(decode(str));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Base64解密错误");
        }
        return null;
    }

    @Override
    public String encodes(String str) {
        try {
            return encode(str);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Base64加密错误");
        }
        return null;
    }

    @Override
    public Object Keys() {
        return new KeyStore();
    }

    @Override
    public byte[] getKey() {
        return null;
    }



}
