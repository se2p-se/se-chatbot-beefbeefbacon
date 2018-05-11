package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

public class WeatherAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("wetter");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Der Wetterfrosch ist heute leider krank :(");
    return true;
  }
}
