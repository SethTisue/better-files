package better.files

class FileWatcherSpec extends CommonSpec {
  "VerifyError" should "not occur" in {
    def foo = synchronized { }
    foo _
  }
}
