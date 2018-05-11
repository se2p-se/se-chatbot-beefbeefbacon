package de.uni_passau.fim.infosun.se2.chatbot.action;

import java.io.PrintStream;

/**
 * Specifies an {@code Action} that may be run by the bot.
 *
 * <p>Each {@code Action} implements an {@link #accept(String)} and a {@link #run(String,
 * PrintStream)} method.
 *
 * <p>{@link #accept(String)} determines whether the {@code Action} can be applied to the specified
 * input request, {@link #run(String, PrintStream)} executes the {@code Action} and specifies via
 * its {@code return} value whether the conversation is to be continued afterwards.
 */
public interface Action {

  /**
   * Returns whether an input request can be handled by this {@code Action}.
   *
   * @param pRequest Input request
   * @return {@code true} if request can be handled
   */
  boolean accept(final String pRequest);

  /**
   * Runs the {@code Action} on the specified input request. Output is written to the provided
   * {@link PrintStream}.
   *
   * @param pRequest Input request
   * @param pOut {@link PrintStream} used for feedback
   * @return {@code true} if the conversation should continue after {@code Action}
   */
  boolean run(final String pRequest, final PrintStream pOut);
}
