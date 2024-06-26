package com.example.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    Optional<Contact> findFirstByPhoneNumber(String phoneNumber);
    Optional<Contact> findFirstByEmail(String email);
    List<Contact> findAllByLinkedIdOrId(Integer linkedId, Integer id);
}
