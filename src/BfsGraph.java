/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author BADRUL
 */
public class BfsGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
           String filelink="BFS.txt";
           File file=new File(filelink);
           Scanner B=new Scanner(file);
           String read=B.nextLine(); //1st line read
           StringTokenizer st=new StringTokenizer(read,","); //1st line split
           int v=Integer.parseInt(st.nextToken()); //vertex number
           int e=Integer.parseInt(st.nextToken()); //edge number
           BFS a=new BFS(v); //creating Graph
           read=B.nextLine(); //2nd line read
           st=new StringTokenizer(read,","); //2nd line split
           
           while(st.hasMoreElements())
           {
               String s=st.nextToken();
               
               
               int n1=(s.codePointAt(0))-49;
               int n2=(s.codePointAt(1))-49;
               
               a.addEdge(n1,n2);
           }

           a.printGraph(a);
           a.Visit(0);

        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }
    
}
