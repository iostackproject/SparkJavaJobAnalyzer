package main.java.rules.modification.javastreams;

import main.java.graph.GraphNode;

public class Collect extends ActionModificationRuleJavastreams {

	@Override
	public void applyRule(GraphNode graphNode) {
		//Add map to adapt the proper type
		super.applyRule(graphNode);
		//1) Exception: A groupBy + counting can be replaced by a groupBy + summingXXX
		//as the summingXXX will aggregate the partial counting of all storlets
		//FIXME: Do this more generic!!
		if (graphNode.getLambdaSignature().equals("collect(groupingBy(SimpleEntry<String, Long>::getKey, counting()))")){
			String codeReplacement = graphNode.getCodeReplacement().replace(graphNode.getLambdaSignature(), "");
			graphNode.setCodeReplacement(codeReplacement +
					"collect(groupingBy(SimpleEntry<String, Long>::getKey, summingLong(SimpleEntry::getValue)))");		
		}
	}
}
