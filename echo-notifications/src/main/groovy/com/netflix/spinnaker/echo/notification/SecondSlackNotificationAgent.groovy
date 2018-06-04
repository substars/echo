package com.netflix.spinnaker.echo.notification

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service

@Slf4j
@ConditionalOnProperty('slack.enabled')
@Service
class SmartThingsSlackNotificationAgent extends SlackNotificationAgent {

  @Value('${slack.alternate_token}')
  String token

  @Override
  String getNotificationType() {
    'smartthings-slack'
  }

}

