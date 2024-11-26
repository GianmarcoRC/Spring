package es.gianmarco.ejemplos.appsspring.Ej6;

import es.gianmarco.ejemplos.appsspring.EJ5.MessageService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SystemErrMessageService implements MessageService {
    @Override
    public void showMessage(String message) {

        System.err.println("SystemErr" + message);
    }
}
