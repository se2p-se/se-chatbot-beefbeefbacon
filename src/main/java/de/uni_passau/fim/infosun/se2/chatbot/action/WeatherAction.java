package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

/**
 * Accepts keywords that indicate inquiries about the weather forecast.
 *
 * <p>TODO Respond with current information retrieved from a suitable online service.
 */
public class WeatherAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("wetter") || pRequest.contains("temperatur");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    pOut.println("Der Wetterfrosch ist heute leider krank :(");
    return true;
  }
}
