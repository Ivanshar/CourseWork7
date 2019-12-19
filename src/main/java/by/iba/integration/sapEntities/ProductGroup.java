package by.iba.integration.sapEntities;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProductGroup {
    public String materialGroup;
    public String materialGroupText;

    public ProductGroup(NodeList nNodeList){
        for (int temp = 0; temp < nNodeList.getLength(); temp++) {
            Node nNode = nNodeList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                NodeList materialGroup = eElement.getElementsByTagName("d:MaterialGroup");
                NodeList materialGroupText = eElement.getElementsByTagName("d:MaterialGroup_Text");
                this.materialGroup = materialGroup.item(0).getTextContent();
                this.materialGroupText = materialGroupText.item(0).getTextContent();
                System.out.println("Material Group: "+this.materialGroup+"\n Material Group Text: "+this.materialGroupText);
            }
        }
    }

}
