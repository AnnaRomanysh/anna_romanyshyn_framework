package parsers;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XMLParser {
    private Object obj;

    public Object parseTo(String filePath, Object object) {
        try {
            File file = new File(filePath);

            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            object = (Object) jaxbUnmarshaller.unmarshal(file);


        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println(object);
        return object;
    }

}
