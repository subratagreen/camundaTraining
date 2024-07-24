package com.example.workflow.processor;

import static org.camunda.spin.Spin.S;

import static org.camunda.spin.Spin.XML;
import static org.camunda.spin.Spin.JSON;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.xml.SpinXmlElement;
import org.springframework.stereotype.Component;

@Component("xmlProcessor")
public class XmlProcessor implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
			String xmlData = (String) execution.getVariable("xmlData");
			SpinXmlElement xml = S(xmlData);
			System.out.println(xml);
			
			Order order = XML(xmlData).mapTo(Order.class);
			String jsonData = JSON(order).toString();
			execution.setVariable("jsonData", jsonData);
			
			System.out.println(jsonData);
			
			System.out.println(order);
			execution.setVariable("order", order);
			
			
//			SpinXmlElement xml2 = XML(xmlData);
//			
//			xml2.namespace();
//			
//			SpinXmlElement oldElement = XML("<orderId/>");
//			SpinXmlElement newElement = XML("<Id/>");
//			
//			SpinXmlElement replacedXmlData = xml2.replaceChild(oldElement, newElement);
//			System.out.println(replacedXmlData);
//			
			
			// <order> 	<orderId>ord-001</orderId> 	<orderName>mobile</orderName> </order>
			
			
			
			/*
			 * import static org.camunda.spin.Spin.XML;

SpinXmlTreeElement root = XML("<root><date/><order/></root>");
SpinXmlTreeElement child1 = XML("<child/>");
root.replaceChild(root.childElement("date"), child1);
SpinXmlTreeElement child2 = XML("<child/>");
root.childElement("order").replace(child2);


			 */

	}

}
