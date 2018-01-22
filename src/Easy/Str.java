package Easy;
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Str {
    public static int strStr(String haystack, String needle) {
        for(int i=0;;i++){
          for(int j=0;;j++){
            if(j==needle.length())
              return i;
            if(i+j==haystack.length())
              return -1;
            if(needle.charAt(j)!=haystack.charAt(i+j))
              break;
          }
        }
    }
  public static void main(String arhs[]){
    String s1 = "hello";
    String n1 = "lo";
    String s2 = "aaaaa";
    String n2 = "abc";
    System.out.println(strStr(s1,n1));
    System.out.println(strStr(s2,n2));
  }
}