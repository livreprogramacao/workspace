package com.securesoftwaredev.behavior.drivendevelopment;

import java.io.File;
import java.net.URI;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.security.auth.login.Configuration;
import org.junit.runner.RunWith;

@RunWith(AnnotatedEmbedderRunner.class)
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories = true,
        ignoreFailureInStories = true, ignoreFailureInView = false,
        verboseFailures = true)
@UsingSteps(instances = {NgisRestSteps.class})
public class StoriesTest extends JUnitStories {

    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(
                CodeLocations.codeLocationFromClass(getClass()).getFile(),
                Arrays.asList(getStoryFilter(storyPaths)), null);
    }

    private String getStoryFilter(String storyPaths) {
        if (storyPaths == null) {
            return "*.story";
        }
        if (storyPaths.endsWith(".story")) {
            return storyPaths;
        }
        return storyPaths + ".story";
    }

    private List<String> specifiedStoryPaths(String storyPaths) {
        List<String> result = new ArrayList<String>();
        URI cwd = new File("src/test/resources").toURI();
        for (String storyPath : storyPaths.split(File.pathSeparator)) {
            File storyFile = new File(storyPath);
            if (!storyFile.exists()) {
                throw new IllegalArgumentException("Story file not found: "
                        + storyPath);
            }
            result.add(cwd.relativize(storyFile.toURI()).toString());
        }
        return result;
    }

    @Override
    public Configuration configuration() {
        return super.configuration()
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withFormats(Format.XML, Format.STATS, Format.CONSOLE)
                        .withRelativeDirectory("../build/jbehave")
                )
                .usePendingStepStrategy(new FailingUponPendingStep())
                .useFailureStrategy(new SilentlyAbsorbingFailure());
    }

}
