/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package char_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Char_sum {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          char c;
          int sum=0;
          String s=br.readLine();
          
          
          int l=s.length();
          
          for(int i=1;i<27;i++)
          {
              for(int j=97;j<=122;j++)
              {
              for(int k=0;k<l;k++)
              {
              c=s.charAt(k);
              char c1=(char)j;
              if(j-i==96&&c1==c)
                  sum=sum+i;
              }}
          }
          System.out.println(sum);
          
        // TODO code application logic here
    }
    
}
