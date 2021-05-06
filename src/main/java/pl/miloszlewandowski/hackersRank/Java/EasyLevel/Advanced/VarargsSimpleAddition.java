package pl.miloszlewandowski.hackersRank.Java.EasyLevel.Advanced;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class VarargsSimpleAddition {

}

class Add {
    public Add() {
    }
    public void add(int n1, int n2, int...args ){
        int numberResult = n1 + n2;
        String stringresult = n1 + "+" + n2;
        for (int i = 0; i < args.length; i++) {
            stringresult += "+" + args[i];
            numberResult += args[i];
        }
        System.out.println(stringresult + "="+numberResult);;
    }
}

class Solution7 {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }



}

