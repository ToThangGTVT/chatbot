package com.chatbot.dev.utils;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class CurlToBlock {

    public static String accessToBlock(String msg, String chatfuelBlockName, String userId)
            throws IOException {
        String url = "https://api.chatfuel.com/bots/5e96afa08579a07d114a00b7/users/" + userId + "/send?";
        String charset = "UTF-8";
        String chatfuel_token = "mELtlMAHYqR0BvgEiMq8zVek3uYUK3OJMbtyrdNPTrQB9ndV0fM7lWTFZbM4MZvD";
        String chat = msg;

        if (chat != null) {
            String query = String.format("chatfuel_token=%s&chatfuelBlockName=%s&chat=%s",
                    URLEncoder.encode(chatfuel_token, charset), URLEncoder.encode(chatfuelBlockName, charset),
                    URLEncoder.encode(chat, charset));

            String urlEncode = url + query;

            URLConnection connection = new URL(urlEncode).openConnection();
            HttpURLConnection http = (HttpURLConnection) connection;
            http.setDoOutput(true);
            http.setRequestMethod("POST");
            http.setRequestProperty("Accept-Encoding", "");
            http.setRequestProperty("Content-Type", "application/json");

            try (DataInputStream wr = new DataInputStream(http.getInputStream())) {
                return wr.readLine();
            }
        }
        return null;
    }
}
