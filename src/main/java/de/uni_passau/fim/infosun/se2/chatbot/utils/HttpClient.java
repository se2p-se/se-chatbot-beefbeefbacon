package de.uni_passau.fim.infosun.se2.chatbot.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/** A simple HTTP client that offers a method for retrieving the content of a web page. */
public class HttpClient {

  /**
   * Returns the content of the specified URL.
   *
   * @param pURLAddress the URL of the web page whose content should be returned
   * @return the content of the web page
   * @throws IOException if the URL cannot be accessed
   */
  public static String getContent(final String pURLAddress) throws IOException {
    final URL url = new URL(pURLAddress);
    final URLConnection connection = url.openConnection();
    try (final BufferedReader in =
        new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
      final StringBuilder result = new StringBuilder();
      String inputLine;

      while ((inputLine = in.readLine()) != null) {
        result.append(inputLine);
      }

      return result.toString();
    }
  }
}
