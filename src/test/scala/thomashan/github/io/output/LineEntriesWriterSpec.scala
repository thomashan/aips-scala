package thomashan.github.io.output

import thomashan.github.io.report.Top3Report
import thomashan.github.io.{LineEntry, LineEntryReader}

class LineEntriesWriterSpec extends LineEntryWriterSpec[Seq[LineEntry]] {
  "LineEntriesWriter" can {
    "output" should {
      "return correctly formatted string" in {
        val output = new LineEntriesWriter(input).output()

        assert(output ==
          """2016-12-01T07:30:00 46
            |2016-12-01T08:00:00 42
            |2016-12-08T18:00:00 33"""
            .stripMargin)
      }
    }
  }

  override def input: Seq[LineEntry] =
    new Top3Report(LineEntryReader.read(getClass.getResourceAsStream("/input.txt"))).output()
}
