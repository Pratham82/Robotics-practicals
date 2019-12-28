import java.util.*;
import java.io.*;
public class breadthfirst
{
  ArrayList arr = new ArrayList();
  String str[] = new String[2];
  String path[] = new String[20];
  int i,j,k=0;
  public breadthfirst()
  { 
    arr.add("Dadar"); 
    arr.add("Kalyan");
    arr.add("Jogeshwari");   
    arr.add("Malad");
    arr.add("Kandivali");
    arr.add("Borivali");
    arr.add("Goregaon");
    arr.add("Andheri");
    arr.add("Virar");
    arr.add("Bandra");
    arr.add("Thane");
    arr.add("Bhandup");
    arr.add("Mulund");
    arr.add("Mahim");
    arr.add("Chembur");
  }
  public void breadth()
  {  
     if(arr.isEmpty())
     System.out.println("Empty");
     for(i=0;i<20;i++)
     path[i]="";
     str[0]="";
     str[1]="";
     System.out.println("\t\t\tDadar\n");
     System.out.println("Kalyan\t\t\tJogeshwari\t\t\tMalad\n");
     System.out.println("\t\tKandivaliBorivali\tGoregaon\n");
     System.out.println("\t\tAndheriVirarBandra\t Thane\n");
     System.out.println("\tBhandupMulundMahim\t\tChembur\n");
     try
     {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the initial node");
      str[0]=br.readLine();
      System.out.println("Enter the goal");
      str[1]=br.readLine();
      if(arr.contains(str[1]))
      {
         System.out.println("Goal is found");
         for(j=arr.indexOf(str[0]);j<=arr.indexOf(str[1]);j++)
         {
           path[k]=arr.get(j).toString();
           k++;
         }
      }         
    }
    catch(IOException e)
    {}
    System.out.print("Path is:   ");
    for(j=0;j<k;j++)
    {
      System.out.print(path[j]);
      if(j!=k-1)
      System.out.print("-->");
    }
  }
  public static void main(String arg[])
  {
    breadthfirst b = new breadthfirst();
    b.breadth();
  }
}

