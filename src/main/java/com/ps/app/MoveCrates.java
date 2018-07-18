package com.ps.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoveCrates {
	
	List<Crate> movedCrates = new ArrayList<Crate>();

	public List<Crate> moveToNew(int N,List<Crate> cratesToMove, int M)
	{
		
		if(M<=N)
		{
			Collections.sort(
	                cratesToMove,
	                (crate1, crate2) -> 
	                (int)(Math.sqrt((crate1.getxCord()*crate1.getxCord())
	                		+(crate1.getyCord()*crate1.getyCord())))
	                - (int)(Math.sqrt((crate2.getxCord()*crate2.getxCord())
	            		  +(crate2.getyCord()*crate2.getyCord()))));
			
			for(int i=0;i<M;i++)
			{
				movedCrates.add(cratesToMove.get(i));
			}
			
			return movedCrates;
		}
		else
		{
			System.out.println("Oops, old WareHouse do not have "+M+"crates");
			return null;
		}
	}
}
