package pmcep.web.miner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import pmcep.web.miner.models.MinerInstance;
import pmcep.web.miner.models.notifications.Notification;

@ComponentScan({"pmcep.config"})
@Controller
public class NotificationController {

	@Autowired
	private SimpMessagingTemplate template;
	
	public void notifyToClient(MinerInstance instance, Notification notification) {
		template.convertAndSend("/" + instance.getId(), notification);
	}
}
