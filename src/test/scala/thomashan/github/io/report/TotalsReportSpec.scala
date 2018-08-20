package thomashan.github.io.report

class TotalsReportSpec extends ReportSpec {
  "TotalsReport" can {
    "output" should {
      "return correct totals" in {
        assert(new TotalsReport().output(entries) == 398)
      }
    }
  }
}
