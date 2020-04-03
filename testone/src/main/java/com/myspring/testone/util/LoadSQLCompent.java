package com.myspring.testone.util;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Component
public class LoadSQLCompent {
    private Map<String, String> sqls = new HashMap<String, String>();

    public void loadXML() throws IOException, ParserConfigurationException, SAXException {
        Resource resource = new ClassPathResource("/sql/jdbc-oracle-security.xml");
        InputStream in = resource.getInputStream();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document document = builder.parse(in);
        NodeList list = document.getElementsByTagName("sql");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            NamedNodeMap attrs = node.getAttributes();
            String id = attrs.getNamedItem("id").getTextContent();
            String sql = node.getTextContent();
            sqls.put(id, sql);
        }
        in.close();
    }

    public Map<String, String> getSqls() {
        return sqls;
    }
}
