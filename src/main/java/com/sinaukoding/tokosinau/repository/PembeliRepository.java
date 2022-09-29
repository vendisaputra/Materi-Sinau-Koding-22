package com.sinaukoding.tokosinau.repository;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PembeliRepository extends JpaRepository<Pembeli, Long> {
}
