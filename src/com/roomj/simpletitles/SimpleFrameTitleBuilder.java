package com.roomj.simpletitles;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.impl.FrameTitleBuilder;
import org.jetbrains.annotations.NotNull;

public class SimpleFrameTitleBuilder extends FrameTitleBuilder {
  private static FrameTitleBuilder defaultBuilder;

  public static void setDefaultBuilder(FrameTitleBuilder defaultBuilder) {
    SimpleFrameTitleBuilder.defaultBuilder = defaultBuilder;
  }

  @Override
  public String getProjectTitle(@NotNull Project project) {
    return "";
  }
}