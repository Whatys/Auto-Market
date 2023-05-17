package automarket.service;

import automarket.model.Transport;

import java.util.List;

public interface TransportService {
    public Integer saveTransporrt(Transport transport);
    public List<Transport> getAllTransport();
    public Transport getTrasnsportById(Integer Id);
    public void deleteTransport(Integer Id);
}
