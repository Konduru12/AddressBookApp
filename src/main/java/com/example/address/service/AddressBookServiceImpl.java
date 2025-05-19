package com.example.address.service;

import com.example.address.dto.AddressBookDTO;
import com.example.address.model.AddressBookModel;
import com.example.address.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    private Repository repository;

    @Override
    public AddressBookModel addAddress(AddressBookDTO dto) {
        AddressBookModel ab = new AddressBookModel();
        ab.setName(dto.getName());
        ab.setAddress(dto.getAddress());
        return repository.save(ab);
    }

    @Override
    public List<AddressBookModel> getAll() {
        return repository.findAll();
    }

    @Override
    public AddressBookModel getById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public AddressBookModel update(int id, AddressBookDTO dto) {
        AddressBookModel ab = getById(id);
        ab.setName(dto.getName());
        ab.setAddress(dto.getAddress());
        return repository.save(ab);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
