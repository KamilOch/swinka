package it.morfoza;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiggyServiceImpl implements PiggyService {

    private PiggyRepository repository;

    public PiggyServiceImpl(PiggyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PiggyBank> getByCity(String City) {
        return repository.getByCity(City);
    }

    @Override
    public List<PiggyBank> getAll() {
        return repository.getAllEvents();
    }

    @Override
    public PiggyBank getById(long id) {
        return repository.getById(id);
    }

    @Override
    public long add(PiggyBank piggyBank) {
        return repository.add(piggyBank);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }

    @Override
    public void pay(long id, long amount) {
        PiggyBank piggyBank = repository.getById(id);
        piggyBank.payIn(new Money(amount));
    }
}
