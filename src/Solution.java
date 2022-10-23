public class Solution {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        graph.addVertex('K');
        graph.addVertex('L');

        graph.addEdge(0, 1, 3);
        graph.addEdge(0, 2, 9);
        graph.addEdge(0, 9, 7);
        graph.addEdge(1, 9, 5);
        graph.addEdge(2, 3, 11);
        graph.addEdge(2, 5, 2);
        graph.addEdge(3, 4, 3);
        graph.addEdge(4, 8, 11);
        graph.addEdge(5, 6, 4);
        graph.addEdge(6, 3, 3);
        graph.addEdge(6, 7, 6);
        graph.addEdge(6, 10, 6);
        graph.addEdge(7, 8, 8);
        graph.addEdge(7, 11, 5);
        graph.addEdge(8, 11, 7);
        graph.addEdge(9, 10, 8);
        graph.addEdge(10, 11, 1);
        graph.addEdge(11, 6, 9);


        System.out.println("Ёлементы имеют кратчайшие пути из точки A: ");
        graph.path();
        graph.clean();
    }
}