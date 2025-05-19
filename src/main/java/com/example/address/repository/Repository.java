package com.example.address.repository;

import com.example.address.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<AddressBookModel, Integer> {
}
