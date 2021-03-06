package Tugas1;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class Graph {
    int vertex;
    LinkedLists list[];
    
    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedLists();
        }
    }
    
    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        
        //add back edge (for undirected)
        list[destination].addFirst(source);
    }
    
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source +" : "+list[source].size());
        
        //degree directed graph
            //inDegree
        int k,totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+ source +" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
        System.out.println("degree vertex "+ source +" : " + (totalIn+totalOut));
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(i==destination) {
                list[source].remove(list[source].getByValue(destination));
            }
        }
    }
    
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if(list[i].size()>0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        
        System.out.print("Masukkan jumlah lintasan : ");
        int lintasan = sc.nextInt();
        System.out.println("============================================");
        
        int source, destination;
        for (int i = 0; i < lintasan; i++) {
            System.out.println("Lintasan ke-" + (i+1));
            System.out.print("Source : ");
            source = sc.nextInt();
            System.out.print("Destination : ");
            destination = sc.nextInt();
            graph.addEdge(source, destination);
            System.out.println("============================================");
        }
        graph.printGraph();
        graph.degree(2);
        
    }
}
