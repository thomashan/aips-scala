package thomashan.github.io.report

class LeastCarsIn3WindowReportSpec extends ReportSpec {
  "LeastCarsIn3WindowReport" can {
    "output" should {
      "return correct count for each day" in {
        val windowEntries = new LeastCarsIn3WindowReport().output(entries)

        assert(windowEntries.size == 3)
        assert(windowEntries.map(_.count).sum == 20)
      }
    }
  }
}
