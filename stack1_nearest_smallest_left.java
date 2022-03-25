package com.company;
import java.util.*;
import java.io.*;
public class small_left
{
    public static void main(String[] args)
    {
        int arr[]={4,5,2,1,8};
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            if(st.empty())
            {
                ans[i]=-1;
            }
            else if(!st.empty() && st.peek()<arr[i])
            {
                ans[i]=st.peek();
            }
            else if(!st.empty() && st.peek()>=arr[i])
            {
                while(!st.empty() && st.peek()>=arr[i])
                {
                    st.pop();
                }
                if(st.empty())
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i]=st.peek();
                }
            }
            st.push(arr[i]);
        }
        for(Integer i:ans)
        {
            System.out.print(i+" ");
        }

    }
}
