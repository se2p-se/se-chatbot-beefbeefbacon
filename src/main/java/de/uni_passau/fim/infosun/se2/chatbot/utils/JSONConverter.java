package de.uni_passau.fim.infosun.se2.chatbot.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.security.InvalidParameterException;
import java.util.ArrayList;

/**
 * Provides a static method to retrieve a special element of a given JSON string.
 *
 * <p>Note that the library JSON.simple is used to fulfill this task.
 */
public class JSONConverter {

  /**
   * Returns the content of the specified elements by recursively parsing the given JSON string.
   *
   * <p>The list of keys has to be non-empty. Otherwise an exception is thrown.
   *
   * @param pJSON the JSON string to parse
   * @param pKeys the keys of the JSON string. Add more than one key to recursively parse the JSON
   *     string
   * @return the content of the element as a string
   * @throws ParseException if the given string cannot be parsed
   */
  public static String getContentOfElement(final String pJSON, final ArrayList<String> pKeys)
      throws ParseException {
    // throw an exception if there is no key
    if (pKeys == null || pKeys.isEmpty()) {
      throw new InvalidParameterException("pKeys must be an non-empty list.");
    }

    final JSONParser parser = new JSONParser();

    final String currentKey = pKeys.remove(0);
    final JSONObject obj = (JSONObject) parser.parse(pJSON);

    if (pKeys.isEmpty()) {
      return obj.get(currentKey).toString();
    } else {
      return getContentOfElement(obj.get(currentKey).toString(), pKeys);
    }
  }
}
