package com.cs.abstractFactory.usingInterface;

//----- EMAIL FAMILY -----
class EmailNotificationTemplate implements NotificationTemplate {
	@Override
	public String getTemplateContent() {
		return "Dear User,\nThis is your email notification template.";
	}
}