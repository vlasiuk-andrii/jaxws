import com.aonaware.services.webservices.ArrayOfDictionary;
import com.aonaware.services.webservices.DictService;
import com.aonaware.services.webservices.DictServiceSoap;
import org.testng.annotations.Test;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class SimpleTests {

    DictService service = new DictService();
    DictServiceSoap port = service.getDictServiceSoap();

    private DictionaryDTO dictionaryDTO = new DictionaryDTO();

    @Test
    public void responseCodeTest(){
        int responseCode;
        try {
            port.serverInfo();
        } catch(Exception e) {
            e.getStackTrace();
        } finally {
            responseCode = (Integer)((BindingProvider) port).getResponseContext().get(MessageContext.HTTP_RESPONSE_CODE);
        }
        assertEquals(200, responseCode);
    }

    @Test
    public void serverInfoTest(){
        assertEquals(Data.defaultServerInfo, port.serverInfo());
    }

    @Test
    public void dictinaryInfoTest(){
        assertEquals(Data.hitchcockDictResponse, port.dictionaryInfo("hitchcock"));
    }

    @Test
    public void dictinaryListTest(){
        ArrayOfDictionary arrayOfDictionary = port.dictionaryList();
        Map<String, String> mapOfDictionary = new HashMap<String, String>();
        for(int i=0; i < arrayOfDictionary.getDictionary().size(); i++){
             mapOfDictionary.put(
                    arrayOfDictionary.getDictionary().get(i).getId(),
                    arrayOfDictionary.getDictionary().get(i).getName());
        }
        dictionaryDTO.setDictionaries(mapOfDictionary);
        assertEquals(Data.getCorrectDictionaries(), dictionaryDTO.getDictionaries());
    }
}
