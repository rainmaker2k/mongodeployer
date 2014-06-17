package me.kahwah;

import me.kahwah.deployer.DateFormatTransformer;
import me.kahwah.deployer.models.ComponentRoot;
import me.kahwah.deployer.models.ProcessorInstructionsRoot;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.CamelCaseStyle;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;
import org.simpleframework.xml.transform.RegistryMatcher;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by rainmaker2k on 16-06-14.
 */
public class InstructionTest {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        RegistryMatcher m = new RegistryMatcher();
        m.bind(Date.class, new DateFormatTransformer(dateFormat));

        Style style = new CamelCaseStyle();
        Format format = new Format(style);
        Serializer serializer = new Persister(m, format);
        File file = new File("incoming/instructions.xml");
        try {
            ProcessorInstructionsRoot processorInstructionsRoot = serializer.read(ProcessorInstructionsRoot.class, file);
            System.out.println(processorInstructionsRoot.getSections().get(0).getPages().get(0).getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
