package Hooks;


import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;

import java.util.Date;
import java.util.Scanner;

public class Default {

    public void sendhook() {
        Date date = new Date();

        Scanner sc= new Scanner(System.in);
     
   System.out.println("Please enter the hook url");
      
  String url = sc.nextLine();
    
    System.out.println("Please enter the embed title");
        
String title = sc.nextLine();
       
 System.out.println("Please enter the first embed name");
     
   String fen = sc.nextLine();
 
       System.out.println("Please enter the first embed content");

        String fec = sc.nextLine();

        System.out.println("Please enter the second embed title");

        String sen = sc.nextLine();

        System.out.println("Please enter the secont embed content");
 
       String sec = sc.nextLine();

        System.out.println("Please enter the footer content");

        String ten = sc.nextLine();

        System.out.println("Please enter the footer embed icon");

        String tec = sc.nextLine();



        try {

            WebhookClient nude = WebhookClient.withUrl(url);
         
   WebhookEmbed.EmbedTitle titletext = new WebhookEmbed.EmbedTitle(" " + title , "");
         
   WebhookEmbed.EmbedField field1 = new WebhookEmbed.EmbedField(false, " " + fen, " " + fec);
         
   WebhookEmbed.EmbedField field2 = new WebhookEmbed.EmbedField(false, "" + sen, sec);
          
  WebhookEmbed.EmbedFooter footer = new WebhookEmbed.EmbedFooter(" " + date + " " + ten, " " + tec);
        
    WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(titletext)
                    .setThumbnailUrl("")
                    .setColor(15925248)
                    .addField(field1)
                    .addField(field2)
                    .setFooter(footer)
                    .build();
            nude.send(embed);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
