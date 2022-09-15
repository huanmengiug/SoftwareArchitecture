package Encode.cla.Utils;

import java.security.*;
import java.security.interfaces.*;
import java.security.spec.*;

import javax.crypto.*;

/**
 *
 * @author qing
 */
public class RsaUtils {
    public static String RSA_ALGORITHM = "RSA";

    /**
     * 密钥长度必须是64的倍数，在512到65536位之间
     */
    private static final int KEY_SIZE = 2048;

    public static void main(String[] args) throws Exception {
        String password = "1234abcd5678";
        KeyStore keys = createKeys();
        byte[] publicKey = getPublicKey(keys);
        byte[] privateKey = getPrivateKey(keys);
        System.out.println("公钥：" + Base64Utils.encode(publicKey));
        System.out.println("私钥：" + Base64Utils.encode(privateKey));

        byte[] encryptByPublicKey = encryptByPublicKey(password.getBytes(), publicKey);
        System.out.println("使用公钥加密后的数据：" + Base64Utils.encode(encryptByPublicKey));

        byte[] decryptByPrivateKey = decryptByPrivateKey(encryptByPublicKey, privateKey);
        System.out.println("使用私钥解密后的数据：" + new String(decryptByPrivateKey));

    }

    /**
     * 生成密钥对
     * 
     * @return 密钥对对象
     * @throws NoSuchAlgorithmException
     */
    public static KeyStore createKeys() throws NoSuchAlgorithmException {
        // KeyPairGenerator用于生成公钥和私钥对。密钥对生成器是使用 getInstance 工厂方法
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        keyPairGenerator.initialize(KEY_SIZE);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        KeyStore keyStore = new KeyStore(publicKey, privateKey);
        return keyStore;
    }

    /**
     * 获取私钥
     * 
     * @param keyStore
     * @return
     */
    public static byte[] getPrivateKey(KeyStore keyStore) {
        return ((RSAPrivateKey) keyStore.privateKey).getEncoded();
    }

    /**
     * 获取公钥
     * 
     * @param keyStore
     * @return
     */
    public static byte[] getPublicKey(KeyStore keyStore) {
        return ((RSAPublicKey) keyStore.publicKey).getEncoded();
    }

    /**
     * 私钥加密
     * 
     * @param data
     *            待加密数据
     * @param key
     *            密钥
     * @return byte[] 加密数据
     */
    public static byte[] encryptByPrivateKey(byte[] data, byte[] key) throws Exception {

        // 取得私钥
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        // 生成私钥
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    /**
     * 公钥加密
     * 
     * @param data
     * @param key
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws NoSuchPaddingException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws InvalidKeyException
     */
    public static byte[] encryptByPublicKey(byte[] data, byte[] key) throws NoSuchAlgorithmException,
            InvalidKeySpecException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException,
            InvalidKeyException {
        // 实例化密钥工厂
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        // 初始化公钥,根据给定的编码密钥创建一个新的 X509EncodedKeySpec。
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key);
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        // 数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data);
    }

    /**
     * 私钥解密
     * 
     * @param data
     *            待解密数据
     * @param key
     *            密钥
     * @return byte[] 解密数据
     */
    public static byte[] decryptByPrivateKey(byte[] data, byte[] key) throws Exception {
        // 取得私钥
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(key);
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        // 生成私钥
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8KeySpec);
        // 数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(data);
    }

    /**
     * 公钥解密
     * 
     * @param data
     *            待解密数据
     * @param key
     *            密钥
     * @return byte[] 解密数据
     */
    public static byte[] decryptByPublicKey(byte[] data, byte[] key) throws Exception {

        // 实例化密钥工厂
        KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
        // 初始化公钥
        // 密钥材料转换
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(key);
        // 产生公钥
        PublicKey pubKey = keyFactory.generatePublic(x509KeySpec);
        // 数据解密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, pubKey);
        return cipher.doFinal(data);
    }

    // 定义密钥类
    public static class KeyStore {
        private Object publicKey;
        private Object privateKey;

        public KeyStore(RSAPublicKey publicKey2, RSAPrivateKey privateKey2) {
            this.publicKey = publicKey2;
            this.privateKey = privateKey2;
        }

        public KeyStore(byte[] publicKey, byte[] privateKey) {
            this.publicKey = publicKey;
            this.privateKey = privateKey;
        }

        public String toString() {
            if (this.publicKey instanceof byte[] && this.privateKey instanceof byte[]) {
                byte[] pub = (byte[]) this.publicKey;
                byte[] priv = (byte[]) this.privateKey;
                String str;
                try {
                    str = "公钥：" + Base64Utils.encode(pub) + "\n 私钥：" + Base64Utils.encode(priv);
                } catch (Exception e) {
                    e.printStackTrace();
                    str = "ERROR";
                }
                return str;
            } else {
                return "密钥未初始化！";
            }

        }
    }

}
