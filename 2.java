import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int count=0,len=0,len1=0;
           String str1,str2;
        str1=sc.nextLine();
        str2=sc.nextLine();
        len=str1.length();
        len1=str2.length();
     
        char s[] = str1.toCharArray();
        char s1[]=str2.toCharArray();
        for(int i=0;i<len-1;i++)
        {
            if(s[i]==s1[len1-1])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
