import java.io.*;
import java.util.*;

public class Main {
    static int maxHist(int a, int b, int row[])
    {
        Stack<Integer> result = new Stack<Integer>();
 
        int value;
 
        int maxa = 0; 
 
        int area = 0;
 
        int i = 0;
        while (i < b) {
            
            if (result.empty()
                || row[result.peek()] <= row[i])
                result.push(i++);
 
            else {
               
                value = row[result.peek()];
                result.pop();
                area = value* i;
 
                if (!result.empty())
                    area
                        = value * (i - result.peek() - 1);
                maxa= Math.max(area, maxa);
            }
        }
 
        while (!result.empty()) {
            value = row[result.peek()];
            result.pop();
            area = value * i;
            if (!result.empty())
                area = value * (i - result.peek() - 1);
 
            maxa = Math.max(area, maxa);
        }
        return maxa;
    }
    static int maxRectangle(int a, int b, int A[][])
    {
        
        int result = maxHist(a, b, A[0]);
 
        
        for (int i = 1; i < a; i++) {
 
            for (int j = 0; j < b; j++)
 
                
                if (A[i][j] == 1)
                    A[i][j] += A[i - 1][j];
        }
 
          for(int i=1;i<a;i++)
          {
              for(int j=0;j<b;j++)
              {
                  System.out.println(A[i][j]);
              }
          }
          return result;
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5,b=5;
        int[][] A=new int[4][4];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
          
}
}
