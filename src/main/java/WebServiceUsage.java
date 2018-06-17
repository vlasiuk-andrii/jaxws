import com.aonaware.services.webservices.ArrayOfDictionary;
import com.aonaware.services.webservices.DictService;
import com.aonaware.services.webservices.DictServiceSoap;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Arrays;

public class WebServiceUsage {

    public static void main(String[] args) {

        DictService service = new DictService();
        DictServiceSoap port = service.getDictServiceSoap();

        ArrayOfDictionary arrayOfDictionary = port.dictionaryList();

        System.out.println(arrayOfDictionary.getDictionary().get(0).getId() );
        System.out.println(arrayOfDictionary.getDictionary().get(0).getName() );

    }
}