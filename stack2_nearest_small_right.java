package com.company;

import java.util.Stack;

public class smallest_right
{
    public static  void reverse (int ans[],int n)
    {
        int t=0;
        for(int i=0;i<n/2;i++)
        {
            t=ans[i];
            ans[i]=ans[n-i-1];
            ans[n-i-1]=t;
        }
    }
    public static void main(String[] args) {
        int arr[]={3, 8, 5, 2, 25};
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
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
//        reverse(ans,n);
        for(Integer i:ans)
        {
            System.out.print(i+" ");
        }
    }
}
