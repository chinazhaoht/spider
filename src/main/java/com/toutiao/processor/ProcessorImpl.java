package com.toutiao.processor;

import core.Processor;
import core.Saver;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by zhaoht on 2016-03-06.
 */
public class ProcessorImpl implements Processor {

    static final Logger logger = LoggerFactory.getLogger(ProcessorImpl.class);

    public void process(List<String> list, Saver saver) {
        for(String page : list){
            try {
                Parser parser = new Parser(page);
                for (NodeIterator i = parser.elements (); i.hasMoreNodes(); ) {
                    Node node = i.nextNode();

                    NodeList nodeList = new NodeList();
                    NodeFilter nodeFilter = (NodeFilter) new TagNameFilter("a");
                  //  node.collectInto(nodeList,nodeFilter);
                   // for(Node n : nodeList.toNodeArray()){
                  //      System.out.println(n);
                  //  }
                    NodeList nodes = parser.extractAllNodesThatMatch(nodeFilter);
                    for(Node n : nodes.toNodeArray()){
                        System.out.println(n.getText());
                    }

                    // System.out.println(node.getChildren());
                }

                } catch (ParserException e) {
                e.printStackTrace();
            }

        }
    }
}
