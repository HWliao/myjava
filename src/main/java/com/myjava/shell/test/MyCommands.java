package com.myjava.shell.test;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * 测试命令行
 *
 * @author lhw
 * @date 2018/7/17
 */
@ShellComponent
public class MyCommands {
  @ShellMethod("Add two integers together.")
  public int add(int a, int b) {
    return a + b + 1;
  }
}
