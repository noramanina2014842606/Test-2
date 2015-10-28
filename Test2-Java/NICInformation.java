import java.net.*;
import java.net.InetAddress;
import java.net.Inet6Address;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class NICInformation
{
    public static void main(String[] args) throws Exception {
      InetAddress ip;
       
       ip = InetAddress.getLocalHost();
       System.out.println("Current IP address : " + ip.getHostAddress());
       NetworkInterface network = NetworkInterface.getByInetAddress(ip);
      
      

       InetAddress address = InetAddress.getLocalHost();
       NetworkInterface ni = NetworkInterface.getByInetAddress(address);
       byte[] mac = ni.getHardwareAddress();
       
       System.out.print("MAC Adress :");

    for (int i = 0; i < mac.length; i++) {
      System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
    }
    
    for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
    NetworkInterface intf = en.nextElement();
    for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
        InetAddress inetAddress = enumIpAddr.nextElement();
        System.out.println(intf.getDisplayName()+" - "+inetAddress.getHostAddress().toString());
    }
}
  
  }
        }
 
       

        

