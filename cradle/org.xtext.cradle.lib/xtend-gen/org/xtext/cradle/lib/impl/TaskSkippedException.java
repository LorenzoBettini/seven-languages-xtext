package org.xtext.cradle.lib.impl;

@SuppressWarnings("all")
public class TaskSkippedException extends RuntimeException {
  public TaskSkippedException() {
  }
  
  public TaskSkippedException(final String message) {
    super(message);
  }
}
