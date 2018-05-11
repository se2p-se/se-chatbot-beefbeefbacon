package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

public class HelpAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("hilfe");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Womit kann ich Ihnen behilflich sein?");
    return true;
  }
}
