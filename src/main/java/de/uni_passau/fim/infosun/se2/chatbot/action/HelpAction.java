package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

/**
 * Accepts keywords that request assistance, and responds with a respective message.
 *
 * <p>TODO Offer some kind of hints w.r.t. which actions are currently supported.
 */
public class HelpAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("hilf");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Womit kann ich Ihnen behilflich sein?");
    return true;
  }
}
