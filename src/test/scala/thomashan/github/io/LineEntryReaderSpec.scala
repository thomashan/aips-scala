package thomashan.github.io

import org.scalatest.WordSpec

class LineEntryReaderSpec extends WordSpec {
  "LineEntryReader" can {
    "read" should {
      "return all elements" in {
        val inputStream = getClass.getResourceAsStream("/input.txt")
        val result = LineEntryReader.read(inputStream).toList

        assert(result.size == 24)
      }
    }
  }
}
