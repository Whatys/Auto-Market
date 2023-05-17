package automarket.service;

import automarket.model.Transport;
import automarket.repos.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService{
    @Autowired
    private TransportRepository repository;

    @Override
    public Integer saveTransporrt(Transport transport) {
        return repository.save(transport).getId();
    }

    @Override
    public List<Transport> getAllTransport() {
        return (List<Transport>) repository.findAll();
    }

    @Override
    public Transport getTrasnsportById(Integer Id) {
        return repository.findById(Id).get();
    }

    @Override
    public void deleteTransport(Integer Id) {
        repository.deleteById(Id);
    }
}
