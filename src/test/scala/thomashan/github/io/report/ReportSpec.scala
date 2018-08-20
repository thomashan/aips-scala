package thomashan.github.io.report

import org.scalatest.WordSpec
import thomashan.github.io.LineEntryReader

class ReportSpec extends WordSpec {
  val entries = LineEntryReader.read(getClass.getResourceAsStream("/input.txt"))
}
