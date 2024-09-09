package com.example.project;



public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
      public boolean equal(String1 s) {
    	  boolean equality = false;
    	  if(s.getSize() == -1 && getSize() == -1)
    		  equality = true;
    	  
        for(int i = 0 ; i <= size ; i++){
	    if(s.getChar(i) == str[i] ) 
	    	equality = true;
	    else
	    	equality = false;
	}
        return equality;
      }
    	
    	  
    public void reverse() {
    	if(length() - 1 != -1) {

        int start = 0 ;
        int end = size;
        char holder = str[end];
        while(end > start) {
        	holder = str[end];
        	str[end] = str[start];
        	str[start] = holder;
        	start++;
        	end--;
        }
    	}
    	
    	}
     public int getSize() {
      return this.size;
       
        	
        	
        }
     public void print() {
     	for(int i = 0 ; i <= size; i++) {
     		System.out.print(str[i]);
     	}
     	System.out.println();
     }
}

