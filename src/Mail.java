package bookmyshow;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


public class Mail {
    private Session newSession = null;
    private MimeMessage mimeMessage = null;

    public static void main(String[] args) {
        try {
            Mail mail = new Mail();
            mail.setUpServerProperties(); // ✅ Initialize session
            mail.draftMail(); // ✅ Draft email
            mail.sendMail(); // ✅ Send email
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Initialize Session Correctly
    void setUpServerProperties() {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // ✅ Correct assignment of session
        newSession = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("gitanjalipatil061@gmail.com", "lkeeakkbxvvyjaez"); // Use Google App Password
            }
        });
    }

    // ✅ Draft the Email and Store it in `mimeMessage`
    void draftMail() throws MessagingException, IOException {
        String[] emailRecipients = {"gitanjali.p.nextech@gmail.com"};
        String emailSubject = "Test Email";
       
        
                String htmlContent = new String(
                Files.readAllBytes(Paths.get("D:\\Mail Templates\\welcome.html")),
                StandardCharsets.UTF_8
        );
        mimeMessage = new MimeMessage(newSession); // ✅ Store in class variable
        mimeMessage.setFrom(new InternetAddress("gitanjalipatil061@gmail.com"));

        for (String recipient : emailRecipients) {
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
        }

        mimeMessage.setSubject(emailSubject);

        // ✅ Create email body
        MimeBodyPart bodyPart = new MimeBodyPart();       
        bodyPart.setContent(htmlContent, "text/html; charset=utf-8");
        MimeBodyPart pdfattachment = new MimeBodyPart();
//        pdfattachment.attachFile("D:\\Result\\Sem I.pdf");
//        
//        // ✅ Attachment part (HTML file)
//        MimeBodyPart htmlAttachment = new MimeBodyPart();

       
        // ✅ Combine email parts
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(bodyPart);
//        multipart.addBodyPart(htmlAttachment);
//        multipart.addBodyPart(pdfattachment);
    // PDF attachment
        

        mimeMessage.setContent(multipart); // ✅ Properly set content
    }

    // ✅ Send the Email
    void sendMail() throws MessagingException {
        if (newSession == null) {
            System.out.println("❌ Error: Email session is not initialized!");
            return;
        }
        if (mimeMessage == null) {
            System.out.println("❌ Error: Email message not drafted!");
            return;
        }

        String emailHost = "smtp.gmail.com";

        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, "gitanjalipatil061@gmail.com", "aidwguznfswwspjc"); // ✅ Use App Password
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
        transport.close();

        System.out.println("✅ Email Sent Successfully!");
        System.out.println("✅ Email Sent Successfully with HTML file attached!");
    }

}
