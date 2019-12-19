package by.iba.integration.sapEntities;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Contact {
    public String customer;
    public String businessPartnerPerson;
    public String fullName;


    public Contact(NodeList nNodeList){
        for (int temp = 0; temp < nNodeList.getLength(); temp++) {
            Node nNode = nNodeList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                NodeList customer = eElement.getElementsByTagName("d:Customer");
                NodeList businessPartnerPerson = eElement.getElementsByTagName("d:BusinessPartnerPerson");
                NodeList fullName = eElement.getElementsByTagName("d:FullName");
                this.customer = customer.item(0).getTextContent();
                this.businessPartnerPerson = businessPartnerPerson.item(0).getTextContent();
                this.fullName = fullName.item(0).getTextContent();
                System.out.println("customer: "+this.customer+"\n businessPartnerPerson: "+this.businessPartnerPerson+"\n fullName: "+this.fullName);
            }
        }
    }
}
