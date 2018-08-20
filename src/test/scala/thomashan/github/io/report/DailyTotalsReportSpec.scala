package thomashan.github.io.report

import java.time.LocalDate

class DailyTotalsReportSpec extends ReportSpec {
  "DailyTotalsReport" can {
    "output" should {
      "return correct count for each day" in {
        val dailyTotals = new DailyTotalsReport().output(entries)
        assert(dailyTotals.size == 4)
        assert(dailyTotals(LocalDate.of(2016, 12, 1)) == 179)
        assert(dailyTotals(LocalDate.of(2016, 12, 5)) == 81)
        assert(dailyTotals(LocalDate.of(2016, 12, 8)) == 134)
        assert(dailyTotals(LocalDate.of(2016, 12, 9)) == 4)
      }
    }
  }
}
