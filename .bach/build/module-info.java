import com.github.sormuras.bach.project.ProjectInfo;
import com.github.sormuras.bach.project.ProjectInfo.ExternalModules;
import com.github.sormuras.bach.project.ProjectInfo.ExternalModules.Link;

@ProjectInfo(
    name = "bach-purejin",
    externalModules =
        @ExternalModules(
            links = {
              @Link(
                  module = "se.jbee.inject.lang",
                  to =
                      "https://github.com/jbee/purejin/releases/download/early-access/se.jbee.inject.lang@8-ea.jar")
            }
        )
)
module build {
  requires com.github.sormuras.bach;
}
