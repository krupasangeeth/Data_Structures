package com.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphAdjacencyList {
    public ArrayList<GraphNode> nodeList = new ArrayList<>();

    public GraphAdjacencyList(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }
    public void addUndirectedEdge(int i,int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    //BFS internal
    void bfsVisited(GraphNode g){
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.add(g);
        while(!q.isEmpty()){
            GraphNode tmp = q.remove();
            tmp.isVisited = true;
            System.out.print(tmp.name+" ");
            for(GraphNode neighbour : tmp.neighbours){
                if(!neighbour.isVisited){
                    q.add(neighbour);
                    neighbour.isVisited = true;
                }

            }
        }
    }

    void bfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited)
            bfsVisited(node);
        }
    }

    //DFS
    void dfsVisit(GraphNode g){
        Stack<GraphNode> s = new Stack<>();
        s.push(g);
        while(!s.isEmpty()){
            GraphNode current = s.pop();
            current.isVisited = true;
            System.out.print(current.name+" ");
            for(GraphNode neighbour : current.neighbours){
                if(!neighbour.isVisited){
                    s.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    void dfs(){
        for(GraphNode g : nodeList){
            if(!g.isVisited)
            dfsVisit(g);
        }

    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j =0; j < nodeList.get(i).neighbours.size(); j++) {
                if (j == nodeList.get(i).neighbours.size()-1 ) {
                    s.append((nodeList.get(i).neighbours.get(j).name) );
                } else {
                    s.append((nodeList.get(i).neighbours.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }


}
