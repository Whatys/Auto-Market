package automarket.controller;

import automarket.model.Transport;
import automarket.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transportDetails")
public class TransportController {
    @Autowired
    private TransportService service;

    @PostMapping("/saveTransport")
    public ResponseEntity<String> saveTransport(@RequestBody Transport transport){
        Integer id = service.saveTransporrt(transport);
        return  new ResponseEntity<String>("Transport with '"+id+"' has been saved", HttpStatus.OK);
    }
    @GetMapping("/transportList")
    public ResponseEntity<List<Transport>> getAllTransportDetails(){
        List<Transport> list = service.getAllTransport();
        return new ResponseEntity<List<Transport>>(list,HttpStatus.OK);
    }
    @GetMapping("/getTransportById/{Id}")
    public ResponseEntity<Transport> getTransportById(@PathVariable("Id") Integer Id){
        Transport transport = service.getTrasnsportById(Id);
        return new ResponseEntity<Transport>(transport,HttpStatus.OK);
    }
    @PutMapping("/updateTransport/{Id}")
    private ResponseEntity<String> updateTransport(@PathVariable("Id") Integer Id,@RequestBody Transport transport){
        Transport transportFromDb = service.getTrasnsportById(Id);
        transportFromDb.setAnulProducerii(transport.getAnulProducerii());
        transportFromDb.setPret(transport.getPret());
        transportFromDb.setKilometraj(transport.getKilometraj());
        transportFromDb.setMarka(transport.getMarka());
        transportFromDb.setModel(transport.getModel());
        transportFromDb.setCutiaDeViteza(transport.getCutiaDeViteza());
        Integer id = service.saveTransporrt(transportFromDb);
        return new ResponseEntity<String>("Transport with '"+id+"' has been update",HttpStatus.OK);
    }
    @DeleteMapping("deleteTransport/{Id}")
    public ResponseEntity<String> deleteTransport(@PathVariable("Id") Integer id){
        service.deleteTransport(id);
        return new ResponseEntity<String>("Transport with '"+id+"'has been delete",HttpStatus.OK);
    }
}
