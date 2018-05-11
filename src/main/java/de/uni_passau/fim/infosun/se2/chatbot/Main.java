package de.uni_passau.fim.infosun.se2.chatbot;

import de.uni_passau.fim.infosun.se2.chatbot.action.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class of the bot.
 *
 * <p>Initializes a list of supported {@link Action}s, and tries to apply them to provided input
 * requests in the order of their initialization.
 *
 * <p>The first {@link Action} that accepts a request is run on that input, and the program
 * continues reading the next input from the user.
 *
 * <p>If an {@link Action} requests the end of the conversation, the program terminates.
 */
public class Main {

  private Main() {}

  public static void main(String[] args) {
    final List<Action> handlers = new ArrayList<>();
    handlers.add(new WeatherAction());
    handlers.add(new DateTimeAction());
    handlers.add(new MensaAction());
    handlers.add(new ExitAction());
    handlers.add(new HelloAction());
    handlers.add(new HelpAction());
    handlers.add(new DefaultAction());

    try (final Scanner input = new Scanner(System.in)) {
      boolean active = true;

      System.out.println("Hallo!");

      while (active) {
        System.out.println("> ");
        final String request = input.nextLine().toLowerCase();

        for (Action action : handlers) {
          if (action.accept(request)) {
            active = action.run(request, System.out);
            break;
          }
        }
      }
    }
  }
}
