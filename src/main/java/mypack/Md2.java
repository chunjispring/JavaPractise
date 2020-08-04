package mypack;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*

    import java.security.MessageDigest;
    import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

    public class Md2 {
        public static void MD2(){
            try{
                MessageDigest md = MessageDigest.getInstance("MD2");
                byte[] digest = md.digest(src.getBytes());

                HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();

                String marshal = hexBinaryAdapter.marshal(digest);

                System.out.println(marshal);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
*/

public class Md2 {
    public static void MD2() throws NoSuchAlgorithmException {

        //要加密的字符串
        String s="73.25";

        MessageDigest md=MessageDigest.getInstance("MD2");
        for (int i = 0; i < 100000000; i++) {
            byte[] sBytes= s.getBytes();
            byte[] digest = md.digest(sBytes);

            //十六进制的字符
            char[]  chars=new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
            StringBuffer sb=new StringBuffer();

            //处理成十六进制的字符串（通常）
            for (byte bb:digest){
                sb.append(chars[(bb>>4)&15]);
                sb.append(chars[bb&15]);
            }

            s=sb.toString();
        }
        System.out.println(s);
    }
}