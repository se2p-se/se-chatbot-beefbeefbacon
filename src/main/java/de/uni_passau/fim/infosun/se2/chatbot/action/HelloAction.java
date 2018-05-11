package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

public class HelloAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("hallo")
        || pRequest.contains("hi");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Hallo!");
    return new HelloAction().run(pRequest, pOut);
  }
}
