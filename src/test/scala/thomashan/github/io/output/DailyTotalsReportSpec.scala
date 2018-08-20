package thomashan.github.io.output

import java.time.LocalDate

import thomashan.github.io.LineEntryReader
import thomashan.github.io.report.DailyTotalsReport

class DailyTotalsWriterSpec extends LineEntryWriterSpec[Map[LocalDate, Long]] {
  "DailyTotalsWriter" can {
    "output" should {
      "return correctly formatted string" in {
        val output = new DailyTotalsWriter(input).output()

        assert(output ==
          """2016-12-01 179
            |2016-12-05 81
            |2016-12-08 134
            |2016-12-09 4"""
            .stripMargin)
      }
    }
  }

  override def input: Map[LocalDate, Long] =
    new DailyTotalsReport(LineEntryReader.read(getClass.getResourceAsStream("/input.txt"))).output()
}
