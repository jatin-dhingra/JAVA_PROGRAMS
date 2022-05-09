package com.company;
import java.util.*;
import java.io.*;

public class NGL
{
    public static void ngl(int arr[],int n,Vector v)
    {
        Stack<Integer>st=new Stack<>();
        //v.add(-22);
        for(int i=0;i<n;i++)
        {
            if(st.size()==0)
            {
                v.add(-1);
            }
            else if(st.size()>0 && st.peek()>arr[i])
            {
                v.add(arr[i]);
            }
            else if(st.size()>0 && st.peek()<=arr[i])
            {
                while(st.size()>0 && st.peek()<=arr[i])
                {
                    st.pop();
                }
                if(st.empty())
                {
                    v.add(-1);
                }
                else
                {
                    v.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Vector<Integer>v=new Vector<>();
        int arr[]=new int [n] ;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ngl(arr,n,v);
        Iterator x= v.iterator();
        while(x.hasNext())
        {
            System.out.print(x.next()+ " ");
        }
    }
}
