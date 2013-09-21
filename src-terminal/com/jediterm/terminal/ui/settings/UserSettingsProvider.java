package com.jediterm.terminal.ui.settings;

import com.jediterm.terminal.TextStyle;
import com.jediterm.terminal.TtyConnector;
import com.jediterm.terminal.emulator.ColorPalette;

import java.awt.*;

public interface UserSettingsProvider {
  ColorPalette getTerminalColorPalette();

  Font getTerminalFont();

  float getTerminalFontSize();

  float getLineSpace();

  TextStyle getDefaultStyle();

  TextStyle getSelectionColor();

  boolean useInverseSelectionColor();

  public boolean emulateX11CopyPaste();

  boolean useAntialiasing();

  boolean shouldCloseTabOnLogout(TtyConnector ttyConnector);

  boolean drawCharsInCells();
}