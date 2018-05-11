package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

/** An {@link Action} that can be used for unknown commands. */
public class DefaultAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Hm…, interessant.");
    return true;
  }
}
