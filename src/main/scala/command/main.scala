package command

import wvlet.airframe.launcher.{Launcher, command, option}

class Hello(
    @option(
      prefix = "-h,--help",
      description = "show help message",
      isHelp = true
    )
    displayHelp: Boolean
) {

  @command(isDefault = true)
  def default(): Unit = {
    println(s"Hello World!")
  }
}

object Main extends App {
  Launcher.execute[Hello](args)
}
