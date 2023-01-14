package com.Graph;

import java.util.ArrayList;

public class GraphAdjacencyMatrix {
    public ArrayList<GraphNode> nodeMList = new ArrayList<>();
    public int[][] adjMatrix;

    public GraphAdjacencyMatrix(ArrayList<GraphNode> nodeMList) {
        this.nodeMList = nodeMList;
        adjMatrix = new int[nodeMList.size()][nodeMList.size()];
    }
    public void addUndirectedEdgeM(int i,int j){
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeMList.size(); i++) {
            s.append(nodeMList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeMList.size(); i++) {
            s.append(nodeMList.get(i).name + ": ");
            for (int j : adjMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }


}
