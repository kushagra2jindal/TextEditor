/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notebook;

/**
 *
 * @author kushagrajindal
 */
public class Check {
    public static int isBinary(String s){
    int c=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='0' && s.charAt(i)!='1'){
            c=1;
            break;
        }
    }
    return c;
}
}
