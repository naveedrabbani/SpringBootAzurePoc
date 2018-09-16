package azurepoc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AzurePocController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello from Naveed's Spring Boot POC for Azure";
    }
}
