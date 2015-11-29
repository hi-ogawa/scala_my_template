package net.hiogawa.my_package

import org.specs2.mutable._

class MainTest extends Specification {
  "Main" >> {
    ".testString" >> {
      Main.testString must contain("my package")
    }
  }
}
