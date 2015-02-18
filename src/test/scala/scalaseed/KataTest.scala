package scalaseed

import org.scalatest.FlatSpec

class PersonSpec extends FlatSpec {

  "A person" should "always say 'Hello!'" in {
    val p = new Person()
    assert(p.greet() == "Hello!")
  }

}
