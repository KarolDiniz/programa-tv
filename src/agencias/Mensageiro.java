package agencias;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mensageiro {

    public static void enviarProgramacaoDeHoje(String assunto, String email, String texto)  {

        Properties props = new Properties();

        props.put("mail.smtp.user", "projetoagendaseries@gmail.com"); // remetente
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.EnableSSL.enable","true");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");

        Session sessao = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication("projetoagendaseries@gmail.com", "projeto@123!");
                    }
        });

        sessao.setDebug(true);

        try {

            Message mensagem = new MimeMessage(sessao);
            mensagem.setFrom(new InternetAddress("projetoagendaseries@gmail.com"));

            Address[] toUser = InternetAddress.parse(email);

            mensagem.setRecipients(Message.RecipientType.TO, toUser);
            mensagem.setSubject(assunto);
            mensagem.setText(texto);
            Transport.send(mensagem);

        } catch (MessagingException e) {
            System.out.print("[Ocorrência de erro] Tente novamente! ");
        }
    }
}