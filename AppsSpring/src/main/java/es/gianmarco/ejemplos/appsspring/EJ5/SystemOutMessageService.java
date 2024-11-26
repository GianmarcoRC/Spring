package es.gianmarco.ejemplos.appsspring.EJ5;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SystemOutMessageService implements MessageService{
    @Override
    public void showMessage(String message) {
        System.out.println("SystemOut"+message);
    }
}
