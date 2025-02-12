import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    boolean isEnded = false;
    ArrayList<Integer> path;
	ArrayList<Node> nodes;
	int[][] matrix;
	
	Graph(int size){
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1;
	}
	
	public boolean checkEdge(int src, int dst) {
		if(matrix[src][dst] == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<Integer> getPath(){
		return path;
	}
	public int dijkstra(int src, int target) {
	    int[] distance = new int[nodes.size()];
	    int[] predecessors = new int[nodes.size()];
	    Arrays.fill(distance, Integer.MAX_VALUE);
	    Arrays.fill(predecessors, -1); // Initialize predecessors to -1
	    distance[src] = 0;

	    Queue<Node> pq = new LinkedList<>();
	    pq.offer(nodes.get(src));

	    while (!pq.isEmpty()) {
	        Node current = pq.poll();
	        int currentNodeIndex = nodes.indexOf(current);

	        for (int i = 0; i < matrix[currentNodeIndex].length; i++) {
	            if (matrix[currentNodeIndex][i] != 0) {
	                int newDistance = distance[currentNodeIndex] + matrix[currentNodeIndex][i];
	                if (newDistance < distance[i]) {
	                    distance[i] = newDistance;
	                    predecessors[i] = currentNodeIndex; // Update predecessor
	                    pq.offer(nodes.get(i));
	                }
	            }
	        }
	    }

	    return calculateShortestPath(predecessors, src, target);
	}

	private int  calculateShortestPath(int[] predecessors, int src, int target) {
	    ArrayList<Integer> path = new ArrayList<>();
	    int count = 0;
	    int current = target;
	    while (current != -1) {
	        path.add(0, nodes.get(current).data);
	        current = predecessors[current];
	        count++;
	    }
	    return count-1;
	}
}
