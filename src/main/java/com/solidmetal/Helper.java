package com.solidmetal;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


@Service
public class Helper {

    private final JavaMailSender javaMailSender;

    public Helper(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public File zipFile(String filePath) throws IOException {

        File fileToZip = new File(filePath);
        File zipFile = new File(fileToZip.getParent(), fileToZip.getName() + ".zip");

        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(fileToZip)) {

            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }

            zos.closeEntry();
        }

        return zipFile;
    }

    public void sendEmail(String emailTo, String subject, String bodyMessage, File attachment) throws MessagingException, UnsupportedEncodingException {

        MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

        messageHelper.setFrom("SolidMetalPlatform", "SolidMetalPlatform");

        messageHelper.setTo(emailTo);
        messageHelper.setSubject(subject);
        messageHelper.setText(bodyMessage); // true indicates that the text is HTML

        // Add the attachment if it exists
        if (null != attachment && attachment.exists()) {

            FileSystemResource fileResource = new FileSystemResource(attachment);
            messageHelper.addAttachment(attachment.getName(), fileResource);
        }

        javaMailSender.send(message);
    }
}
