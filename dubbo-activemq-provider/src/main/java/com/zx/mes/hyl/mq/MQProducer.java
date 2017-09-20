
package com.zx.mes.hyl.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import com.zx.mes.hyl.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;


@Service("mqProducer")
public class MQProducer implements MQProducerI{
	
	private JmsTemplate jmsTemplate;
	
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}
	
	@Autowired
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	/**
	 * <B>方法名称：</B>发送邮件信息对象<BR>
	 * <B>概要说明：</B>发送邮件信息对象<BR>
	 * @param mail
	 */
	public void sendMessage(final Mail mail) {
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(JSONObject.toJSONString(mail));
			}
		});
	}

}
