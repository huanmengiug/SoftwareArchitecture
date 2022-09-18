package Encode.obj;



public class Client {
    public static void main(String[] args) throws Exception {

        Object obj = XMLUtil.getBean();


        Adapter adapter = new Adapter( obj );
        


        String username = "Miracle Luna";
        String password = "p@sSW0rd";

        System.out.println("====  [原] 用户名/密码  =====");
        System.out.println(username);
        System.out.println(password);

        System.out.println("====  [加密后] 用户名/密码  =====");
        System.out.println(adapter.encodes(username));
        System.out.println(adapter.encodes(password));

        Object key = adapter.Keys();

        System.out.println("====================  密钥  ===========================");
        System.out.println(key.toString());

        System.out.println("\n==== [解密后] 用户名/密码 =====");
        System.out.println(adapter.decodes(adapter.encodes(username), adapter.getKey()));
        System.out.println(adapter.decodes(adapter.encodes(password), adapter.getKey()));

    }

}
