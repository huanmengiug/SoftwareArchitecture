package Encode.cla;

public interface Encode {

    public String decodes(String str,byte[] key);//解密

    public String encodes(String str);//加密

    public Object Keys();//返回密钥

    public byte[] getKey();
    
}
