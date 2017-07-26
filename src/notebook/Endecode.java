
package notebook;

public class Endecode {
public String toBinary(char c){
    int a=(int)c;
    String s=Integer.toBinaryString(a);
    int l=s.length();
    for(int i=l;i<8;i++){
        s="0"+s;
    }
    return s;
}
public String encode(String s,String p){
       String n="";
       StringBuffer sb=new StringBuffer(s);
       sb.reverse();
       s=new String(sb);
       StringBuffer sb1=new StringBuffer(p);
       sb1.reverse();
       p=new String(sb1);
       for(int i=0;i<p.length();i++){
           char c=p.charAt(i);
           String s1=toBinary(c);
           n=n+s1;
       }
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           String s1=toBinary(c);
           n=n+s1;
       }
       return n;
}  
public int pow(int a,int b){
    int t=1;
    for(int i=0;i<b;i++){
        t=t*a;
    }
    return t;
}
public int toDecimal(String c){
    int a=Integer.parseInt(c);
    int d=0;
    for(int i=0;i<8;i++){
       d=d+(a%10)*(pow(2,i));
       a=a/10;
    }
    return d;
}
public String decode(String n){
    String s="";
    String p="";
    for(int i=0;i<32;i=i+8){
        String s1=n.substring(i,i+8);
        char c=(char)toDecimal(s1);
        p=p+c;
    }
       StringBuffer sb=new StringBuffer(p);
       sb.reverse();
       p=new String(sb);
    for(int i=32;i<n.length();i=i+8){
        String s1=n.substring(i,i+8);
        char c=(char)toDecimal(s1);
        s=s+c;
    }
       sb=new StringBuffer(s);
       sb.reverse();
       s=new String(sb);
    return p+" "+s;
}
}
