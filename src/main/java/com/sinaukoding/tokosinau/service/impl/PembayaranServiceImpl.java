package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Pembayaran;
import com.sinaukoding.tokosinau.entity.dto.PembayaranDTO;
import com.sinaukoding.tokosinau.entity.dto.PembayaranDTO;
import com.sinaukoding.tokosinau.entity.mapping.PembayaranMapping;
import com.sinaukoding.tokosinau.entity.mapping.PembayaranMapping;
import com.sinaukoding.tokosinau.repository.PembayaranRepository;
import com.sinaukoding.tokosinau.service.PembayaranService;
import com.sinaukoding.tokosinau.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembayaranServiceImpl implements PembayaranService {
    @Autowired
    private PembayaranRepository repository;

    @Override
    public PembayaranDTO save(PembayaranDTO param) {
        Pembayaran data = repository.save(PembayaranMapping.instance.toEntity(param));
        return PembayaranMapping.instance.toDto(data);
    }

    @Override
    public List<PembayaranDTO> findAllData() {
        return PembayaranMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public PembayaranDTO update(PembayaranDTO param, Long id) {
        Pembayaran data = repository.findById(id).orElse(null);

        if (data != null) {
//            data.setNamaPembayaran(param.getNamaPembayaran() == null ? data.getNamaPembayaran() : param.getNamaPembayaran());
//            data.setTelp(param.getTelp() != null ? param.getTelp() : data.getTelp());
//            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return PembayaranMapping.instance.toDto(repository.save(data));
        }

        return PembayaranMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Pembayaran data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PembayaranDTO findById(Long id) {
        return PembayaranMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
