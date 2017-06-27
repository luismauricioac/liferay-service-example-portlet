package com.mauricio.liferay.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.mauricio.liferay.service.ClpSerializer;
import com.mauricio.liferay.service.ResourcesLocalServiceUtil;
import com.mauricio.liferay.service.ResourcesServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            ResourcesLocalServiceUtil.clearService();

            ResourcesServiceUtil.clearService();
        }
    }
}
