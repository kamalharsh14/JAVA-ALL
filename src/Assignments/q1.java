package Assignments;

import java.io.*;
class code1
{
  final int max=10;
  final static int INT_MAX=9999;
  int top;
  int dataItem[];
  code1()//constructor 
  {
    top=-1;
    dataItem=new int[max];
  }
  int FULL()// to check whether the stack is full or not
  {
    if(top>=max)
    return 1;
    return 0;
  }
  int EMPTY()// to check whether the stack is empty or not
  {
    if(top==-1)
    return 1;
    return 0;
  }
   //----------X----------------
  void PUSH(int item)// to push the items or elements in the stack
  {

    if(FULL()!=1)
    {
    dataItem[++top]=item;
    System.out.println("Element added -> "+item);

    }
    else
    System.out.println("Stack OverFlow");

  }
  int POP()// to pop the element from the stack
  {
    if(EMPTY()!=1)
    return dataItem[top--];
    else
    {
    System.out.println("Stack UnderFlow");
    return -1;
    }
  }
  int peekTop()// to return the top element from the stack
  {
    if(EMPTY()!=1)
    return dataItem[top];
    return INT_MAX;
  }
   //----------X----------------
  int thirdElement()// to return the third element from the stack
  {
    if(top>=2)
    return dataItem[top-2];
    return INT_MAX;
  }
   //----------X----------------
   int bottomElement()// return the bottom element
   {
     if(EMPTY()!=1)
     return dataItem[0];
     return INT_MAX;
   }
   void deleteOccurance(int x)//to delete the occurance of the value x from the stack
   {
     System.out.println("Elements to be deleted -> "+x);
     for(int i=0;i<=top;i++)
     {
       if(dataItem[i]==x)
       {
         
         for(int j=i;j<=top;j++)
         {
           dataItem[j]=dataItem[j+1];
         }
         i--;
         top--;
       }
     }
     
   }
  void displayStack()//Display the stack
  {
    System.out.println("\nStack is being displayed\n");
    if(EMPTY()==1)
    System.out.println("Stack underFlow");
    else{
      for(int i=top;i>=0;i--)
      {
        System.out.println(dataItem[i]);
      }
      
    }
  }
   public static void main(String args[])throws IOException
   {
     code1 obj=new code1();
     obj.PUSH(1);
     obj.PUSH(2);
     obj.PUSH(3);
     obj.PUSH(4);
     obj.PUSH(5);
     obj.PUSH(6);
     System.out.println("pop out element -> "+obj.POP());
     System.out.println("pop out element -> "+obj.POP());
     obj.PUSH(7);
     obj.PUSH(8);
     obj.displayStack();
     int x=obj.peekTop();
     if(x!=INT_MAX)
     System.out.println("Top Element -> "+ x);
     else
     System.out.println("Stack UnderFlow");

     x=obj.thirdElement();
     if(x!=INT_MAX)
     System.out.println("Third Element -> "+ x);
     else
     System.out.println("data items in the stack is less than 3");
     
     x=obj.bottomElement();
     if(x!=INT_MAX)
     System.out.println("Bottom Element -> "+ x);
     else
     System.out.println("Stack UnderFlow");

     obj.deleteOccurance(5);
     obj.displayStack();
   }
}
