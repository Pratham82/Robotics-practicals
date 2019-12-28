import java.util.*;
import java.io.*;
class Astar
{
  String str[]=new String[2];
  String s1,s2="";
  int no,i,j,min=1,temp,k=0;
  String path[] = new String[50];
  public Astar()throws IOException
  { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the initial node:-\n");
    str[0]=br.readLine();
    path[k]=str[0];
    System.out.print("Enter the Goal Node:-\n");
    str[1]=br.readLine();
    System.out.println("\t\t\tDadar\n");
    System.out.println("Kalyan\t\t\tJogeshwari\t\t\tMalad\n");
    System.out.println("\tKurla\tKandivaliBorivali\tGoregaon\n");
    System.out.println("\tAndheriVirarBandra\t Thane\n");
    System.out.println(" BhandupMulundMahim\t\t\tChembur\n");
    while(!str[0].equals(str[1]))
    {
      System.out.print(s2);
      System.out.println("Enter the no. of node of" +" "+ str[0] );
      s1=br.readLine();
      no=Integer.parseInt(s1);
      String st[][] = new String[no][3];
      int arr[] = new int[no];
      System.out.println("Enter the successor nodes of" +" "+ str[0]+" " +"With their straight line distance to goal node h(n) and path cost from start node i.e. h(n) "); 
      for(i=0;i<no;i++)
      {
         for(j=0;j<3;j++)
         {
           st[i][j]=br.readLine();
         }
      }
      for(i=0;i<no;i++)
      {
        arr[i]=Integer.parseInt(st[i][1])+Integer.parseInt(st[i][2]);
      } 
      for(i=0;i<no;i++)
      {
        for(j=i+1;j<no;j++)
        {
          if(arr[i]<arr[j])
          {
             temp=arr[i];
             arr[j]=arr[j];
             arr[i]=temp;
          }
          else
          {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
      min=arr[0];
      for(i=0;i<no;i++)
      {
         if((Integer.parseInt(st[i][1])+Integer.parseInt(st[i][2]))==min)
         str[0]=st[i][0];
         s2="Node"+" "+str[0]+" "+"has smallest value therefore  "; 
      }
      k++;
      path[k]=str[0];
    }
    System.out.println("The path from initial node to goal node is:");
    for(i=0;i<k;i++)
    System.out.print(path[i]+"--->");
    System.out.print(str[1]); 
  }
  public static void main(String arg[])throws IOException
  {
    Astar a = new Astar();
  }
}

