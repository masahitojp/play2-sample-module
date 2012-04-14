package com.github.masahitojp.play2.plugin

import play.api._

class SamplePlugin(val app: Application) extends Plugin {
  val name = "sample"

  override def onStart() {
    Logger.info("sample on start")
  }

  override def onStop() {
    Logger.info("sample on end")
  }

  override def enabled() = !app.configuration.getString("SamplePlugin")
      .filter(_ == "disabled").isDefined
}
