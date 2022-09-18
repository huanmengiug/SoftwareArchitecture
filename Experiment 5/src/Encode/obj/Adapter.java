package Encode.obj;

import Encode.RsaUtils;
import Encode.Base64Utils;

public class Adapter implements Encode {

    private final String fit;
    private static byte[] publicKey;
    private static byte[] privateKey;

    private RsaUtils rsaUtils;
    private Base64Utils base64Utils;

    public Adapter(Object adaptee) {
        String s;
        try {
            rsaUtils = (RsaUtils) adaptee;
            System.out.println("======================+Rsa加密+================================");
            s = "Rsa";
        } catch (Exception e) {
            base64Utils = (Base64Utils) adaptee;
            System.out.println("======================+Base64编码+================================");
            s = "Base64";
            e.printStackTrace();
        }
        this.fit = s;
    }

    @Override
    public String decodes(String str, byte[] key) {
        if (fit.equals("Base64")) {
            try {
                return Base64Utils.byteArrayToStr(Base64Utils.decode(str));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Base64解密错误");
            }
        } else if (fit.equals("Rsa")) {
            byte[] encryptByPublicKey;
            try {
                encryptByPublicKey = Base64Utils.decode(str);
                byte[] decryptByPrivateKey = RsaUtils.decryptByPrivateKey(encryptByPublicKey, key);
                return new String(decryptByPrivateKey);
            } catch (Exception e) {
                System.out.println("Rsa解密错误");
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String encodes(String str) {
        if (fit.equals("Base64")) {
            try {
                return Base64Utils.encode(str);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Base64加密错误");
            }
        } else if (fit.equals("Rsa")) {
            try {
                Keys();
                byte[] encryptByPublicKey = RsaUtils.encryptByPublicKey(str.getBytes(), publicKey);
                return Base64Utils.encode(encryptByPublicKey);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Object Keys() {
        if (fit.equals("Base64")) {
            return new Base64Utils.KeyStore();
        } else if (fit.equals("Rsa")) {
            try {
                if (publicKey == null && publicKey == null) {
                    RsaUtils.KeyStore keys = RsaUtils.createKeys();
                    publicKey = RsaUtils.getPublicKey(keys);
                    privateKey = RsaUtils.getPrivateKey(keys);
                    return new RsaUtils.KeyStore(publicKey, privateKey);
                } else {
                    return new RsaUtils.KeyStore(publicKey, privateKey);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public byte[] getKey() {
        if (fit.equals("Base64")) {

        } else if (fit.equals("Rsa")) {
            return privateKey;
        }
        return null;
    }

}
