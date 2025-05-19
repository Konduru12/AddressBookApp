package com.example.address.service;

import com.example.address.dto.AddressBookDTO;
import com.example.address.model.AddressBookModel;

import java.util.List;

public interface AddressBookService {
    AddressBookModel addAddress(AddressBookDTO dto);
    List<AddressBookModel> getAll();
    AddressBookModel getById(int id);
    AddressBookModel update(int id, AddressBookDTO dto);
    void delete(int id);
}
