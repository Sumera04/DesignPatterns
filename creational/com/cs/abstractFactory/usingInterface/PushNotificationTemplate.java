package com.cs.abstractFactory.usingInterface;

//----- EMAIL FAMILY -----
class PushNotificationTemplate implements NotificationTemplate {
	@Override
	public String getTemplateContent() {
		return "Dear User,\nThis is your Push notification template.";
	}
}