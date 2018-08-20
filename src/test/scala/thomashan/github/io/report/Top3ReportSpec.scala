package thomashan.github.io.report

class Top3ReportSpec extends ReportSpec {
  "Top3Report" can {
    "output" should {
      "return correct top 3 rows" in {
        val top3 = new Top3Report(entries).output()

        assert(top3.size == 3)
        assert(top3(0).count == 46)
        assert(top3(1).count == 42)
        assert(top3(2).count == 33)
      }
    }
  }
}
