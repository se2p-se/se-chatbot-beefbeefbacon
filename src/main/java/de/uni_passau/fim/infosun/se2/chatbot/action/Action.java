package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

public interface Action {

  /**
   * Returns whether an input request can be handled by this {@code Action}.
   *
   * @param pRequest Input request
   * @return {@code true} if request can be handled
   */
  boolean accept(final String pRequest);

  /**
   * Runs the {@code Action} on the specified input request.
   * Output is written to the provided {@link PrintStream}.
   *
   * @param pRequest Input request
   * @param pOut {@link PrintStream} used for feedback
   * @return {@code true} if the conversation should continue after {@code Action}
   */
  boolean run(final String pRequest, final PrintStream pOut);

}
