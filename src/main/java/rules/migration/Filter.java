package main.java.rules.migration;

import main.java.graph.GraphNode;
import main.java.rules.LambdaRule;

public class Filter implements LambdaRule {
	
	@Override
	public void applyRule(GraphNode graphNode) {
		graphNode.setToPushdown(graphNode.getLambdaSignature());
	}
}