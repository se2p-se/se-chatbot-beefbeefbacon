package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

/** An {@link Action} that terminates the chat-bot execution. */
public class ExitAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("wiedersehen")
        || pRequest.contains("exit")
        || pRequest.contains("quit")
        || pRequest.contains("servus")
        || pRequest.contains("tschüss");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Auf Wiedersehen!");
    return false;
  }
}
