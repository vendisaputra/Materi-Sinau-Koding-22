package com.sinaukoding.tokosinau.repository;

import com.sinaukoding.tokosinau.entity.Pembayaran;
import com.sinaukoding.tokosinau.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {
}
