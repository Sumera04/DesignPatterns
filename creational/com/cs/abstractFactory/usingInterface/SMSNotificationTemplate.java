package com.cs.abstractFactory.usingInterface;

//----- SMS FAMILY -----
class SMSNotificationTemplate implements NotificationTemplate {
	@Override
	public String getTemplateContent() {
		return "Dear User,\nThis is your SMS notification template.";
	}
}