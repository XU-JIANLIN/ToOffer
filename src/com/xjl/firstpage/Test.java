package com.xjl.firstpage;

import java.io.*;
public class Test{
public static void main(String[] args)throws IOException{
 int[] a=new int[3];
 System.out.println("请从小到大输入");
 for(int i=0;i<3;i++){
  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  a[i]=Integer.parseInt(in.readLine());


 }
 double temp,theat,pi=3.1415;
 if(a[0]+a[1]<a[2]||a[1]+a[2]<a[0]||a[0]+a[2]<a[1]){
  System.out.println("你输入的不能构成三角形");
 
 }
 else if(a[0]==a[1]) {
  System.out.println("你输入的三角形是等腰三角形");
 
 
 }
 else {
  if(0==a[0]*a[0]+a[1]*a[1]-a[2]*a[2]){
  System.out.println("你输入的三角形是直角三角形");
 }
  temp=(double)(a[0]*a[0]+a[1]*a[1]-a[2]*a[2])/(2*a[0]*a[1]);
  System.out.println(temp);
  theat=Math.acos(temp);
 
  //theat=(180*theat)/pi;
  if(theat>90&&theat<180){
   System.out.println("你输入的三角形是钝角三角形");
  }
  else if(theat<90&&theat>0){
   System.out.println("你输入的三角形是锐角三角形");
  }
}
}}
