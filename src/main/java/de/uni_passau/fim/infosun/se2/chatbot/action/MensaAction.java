package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;
import java.util.Calendar;

/** Provides {@link Action}s for the Mensa. */
public class MensaAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("hunger") || pRequest.contains("mensa") || pRequest.contains("essen");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    final int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

    if (hour >= 11 && hour <= 14) {
      pOut.println("Schau doch mal auf https://stwno.de/de/gastronomie/speiseplan/uni-passau");
    } else {
      pOut.println("Sowas Dummes… die Mensa hat leider zu :(");
    }

    return false;
  }
}
