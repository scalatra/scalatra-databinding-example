package org.scalatra.example.commands.models

import java.util.concurrent.atomic.AtomicInteger

/** A Todo object to use as a data model */
object Todo {
  /** A counter variable to fake out auto-incrementing keys for us **/
  val idCounter = new AtomicInteger(3)
}
case class Todo(name: String, id: Integer = Todo.idCounter.incrementAndGet(), done: Boolean = false)