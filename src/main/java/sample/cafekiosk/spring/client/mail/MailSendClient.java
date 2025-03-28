package sample.cafekiosk.spring.client.mail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MailSendClient {
    public boolean sendMail(String fromEmail, String toEmail, String subject, String content) {
        // 메일전송
        log.info("메일 전송");
        throw new IllegalArgumentException("메일 전송");

    }
}
