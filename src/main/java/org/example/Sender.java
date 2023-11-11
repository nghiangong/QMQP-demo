package org.example;

import com.google.gson.Gson;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.nio.charset.StandardCharsets;
public class Sender {
    private final static String QUEUE_NAME = "iot";
    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
                factory.setUsername("guest");
                        factory.setPassword("guest");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            SensorData sensorData = new SensorData(11, 126, 30, 60, 1100, 5.0);
            Gson gson = new Gson();
            String message = gson.toJson(sensorData);
            channel.basicPublish("", QUEUE_NAME, null,
                    message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
