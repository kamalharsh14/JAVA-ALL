package Assignments;

import java.io.*;
class code2
{
 final int max =10;
 int topA,topB;
 final static int INT_MAX=9999;
 int dataItem[];
 code2()
 {
   dataItem=new int[max];
   topA=-1;
   topB=max;
 }
 int EMPTY()
 {
   if((topA==-1) && (topB==max-1))
   return 1;
   return 0;

 }
 int FULL()
 {
   if((topA+1==topB) || (topA>=max-1) || (topB<=0))
   return 1;
   return 0;
 }
 void pushA(int item)
 {
    if(FULL()!=1)
    {
      dataItem[++topA]=item;
      System.out.println("Element added from topA -> "+item);
    }
    else
    System.out.println("Stack Overflow");
 }
 void pushB(int item)
 {
    if(FULL()!=1)
    {
      dataItem[--topB]=item;
      System.out.println("Element added from topB -> "+item);
    }
    else
    System.out.println("Stack Overflow");
 }
 int popA()
 {
   if(EMPTY()!=1)
   {
     return dataItem[topA--];
   }
   else
   {
     return -1;
   }
 }
 int popB()
 {
   if(EMPTY()!=1)
   {
     return dataItem[topB++];
   }
   else
   {
     return -1;
   }
 }
 void display()
 {
   if(EMPTY()==1)
   System.out.println("Stack OverFlow");
   else
   {
   System.out.println("Displaying the array");
   for(int i=0;i<=topA;i++)
   System.out.print(dataItem[i]+" ");
   for(int i=topB;i<max;i++)
   System.out.print(dataItem[i]+" ");
   System.out.println(); 
   } 
 }
 public static void main(String args[])throws IOException
 {
   code2 obj=new code2();
   obj.pushA(1);
   obj.pushA(2);
   obj.pushB(3);
   obj.pushA(4);
   obj.pushA(5);
   obj.pushB(6);
   obj.pushA(7);
   obj.pushA(8);
   obj.pushB(9);
   obj.pushB(10);
   obj.pushA(11);
   int x=obj.popA();
   if(x!=-1)
   System.out.println("Element deleted from topA -> "+x);
   else
   System.out.println("Stack UnderFlow");
    x=obj.popB();
   if(x!=-1)
   System.out.println("Element deleted from topB -> "+x);
   else
   System.out.println("Stack UnderFlow");
    x=obj.popB();
   if(x!=-1)
   System.out.println("Element deleted from topB -> "+x);
   else
   System.out.println("Stack UnderFlow");
    x=obj.popA();
   if(x!=-1)
   System.out.println("Element deleted from topA -> "+x);
   else
   System.out.println("Stack UnderFlow");
   obj.pushB(3);
   obj.pushA(19);
   obj.pushA(1);
   obj.pushB(12);
   obj.display();
 }
}
