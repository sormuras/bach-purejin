import com.github.sormuras.bach.project.ProjectInfo;
import com.github.sormuras.bach.project.ProjectInfo.Link;

@ProjectInfo(
    links = {
      @Link(
          module = "se.jbee.inject.lang",
          to = "https://github.com/jbee/purejin/releases/download/early-access/se.jbee.inject.lang@8-ea.jar")
    },
    tests = "tests/module-info.java"
)
module build {
  requires com.github.sormuras.bach;
}
