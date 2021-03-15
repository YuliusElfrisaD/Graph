/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Windows 8.1
 */
public class Main {
    public static void main(String[] args) {
     Graph gr = new Graph();
     gr.addVertex('A');
     gr.addVertex('B');
     gr.addVertex('C');
     gr.addVertex('D');
     gr.addVertex('E');
     
     gr.addEdge('A', 'B', 100);
     gr.addEdge('A', 'D', 800);
     gr.addEdge('A', 'E', 750);
     gr.addEdge('D', 'C', 400);
     gr.addEdge('C', 'E', 370);
     gr.addEdge('A', 'C', 155);
     gr.addEdge('B', 'C', 105);
     gr.DFS(0);
     gr.show();
    }
}