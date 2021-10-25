package com.game;

import java.util.ArrayList;
import java.util.List;



public class HackerCardGame {
	public static void hackerCards(List<Integer> collection, int d) {
	    // Write your code here

	    List<Integer> result = new ArrayList<>();
	    int newCard, maxCardValue;
	    
	    for(int i=0;i<= collection.size();i++)
	    {
	        if(i==0)
	        {
	        	System.out.println("value of i "+i);
	            newCard=1;
	        }
	        else
	        {
	            newCard=collection.get(i-1)+1;
	            System.out.println("newCard "+newCard);
	        }
	        if(i!= collection.size()) 
	        {
	            maxCardValue=collection.get(i);
	            
	        }
	        else
	        {
	            maxCardValue=Integer.MAX_VALUE;
	        }
	        if(d<newCard) break;
	            
	            for(int k =newCard ; k<maxCardValue; k++)
	            {
	                if(k<=d)
	                {
	                	System.out.println(k);
	                   result.add(k);
	                   d-=k; 
	                }
	                else{
	                    break;
	                }
	                
	            }
	           
	    }

	    System.out.println(result.toString());
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int d =7;
	     
	     List<Integer> collection = new ArrayList<>();
	     
	     collection.add(1);
	     collection.add(2);
	     collection.add(4);
		hackerCards(collection, d);
	}

}
