/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eroto;

/**
 *
 * @author saraansh
 */
import java.io.*;
public class Eroto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        int size,pr,i,j,k,l;
        size=pr=i=j=k=l=0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
      //  System.out.println("enter boolean size");
        size=Integer.parseInt(in.readLine());
        boolean prime[] = new boolean[size+1];
        for(i=0;i<=size;i++)
        {
            prime[i]=true;
        }
        prime[0]=prime[1]=false; /* set 0 and 1 as non prime as prime numbers
                                    start from 2 */
        
        for(i=2;i<size;i++)
        {
            for(j=i*i;j<=size;j+=i)
            {
                prime[j]=false;//updation of multiples to false
                
            }
        }
        for(i=0;i<size;i++)
        {
            if(prime[i]==true)
            System.out.print(i);
        }
    }
    
}
