package by.iba.integration.oData;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.BufferedReader;
import java.util.HashMap;

public class ProductGroupParser extends OData{
    public HashMap<String, String> parseProductGroup(BufferedReader bufferedReader) throws Exception{
        Document doc = keepDocFromResponse(bufferedReader);
        HashMap<String, String> quotationsList = new HashMap<>();
        NodeList nList = doc.getElementsByTagName("content");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
//                NodeList overallSDProcessStatusDesc = eElement.getElementsByTagName("d:OverallSDProcessStatusDesc");
//                if(!overallSDProcessStatusDesc.item(0).getTextContent().equals("Completed")) {
                NodeList materialGroup = eElement.getElementsByTagName("d:MaterialGroup");
                NodeList materialGroupText = eElement.getElementsByTagName("d:MaterialGroup_Text");
                Node item1 = materialGroup.item(0);
                Node item2 = materialGroupText.item(0);
                quotationsList.put(item2.getTextContent(),item1.getTextContent());
                System.out.println(item2.getTextContent()+" : "+item1.getTextContent());
//                }
            }
        }
        return quotationsList;
    }
}
