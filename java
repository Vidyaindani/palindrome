class Palindrome
  {  
 public static void main(String args[])
 { 

  int s,sum=0,temp;    
  int n=171;
  
  temp=n;    
  while(n>0)
  {    
   s=n%10;    
   sum=(sum*10)+s;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}

output:palindrome number 
