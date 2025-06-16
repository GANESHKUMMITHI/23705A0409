import java.util.HashSet;
public class App{
    public static void main(String args[]){
    }
}
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=1;
    }
}
class Graph{
    HashSet<Edge> graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
 this.vertices=vertices;
 this.isDirected=isDirected;
 graph=new HashSet<Edge>();
}
public  void addEdge(int src,int dest){
   
    Edge e=new Edge(src,dest); 
    if(isValid(src,dest)){
        graph.add(e);
         Edge e2=new Edge(dest,src);
         if(!isDirected){
            graph.add(e2);
        }
    }else{
        System.out.println("inalid source and destination");
    }
}
public void subEdge(int src,int des,int weight){
      if(isValid(src,dest)){
        Edge e=new Edge(src,dest,weight);
        graph.add(e);
        if(!isDirected){
        Edge e2=new Edge(dest,src,weight);
            graph.add(e2);
        }
      }else{
       System.out.println("inalid source and destination");
      }
}
public boolean isValid(int src,int dest){
    return src>=0&&dest>=0&&src<vertices&&dest<vertices&&src!=dest;
}
}
