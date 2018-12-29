/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author BADRUL
 */
public class BFS {
    
    int v;
    List[] a;
    public BFS(int v) 
    {
	this.v = v;
	a = new List[v]; // linked lists = number of vertices in Graph

	for(int i=0;i<v;i++) 
        {
	    a[i] = new List();
	    a[i].vtx = null;
        }
    }
    
    public void addEdge(int s, int d) 
    {
	Node n = new Node(s,d);
	n.next = a[s].vtx;
	a[s].vtx = n;
        

        
    }
    
        

  
    
    public void Visit(int start) 
    {
	boolean[] visited = new boolean[v];
	Queue<Integer> q = new LinkedList<Integer>();

	System.out.print("BFS: ");
        q.add(start); //source index of graph 
	while(q.isEmpty() == false) 
        {
	    int n = q.remove();
            
	    System.out.print(" " + (n+1)+"-->");
	    visited[n] = true;
	    Node head = a[n].vtx;
	    while (head!= null) 
            {
	        if(visited[head.dest]==false) 
                {
		    q.add(head.dest);
		    visited[head.dest] = true;
                }
		head = head.next;
            }
        }
    }
    public void printGraph(BFS g) 
    {
	int vertex = g.v;
	Node n1;
	for (int i=0;i<vertex;i++)
        {
	    n1= g.a[i].vtx;
	    if(n1!=null)
            {
		System.out.print((n1.source+1)+"==>");
		while(n1!= null)
                {
		    System.out.print((n1.dest+1)+"-->");
		    n1=n1.next;
                }
                System.out.println();
            }
			
        }
    }



}



