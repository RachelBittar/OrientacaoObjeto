import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Client {

private final static String FILENAME = "/Users/rachelbittar/eclipse-workspace/Algorithms-part1/myfileAlg.txt";

	public static void main(String[] args) {
		 int N, p,q;
		
		 try	{
			 Scanner sc = new Scanner(new File(FILENAME));
			 N = Integer.parseInt(sc.next());
			 QuickFindUF uf = new QuickFindUF(N);
			 
			 System.out.println(N);
			 
			 while(sc.hasNextLine()){  
				 p = sc.nextInt();
		         q = sc.nextInt();
		            
		         if(!uf.connected(p, q)) {
		        	 	uf.union(p, q);
		        	// System.out.println("union");
		        	 System.out.println(p + "-" + q);	 
		         }
			  }
			}catch(IOException e){
				e.printStackTrace();
			}
	
		
		
	}
}
	
		
		
		
		
		
