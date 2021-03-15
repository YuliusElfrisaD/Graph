package graph;
import com.sun.org.apache.bcel.internal.generic.POP;
import java.util.Stack;
public class Graph {
private int maxVertex=10;
    private int countVertex;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    
    public Graph(){
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if ( i == j ){
                    adjacencyMatrix[i][j]=0;
                }else{
                    adjacencyMatrix[i][j]=-1;
                }
            }
        }
        countVertex=0;
    }

    public Graph(Vertex[] vertexList, int[][] adjacencyMatrix) {
        this.vertexList = vertexList;
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public void addVertex(char x){
        vertexList[countVertex] = new Vertex(x);
        countVertex++;
    }
    
    public void addEdge(int i, int j, int bobot){
        adjacencyMatrix[i][j] = bobot;
        adjacencyMatrix[j][i] = bobot;
    }
    
    public void addEdge(char a, char b, int bobot){
        adjacencyMatrix[indexVertex(a)][indexVertex(b)] = bobot;
        adjacencyMatrix[indexVertex(b)][indexVertex(a)] = bobot;
    }
    
    private int indexVertex(char index){
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].getLabel() == index){
                return i;
            }
        }
        return -1;
    }
    
    public void show(){
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                if(adjacencyMatrix[i][j]>0){
                    System.out.println(vertexList[i].getLabel() + " Terhubung dengan " + vertexList[j].getLabel() +
                            " Dengan bobot " + adjacencyMatrix[i][j]);
                }
            }
        }
    }
    public void DFS(int seed){
        Stack s = new Stack();
        s.push(seed);
        while(!s.isEmpty()){
            int bantu = (Integer) s.pop();
            if(!vertexList[bantu].isFlagVisited()){
                System.out.println(vertexList[bantu].getLabel()+ " ");
                vertexList[bantu].setFlagVisited(true);
                for (int i = countVertex -1 ; i>0; i--) {
                    if(adjacencyMatrix[bantu][i] >= 1 &&  !vertexList[i].isFlagVisited()){
                        s.push(i); 
                    }   
                }
            }
        }
    }
}
// ALGORITMA DFS
//1.PUSH (seed)
//2.SELAMA TUMPUKAN TIDAK KOSONG
//  A. POP X
//  B. CEK APAKAH SUDAH DIKUNJUNGU
//     JIKA TIDAK
//          I.CETAK X
//          II.TANDAI X SUDAH DIKUNJUNGI
//          III.MASUKKAN TETANGGA X KE TUMPUKAN DARI INDEKS TERBESAR YANG BELUM DIKUNJUNGI
