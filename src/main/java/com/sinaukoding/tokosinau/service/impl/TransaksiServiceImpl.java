package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Transaksi;
import com.sinaukoding.tokosinau.entity.dto.TransaksiDTO;
import com.sinaukoding.tokosinau.entity.mapping.TransaksiMapping;
import com.sinaukoding.tokosinau.repository.TransaksiRepository;
import com.sinaukoding.tokosinau.service.TransaksiService;
import com.sinaukoding.tokosinau.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaksiServiceImpl implements TransaksiService {
    @Autowired
    private TransaksiRepository repository;

    @Override
    public TransaksiDTO save(TransaksiDTO param) {
        Transaksi data = repository.save(TransaksiMapping.instance.toEntity(param));
        return TransaksiMapping.instance.toDto(data);
    }

    @Override
    public List<TransaksiDTO> findAllData() {
        return TransaksiMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public TransaksiDTO update(TransaksiDTO param, Long id) {
        Transaksi data = repository.findById(id).orElse(null);

        if (data != null) {
//            data.setNamaTransaksi(param.getNamaTransaksi() == null ? data.getNamaTransaksi() : param.getNamaTransaksi());
//            data.setTelp(param.getTelp() != null ? param.getTelp() : data.getTelp());
//            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return TransaksiMapping.instance.toDto(repository.save(data));
        }

        return TransaksiMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Transaksi data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public TransaksiDTO findById(Long id) {
        return TransaksiMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}
