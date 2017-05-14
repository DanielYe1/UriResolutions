package exUri.graphs;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int index;
	ArrayList<Node> neighbors;

	public Node(int index, ArrayList neighbors) {
		this.index = index;
		this.neighbors = neighbors;
	}

	public int getIndex() {
		return index;
	}

	public void addNeighbor(Node node) {
		neighbors.add(node);
	}

	public ArrayList<Node> getNeighbors() {
		return (ArrayList<Node>) new ArrayList(neighbors);
	}

}

public class Basic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList test = new ArrayList();
		ArrayList test1 = new ArrayList();
		test.add(1);
		test1.add(2);
		Node k = new Node(0, test);
		Node j = new Node(1, test1);
	}

}