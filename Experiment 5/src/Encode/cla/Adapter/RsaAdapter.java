package Encode.cla.Adapter;

import Encode.cla.Encode;
import Encode.cla.Utils.Base64Utils;
import Encode.cla.Utils.RsaUtils;

public class RsaAdapter extends RsaUtils implements Encode {

    private static byte[] publicKey;
    private static byte[] privateKey;

    @Override
    public String decodes(String str) {
        return null;
    }

    @Override
    public String decodes(String str,byte[] key) {
        byte[] encryptByPublicKey;
        try {
            encryptByPublicKey = Base64Utils.decode(str);
            byte[] decryptByPrivateKey = decryptByPrivateKey(encryptByPublicKey, key);
            return new String(decryptByPrivateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String encodes(String str) {
        try {
            Keys();
            byte[] encryptByPublicKey = encryptByPublicKey(str.getBytes(), publicKey);
            return Base64Utils.encode(encryptByPublicKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object Keys() {

        try {
            if (publicKey==null && publicKey==null){
                KeyStore keys = createKeys();
                publicKey = getPublicKey(keys);
                privateKey = getPrivateKey(keys);
                return new KeyStore(publicKey, privateKey);
            }
            else{
                return new KeyStore(publicKey, privateKey);
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
