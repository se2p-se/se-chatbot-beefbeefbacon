package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/** Provides an {@link Action} to get information about date and time. */
public class DateTimeAction implements Action {

  /** {@inheritDoc} */
  @Override
  public boolean accept(final String pRequest) {
    return pRequest.contains("zeit")
        || pRequest.contains("datum")
        || pRequest.contains("spät")
        || pRequest.contains("uhr")
        || pRequest.contains("tag");
  }

  /** {@inheritDoc} */
  @Override
  public boolean run(final String pRequest, final PrintStream pOut) {
    final DateFormat dateFormat =
        new SimpleDateFormat("EEEE, 'der' dd.MM.yyyy. 'Es ist' HH:mm 'Uhr.'");
    pOut.format("Heute ist %s\n", dateFormat.format(Calendar.getInstance().getTime()));
    return true;
  }
}
