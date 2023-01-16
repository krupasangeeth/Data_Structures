package com.Graph;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));

        GraphAdjacencyList g = new GraphAdjacencyList(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(3,4);

//        GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(nodeList);
//        g.addUndirectedEdgeM(0,1);
//        g.addUndirectedEdgeM(0,2);
//        g.addUndirectedEdgeM(0,3);
//        g.addUndirectedEdgeM(1,4);
//        g.addUndirectedEdgeM(2,3);
//        g.addUndirectedEdgeM(3,4);

        System.out.println(g.toString());
//        g.bfs();
        g.dfs();

    }
}
